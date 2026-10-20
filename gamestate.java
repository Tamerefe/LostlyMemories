import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// Shared state for one playthrough: memory fragments, bonds, and the endings gallery.
public class gamestate {
        public static final int TOTAL_FRAGMENTS = 10;
        public static final int TRUE_ENDING_FRAGMENTS = 5;
        static final String ENDINGS_FILE = "lostly_endings.txt";

        // Ending id -> { English name, Turkish name }
        static final String[][] ENDINGS = {
                        { "second_wedding", "Falling Twice", "İki Kez Aşık Olmak" },
                        { "quiet_wedding", "Family First", "Aile Öncelikli" },
                        { "fresh_start", "New Horizons", "Yeni Ufuklar" },
                        { "roots", "Roots Run Deep", "Kökler Derindir" },
                        { "letting_go", "Letting Go", "Bırakmak" },
                        { "memories_restored", "Memories Restored", "Geri Dönen Anılar" },
                        { "quiet_song", "The Quiet Song", "Sessiz Şarkı" },
        };

        static boolean turkish;
        static Map<String, String> fragments = new LinkedHashMap<>();
        static int elenaBond;
        static int sophieBond;
        static boolean melodyPlayed;

        public static void reset(boolean isTurkish) {
                turkish = isTurkish;
                fragments.clear();
                elenaBond = 0;
                sophieBond = 0;
                melodyPlayed = false;
        }

        public static String tr(String english, String turkishText) {
                return turkish ? turkishText : english;
        }

        // Reads a menu choice. 'j'/'g' opens the journal, 'q' quits, anything non-numeric is -1.
        public static int readChoice(Scanner scanner) {
                while (true) {
                        if (!scanner.hasNextLine()) {
                                quit();
                        }
                        String line = scanner.nextLine().trim();
                        String lower = line.toLowerCase(Locale.ROOT);
                        if (lower.equals("j") || lower.equals("g")) {
                                showJournal();
                                System.out.print(">> ");
                                continue;
                        }
                        if (lower.equals("q")) {
                                quit();
                        }
                        try {
                                return Integer.parseInt(line);
                        } catch (NumberFormatException e) {
                                return -1;
                        }
                }
        }

        static void quit() {
                System.out.println("\n\033[1;35m" + tr("The music box falls silent. Until next time...",
                                "Müzik kutusu susuyor. Bir dahaki sefere kadar...") + "\033[0m");
                System.exit(0);
        }

        public static void printTips() {
                System.out.println("\033[0;37m" + tr(
                                "(Tip: type 'j' at any choice to open your memory journal, 'q' to quit.)",
                                "(İpucu: anı günlüğünü açmak için herhangi bir seçimde 'g', çıkmak için 'q' yazın.)")
                                + "\033[0m");
        }

        public static void awardFragment(String id, String englishTitle, String turkishTitle) {
                if (fragments.containsKey(id)) {
                        return;
                }
                fragments.put(id, tr(englishTitle, turkishTitle));
                System.out.println("\033[1;36m  ✦ " + tr("Memory fragment recovered: ", "Anı parçası bulundu: ")
                                + fragments.get(id) + " (" + fragments.size() + "/" + TOTAL_FRAGMENTS + ")\033[0m");
        }

        public static boolean hasFragment(String id) {
                return fragments.containsKey(id);
        }

        public static void addElenaBond(int amount) {
                elenaBond += amount;
                System.out.println("\033[0;35m  ♥ " + tr("Your bond with Elena grows.", "Elena ile bağınız güçleniyor.")
                                + "\033[0m");
        }

        public static void addSophieBond(int amount) {
                sophieBond += amount;
                System.out.println("\033[0;35m  ♥ " + tr("Your bond with Sophie grows.", "Sophie ile bağınız güçleniyor.")
                                + "\033[0m");
        }

        public static void showJournal() {
                System.out.println("\n\033[1;34m~~~ " + tr("Memory Journal", "Anı Günlüğü") + " ~~~\033[0m");
                if (fragments.isEmpty()) {
                        System.out.println("\033[0;37m  " + tr("The pages are still blank...", "Sayfalar hâlâ boş...")
                                        + "\033[0m");
                }
                for (String title : fragments.values()) {
                        System.out.println("\033[1;36m  ✦ " + title + "\033[0m");
                }
                System.out.println("\033[1;34m  " + tr("Fragments", "Parçalar") + ": " + fragments.size() + "/"
                                + TOTAL_FRAGMENTS + "   Elena: " + hearts(elenaBond) + "   Sophie: "
                                + hearts(sophieBond) + "\033[0m");
                System.out.println("\033[1;34m~~~~~~~~~~~~~~~~~~~~~~\033[0m");
        }

