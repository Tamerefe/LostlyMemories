import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

// Mini-games woven into the story. Text follows gamestate's chosen language.
public class minigames {
        static Random random = new Random();

        static void pause(int millis) {
                try {
                        Thread.sleep(millis);
                } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                }
        }

        // The music box plays a short melody; the player must repeat it from memory.
        public static boolean melodyPuzzle(Scanner scanner) {
                String[] notes = { "C", "D", "E", "F", "G", "A", "B" };
                StringBuilder melody = new StringBuilder();
                for (int i = 0; i < 5; i++) {
                        melody.append(notes[random.nextInt(notes.length)]);
                }

                System.out.println("\n\033[1;34m♪ " + gamestate.tr("The Melody", "Melodi") + " ♪\033[0m");
                System.out.println("\033[1;32m" + gamestate.tr(
                                "The cylinder turns slowly. Each note tugs at something buried deep inside you.",
                                "Silindir yavaşça dönüyor. Her nota içinizde derinlere gömülü bir şeyi çekiştiriyor.")
                                + "\033[0m");
                System.out.println("\033[1;33m" + gamestate.tr(
                                "Listen closely, then hum it back. (Press Enter when ready)",
                                "Dikkatle dinleyin, sonra geri mırıldanın. (Hazır olunca Enter'a basın)") + "\033[0m");
                scanner.nextLine();

                for (int attempt = 1; attempt <= 2; attempt++) {
                        System.out.print("\033[1;36m  ");
                        for (int i = 0; i < melody.length(); i++) {
                                System.out.print("♪" + melody.charAt(i) + "  ");
                                System.out.flush();
                                pause(700);
                        }
                        System.out.print("\033[0m");
                        pause(1200);
                        // Wipe the notes so the player has to remember them
                        System.out.print("\r\033[2K");
                        System.out.println("\033[0;37m  " + gamestate.tr("...the notes fade into silence.",
                                        "...notalar sessizliğe karışıyor.") + "\033[0m");

                        System.out.println("\033[1;33m" + gamestate.tr(
                                        "Type the 5 notes you heard (e.g. C E G A D):",
                                        "Duyduğunuz 5 notayı yazın (örn. C E G A D):") + "\033[0m");
                        System.out.print(">> ");
                        String answer = scanner.hasNextLine() ? scanner.nextLine() : "";
                        answer = answer.replaceAll("[^A-Za-z]", "").toUpperCase(Locale.ROOT);

                        if (answer.equals(melody.toString())) {
                                System.out.println("\033[1;32m" + gamestate.tr(
                                                "Your voice finds every note. For a heartbeat, you hear a woman humming along with you.",
                                                "Sesiniz her notayı buluyor. Bir anlığına, sizinle birlikte mırıldanan bir kadın sesi duyuyorsunuz.")
                                                + "\033[0m");
                                return true;
                        }
                        if (attempt == 1) {
                                System.out.println("\033[1;31m" + gamestate.tr(
                                                "The melody slips away. The box winds itself once more...",
                                                "Melodi kayıp gidiyor. Kutu kendiliğinden bir kez daha kuruluyor...")
                                                + "\033[0m");
                        }
                }
                System.out.println("\033[1;31m" + gamestate.tr("The song was " + spaced(melody)
                                + ". It feels important, but it won't stay with you.",
                                "Şarkı " + spaced(melody) + " idi. Önemli hissettiriyor ama aklınızda kalmıyor.")
                                + "\033[0m");
                return false;
        }

        static String spaced(CharSequence melody) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < melody.length(); i++) {
                        if (i > 0) {
                                sb.append(' ');
                        }
                        sb.append(melody.charAt(i));
                }
                return sb.toString();
        }

        // Best of three Rock, Paper, Scissors against Sophie.
        public static boolean rockPaperScissorsWithSophie(Scanner scanner) {
                String[] rps = { "Rock", "Paper", "Scissors" };
                String[] rpsTr = { "Taş", "Kağıt", "Makas" };
                int wins = 0;
                int losses = 0;

                System.out.println("\n\033[1;34m✊✋✌ " + gamestate.tr("Rock, Paper, Scissors with Sophie",
                                "Sophie ile Taş, Kağıt, Makas") + "\033[0m");
                System.out.println("\033[1;33m" + gamestate.tr(
                                "'Best of three, Daddy! Loser makes pancakes!'",
                                "'Üç turdan iki, baba! Kaybeden pankek yapar!'") + "\033[0m");

                while (wins < 2 && losses < 2) {
                        System.out.print(gamestate.tr("Enter move (Rock(r), Paper(p), Scissors(s)): ",
                                        "Hamlenizi girin (Taş(t), Kağıt(k), Makas(m)): "));
                        String move = scanner.hasNextLine() ? scanner.nextLine().trim().toLowerCase(Locale.ROOT) : "r";
                        int player;
                        switch (move) {
                                case "r":
                                case "t":
                                        player = 0;
                                        break;
                                case "p":
                                case "k":
                                        player = 1;
                                        break;
                                case "s":
                                case "m":
                                        player = 2;
                                        break;
                                default:
                                        System.out.println(gamestate.tr("Invalid move, please try again.",
                                                        "Geçersiz hamle, tekrar deneyin."));
                                        continue;
                        }
                        int sophie = random.nextInt(3);
                        String[] names = gamestate.turkish ? rpsTr : rps;
                        System.out.println(gamestate.tr("Your move: ", "Hamleniz: ") + names[player] + "  |  Sophie: "
                                        + names[sophie]);

                        if (player == sophie) {
                                System.out.println("\033[1;33m" + gamestate.tr("'Again! Again!'", "'Bir daha! Bir daha!'")
                                                + "\033[0m");
                        } else if ((player + 3 - sophie) % 3 == 1) {
                                wins++;
                                System.out.println("\033[1;32m" + gamestate.tr(
                                                "You win the round. Sophie pouts dramatically.",
                                                "Turu kazandınız. Sophie dramatik bir şekilde surat asıyor.") + "\033[0m");
                        } else {
                                losses++;
                                System.out.println("\033[1;32m" + gamestate.tr(
                                                "Sophie wins the round and does a victory dance.",
                                                "Sophie turu kazanıyor ve zafer dansı yapıyor.") + "\033[0m");
                        }
                        System.out.println("  " + wins + " - " + losses);
                }

                if (wins > losses) {
                        System.out.println("\033[1;32m" + gamestate.tr(
                                        "Sophie bursts into laughter and tackles you. The sound echoes somewhere far back in your mind.",
                                        "Sophie kahkahalara boğularak üstünüze atlıyor. Bu ses zihninizin çok derinlerinde yankılanıyor.")
                                        + "\033[0m");
                        return true;
                }
                System.out.println("\033[1;32m" + gamestate.tr(
                                "You make the pancakes. Sophie supervises, flour on her nose, very serious about it.",
                                "Pankekleri siz yapıyorsunuz. Sophie burnunda unla, çok ciddi bir şekilde denetliyor.")
                                + "\033[0m");
                return false;
        }
}