        static String hearts(int bond) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < Math.min(bond, 5); i++) {
                        sb.append('♥');
                }
                return sb.length() == 0 ? "-" : sb.toString();
        }

        // Records an ending, saves it to the gallery file and prints the run summary.
        public static void unlockEnding(String id) {
                Set<String> unlocked = loadEndings();
                boolean isNew = unlocked.add(id);
                saveEndings(unlocked);

                System.out.println("\n\033[1;34m========================================\033[0m");
                if (isNew) {
                        System.out.println("\033[1;33m  " + tr("New ending discovered: ", "Yeni son keşfedildi: ")
                                        + endingName(id) + "\033[0m");
                } else {
                        System.out.println("\033[1;33m  " + tr("Ending: ", "Son: ") + endingName(id) + "\033[0m");
                }
                System.out.println("\033[1;34m  " + tr("Endings found", "Bulunan sonlar") + ": " + unlocked.size() + "/"
                                + ENDINGS.length + "\033[0m");
                System.out.println("\033[1;34m  " + tr("Memory fragments", "Anı parçaları") + ": " + fragments.size()
                                + "/" + TOTAL_FRAGMENTS + "\033[0m");
                System.out.println("\033[1;34m  Elena: " + hearts(elenaBond) + "   Sophie: " + hearts(sophieBond)
                                + "\033[0m");
                System.out.println("\033[1;35m  " + tr("Title", "Unvan") + ": " + rank() + "\033[0m");
                if (fragments.size() < TRUE_ENDING_FRAGMENTS && !unlocked.contains("memories_restored")) {
                        System.out.println("\033[0;37m  " + tr(
                                        "Hint: recover " + TRUE_ENDING_FRAGMENTS
                                                        + " memory fragments to hear the music box's last song...",
                                        "İpucu: müzik kutusunun son şarkısını duymak için " + TRUE_ENDING_FRAGMENTS
                                                        + " anı parçası toplayın...")
                                        + "\033[0m");
                }
                System.out.println("\033[1;34m========================================\033[0m");
        }

        static String rank() {
                int score = fragments.size() + elenaBond + sophieBond;
                if (score >= 14) {
                        return tr("Keeper of Memories", "Anıların Bekçisi");
                } else if (score >= 9) {
                        return tr("Devoted Heart", "Sadık Kalp");
                } else if (score >= 5) {
                        return tr("Wandering Soul", "Gezgin Ruh");
                }
                return tr("Stranger to Yourself", "Kendine Yabancı");
        }

        static String endingName(String id) {
                for (String[] ending : ENDINGS) {
                        if (ending[0].equals(id)) {
                                return turkish ? ending[2] : ending[1];
                        }
                }
                return id;
        }

        public static void showEndingsGallery() {
                Set<String> unlocked = loadEndings();
                System.out.println("\n\033[1;34m=== Endings / Sonlar (" + unlocked.size() + "/" + ENDINGS.length
                                + ") ===\033[0m");
                for (String[] ending : ENDINGS) {
                        if (unlocked.contains(ending[0])) {
                                System.out.println("\033[1;32m  ✦ " + ending[1] + " / " + ending[2] + "\033[0m");
                        } else {
                                System.out.println("\033[0;37m  ? ??? \033[0m");
                        }
                }
        }

        static Set<String> loadEndings() {
                Set<String> unlocked = new LinkedHashSet<>();
                try (BufferedReader reader = new BufferedReader(new FileReader(ENDINGS_FILE))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                                if (!line.trim().isEmpty()) {
                                        unlocked.add(line.trim());
                                }
                        }
                } catch (IOException e) {
                        // No gallery yet
                }
                return unlocked;
        }

        static void saveEndings(Set<String> unlocked) {
                try (PrintWriter writer = new PrintWriter(new FileWriter(ENDINGS_FILE))) {
                        for (String id : unlocked) {
                                writer.println(id);
                        }
                } catch (IOException e) {
                        // Gallery is optional; keep playing
                }
        }
}
