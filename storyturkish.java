import java.util.Scanner;

public class storyturkish {
        public static void startGameTurkish(Scanner scanner) {

                System.out.println("\033[1;33mAdınız nedir?\033[0m");
                System.out.print(">> ");
                String playerName = scanner.nextLine();

                System.out.println("\n\033[1;32mMerhaba, " + playerName
                                + ". Karanlık bir ormanda kim olduğunuzu hatırlamadan uyanıyorsunuz.\033[0m");
                System.out.println(
                                "\033[1;32mÖnünüzde iki yol var: biri sisli bir patika, diğeri eski bir taş köprü.\033[0m");
                System.out.println("\033[1;33mHangi yolu seçiyorsunuz?\033[0m (1: Sisli Patika / 2: Taş Köprü)");

                System.out.print(">> ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                        mistyPathTurkish(scanner);
                } else if (choice == 2) {
                        stoneBridgeTurkish(scanner);
                } else {
                        System.out.println("\033[1;31mGeçersiz seçim. Gölgeler sizi yutuyor...\033[0m");
                }
        }

        public static void mistyPathTurkish(Scanner scanner) {
                System.out.println("\033[1;32mSisli patikada yürüyorsunuz, çevrenizi zar zor görebiliyorsunuz.\033[0m");
                System.out.println(
                                "\033[1;32mAniden, karşınıza eski bir kulübe çıkıyor. İçeri girmek ister misiniz?\033[0m (1: Evet / 2: Hayır)");

                System.out.print(">> ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                        System.out.println(
                                        "\033[1;32mKulübeye adım atıyorsunuz ve eski bir kitap buluyorsunuz. Kitabı açtığınızda, anılarınız geri gelmeye başlıyor...\033[0m");
                        System.out.println(
                                        "\033[1;32mKitap, ormanın kalbinde gizli bir tapınaktan bahsediyor. İpuçlarını takip ediyor musunuz?\033[0m (1: Evet / 2: Hayır)");
                        System.out.print(">> ");
                        choice = scanner.nextInt();

                        if (choice == 1) {
                                System.out.println(
                                                "\033[1;32mOrmanın derinliklerine doğru yolculuk yapıyorsunuz, garip semboller ve harabelerle karşılaşıyorsunuz.\033[0m");
                                System.out.println(
                                                "\033[1;32mTapınağı buluyorsunuz, ancak gölgeli bir muhafız girişini engelliyor.\033[0m");
                                System.out.println(
                                                "\033[1;33mMuhafıza meydan mı okuyorsunuz yoksa gizlice geçmeye mi çalışıyorsunuz?\033[0m (1: Meydan Oku / 2: Gizlice Geç)");
                                System.out.print(">> ");
                                choice = scanner.nextInt();

                                if (choice == 1) {
                                        System.out.println(
                                                        "\033[1;32mCesurca savaşıyorsunuz ve muhafızı yeniyorsunuz. Tapınağın içinde, parlayan bir sunak buluyorsunuz.\033[0m");
                                        System.out.println(
                                                        "\033[1;32mAniden, kadim gözleri bilgelikle dolu gizemli bir ruh önünüzde beliriyor.\033[0m");
                                        System.out.println(
                                                        "\033[1;33m'Geçmişinizin sırlarını açmak için stratejik zekânızı kanıtlamalısınız,' diyor ruh.\033[0m");
                                        System.out.println(
                                                        "\033[1;33m'Meydan okumanızı seçin: Bir zeka oyunu (XOX) veya şans testi (Taş-Kağıt-Makas)?'\033[0m");
                                        System.out.println("(1: XOX / 2: Taş-Kağıt-Makas)");
                                        System.out.print(">> ");
                                        choice = scanner.nextInt();
                                        scanner.nextLine();

                                        boolean bulmacaCozuldu = false;
                                        if (choice == 1) {
                                                bulmacaCozuldu = ruhlaXOXOyna(scanner);
                                        } else if (choice == 2) {
                                                bulmacaCozuldu = ruhlaTasKagitMakasOyna(scanner);
                                        } else {
                                                System.out.println(
                                                                "\033[1;31mRuh kararsızlığınızı onaylamıyor ve kayboluyor...\033[0m");
                                                System.out.println("\033[1;31mOyun Bitti.\033[0m");
                                                return;
                                        }

                                        if (bulmacaCozuldu) {
                                                System.out.println(
                                                                "\033[1;32mRuh onaylayarak başını sallıyor ve ailenizin resimlerini ve kimliğinize dair yazıları ortaya çıkarıyor.\033[0m");
                                                System.out.println(
                                                                "\033[1;33m'Zekânız keskin. Şimdi, bu bilgiyle ne yapacaksınız?'\033[0m (1: İpuçlarını takip et / 2: Geçmişi reddet)");
                                                System.out.print(">> ");
                                                choice = scanner.nextInt();
                                                if (choice == 1) {
                                                        System.out.println(
                                                                        "\033[1;32mİpuçları sizi bir adaya götürüyor, kayıp anılarınızı ve kimliğinizi buluyorsunuz. Ruhun kutsaması sizi eve götürüyor!\033[0m");
                                                        System.out.println("\033[1;32mKazandınız!\033[0m");
                                                } else {
                                                        System.out.println(
                                                                        "\033[1;31mGeçmişinizi reddediyorsunuz ve tapınak çökmeye başlıyor. Gölgeler sizi yutuyor...\033[0m");
                                                        System.out.println("\033[1;31mOyun Bitti.\033[0m");
                                                }
                                        } else {
                                                System.out.println(
                                                                "\033[1;31mRuh hayal kırıklığıyla başını sallıyor ve sırları da beraberinde alarak kayboluyor...\033[0m");
                                                System.out.println("\033[1;31mOyun Bitti.\033[0m");
                                        }
                                } else {
                                        System.out.println(
                                                        "\033[1;31mGizlice girmeye çalışıyorsunuz ama başarısız oluyorsunuz. Muhafız sizi gölgelere sürgün ediyor...\033[0m");
                                        System.out.println("\033[1;31mOyun Bitti.\033[0m");
                                }
                        } else {
                                System.out.println(
                                                "\033[1;31mİpuçlarını görmezden geliyorsunuz ve kulübeyi terk ediyorsunuz. Gölgeler sonunda sizi buluyor...\033[0m");
                                System.out.println("\033[1;31mOyun Bitti.\033[0m");
                        }
                } else {
                        System.out.println(
                                        "\033[1;31mİçeri girmemeye karar veriyorsunuz ve uzaklaşıyorsunuz. Ancak, gölgeler sizi yutuyor...\033[0m");
                        System.out.println("\033[1;31mOyun Bitti.\033[0m");
                }
        }

        public static void stoneBridgeTurkish(Scanner scanner) {
                System.out.println(
                                "\033[1;32mEski taş köprüyü geçerken, ortasında gölgeli bir figür beliriyor.\033[0m");
                System.out
                                .println("\033[1;32mFigür size kim olduğunuzu soruyor. Yanlış cevap verirseniz, köprü çökecek.\033[0m");
                System.out.println("\033[1;33mCevabınız nedir?\033[0m (1: Bilinmeyen Gezgin / 2: Gölge Avcısı)");

                System.out.print(">> ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                        System.out.println(
                                        "\033[1;32mGölge, sizi tanıyormuş gibi başını sallıyor ve kayboluyor. Köprüyü güvenle geçiyorsunuz ve unutulmuş bir köy buluyorsunuz.\033[0m");
                        System.out.println(
                                        "\033[1;32mKöylüler sizi tanıyor gibi görünüyor. Sizi geçmişinizi açıklayan bir yaşlıya götürüyorlar.\033[0m");
                        System.out.println(
                                        "\033[1;33mDaha fazla bilgi edinmek için kalıyor musunuz yoksa yolculuğunuza devam mı ediyorsunuz?\033[0m (1: Kal / 2: Devam Et)");
                        System.out.print(">> ");
                        choice = scanner.nextInt();

                        if (choice == 1) {
                                System.out.println(
                                                "\033[1;32mYaşlı, Gölge Diyarının kayıp muhafızı olduğunuzu ortaya çıkarıyor! Bu yetenekleriniz ile ne yapacaksınız?\033[0m (1: Koru / 2: Yok Et)");
                                System.out.print(">> ");
                                choice = scanner.nextInt();
                                if (choice == 1) {
                                        System.out.println(
                                                        "\033[1;32mKöyü koruyorsunuz ve halk size minnettar. Kayıp kimliğinizi buluyorsunuz ve gerçek bir kahraman oluyorsunuz!\033[0m");
                                        System.out.println("\033[1;32mKazandınız!\033[0m");
                                } else {
                                        System.out.println(
                                                        "\033[1;31mKöyü yok ediyorsunuz ve gölgeler sizi yutuyor. Sonsuza kadar kayboluyorsunuz...\033[0m");
                                        System.out.println("\033[1;31mOyun Bitti.\033[0m");
                                }
                        } else {
                                System.out.println(
                                                "\033[1;31mYolculuğunuza devam ediyorsunuz ama gerçek bir sır olarak kalıyor. Sonsuza kadar gölgelerde yaşıyorsunuz...\033[0m");
                                System.out.println("\033[1;31mOyun Bitti.\033[0m");
                        }
                } else {
                        System.out.println(
                                        "\033[1;31mGölge sizi bir tehdit olarak algılıyor ve köprüyü parçalıyor! Uçuruma düşüyorsunuz...\033[0m");
                        System.out.println("\033[1;31mOyun Bitti.\033[0m");
                }
        }

        public static boolean ruhlaXOXOyna(Scanner scanner) {
                System.out.println("\033[1;35mRuh ışık ve gölgelerden mistik bir XOX tahtası yaratıyor...\033[0m");

                char[][] tahta = {
                                { ' ', ' ', ' ' },
                                { ' ', ' ', ' ' },
                                { ' ', ' ', ' ' }
                };

                char oyuncuSembol = 'X';
                char ruhSembol = 'O';
                boolean oyunKazanildi = false;
                boolean oyuncuSirasi = true;

                while (!oyunKazanildi && !tahtaDolu(tahta)) {
                        tahtaGoster(tahta);

                        if (oyuncuSirasi) {
                                oyuncuHamle(tahta, oyuncuSembol, scanner);
                                oyunKazanildi = kazananKontrol(tahta, oyuncuSembol);
                                if (oyunKazanildi) {
                                        tahtaGoster(tahta);
                                        System.out.println("\033[1;32mRuhu alt ettiniz!\033[0m");
                                        return true;
                                }
                        } else {
                                ruhHamle(tahta, ruhSembol);
                                System.out.println("\033[1;35mRuh hamlesini yapıyor...\033[0m");
                                oyunKazanildi = kazananKontrol(tahta, ruhSembol);
                                if (oyunKazanildi) {
                                        tahtaGoster(tahta);
                                        System.out.println("\033[1;31mRuh sizi yendi...\033[0m");
                                        return false;
                                }
                        }

                        if (tahtaDolu(tahta)) {
                                tahtaGoster(tahta);
                                System.out.println("\033[1;33mBerabere! Ruh çabanızı takdir ediyor.\033[0m");
                                return true;
                        }

                        oyuncuSirasi = !oyuncuSirasi;
                }
                return false;
        }

        public static boolean ruhlaTasKagitMakasOyna(Scanner scanner) {
                System.out.println("\033[1;35mRuh sizi Taş-Kağıt-Makas oyununa davet ediyor!\033[0m");
                System.out.println("\033[1;35m'3'te 2 kazanan oyunu alır,' diye ilan ediyor ruh.\033[0m");
                System.out.println(
                                "\033[1;35m'Ruh, oyuncunun önceki hamlelerini izleyerek strateji geliştirebilir...' diye fısıldıyor.\033[0m");

                String[] secenekler = { "Taş", "Kağıt", "Makas" };
                java.util.List<String> oyuncuGecmisHamleler = new java.util.ArrayList<>();
                int oyuncuGalibiyet = 0;
                int ruhGalibiyet = 0;
                int round = 1;

                while (oyuncuGalibiyet < 2 && ruhGalibiyet < 2) {
                        System.out.println("\n\033[1;33mRound " + round + ":\033[0m");
                        System.out.print("Seçiminizi yapın (Taş(t), Kağıt(k), Makas(m)): ");
                        String oyuncuSecim = scanner.nextLine().toLowerCase();

                        String oyuncuHamle = "";
                        switch (oyuncuSecim) {
                                case "t":
                                case "taş":
                                        oyuncuHamle = "Taş";
                                        break;
                                case "k":
                                case "kağıt":
                                case "kagit":
                                        oyuncuHamle = "Kağıt";
                                        break;
                                case "m":
                                case "makas":
                                        oyuncuHamle = "Makas";
                                        break;
                                default:
                                        System.out.println("Geçersiz seçim, ruh sizin için seçiyor...");
                                        oyuncuHamle = secenekler[(int) (Math.random() * 3)];
                        }

                        // Ruh stratejik hamle yapıyor
                        String ruhHamle = ruhStratejikHamle(oyuncuGecmisHamleler, secenekler);
                        oyuncuGecmisHamleler.add(oyuncuHamle);

                        System.out.println("Seçiminiz: " + oyuncuHamle);
                        System.out.println("Ruhun seçimi: " + ruhHamle);

                        if (oyuncuHamle.equals(ruhHamle)) {
                                System.out.println("\033[1;33mBerabere! Bu roundu kimse kazanmadı.\033[0m");
                        } else if ((oyuncuHamle.equals("Taş") && ruhHamle.equals("Makas")) ||
                                        (oyuncuHamle.equals("Kağıt") && ruhHamle.equals("Taş")) ||
                                        (oyuncuHamle.equals("Makas") && ruhHamle.equals("Kağıt"))) {
                                System.out.println("\033[1;32mBu roundu kazandınız!\033[0m");
                                oyuncuGalibiyet++;
                        } else {
                                System.out.println("\033[1;31mBu roundu ruh kazandı!\033[0m");
                                ruhGalibiyet++;
                        }

                        System.out.println("Skor - Siz: " + oyuncuGalibiyet + " | Ruh: " + ruhGalibiyet);
                        round++;
                }

                if (oyuncuGalibiyet > ruhGalibiyet) {
                        System.out.println("\033[1;32mTebrikler! Şans oyununda ruhu yendiniz!\033[0m");
                        return true;
                } else {
                        System.out.println("\033[1;31mRuh şans oyununda üstünlüğünü kanıtladı...\033[0m");
                        return false;
                }
        }

        private static void tahtaGoster(char[][] tahta) {
                System.out.println("\033[1;36ms/s 1   2   3\033[0m");
                System.out.println("  -------------");
                for (int i = 0; i < 3; i++) {
                        System.out.print((i + 1) + " | ");
                        for (int j = 0; j < 3; j++) {
                                System.out.print(tahta[i][j] + " | ");
                        }
                        System.out.println("\n  -------------");
                }
        }

        private static boolean kazananKontrol(char[][] tahta, char oyuncu) {
                for (int i = 0; i < 3; i++) {
                        if ((tahta[i][0] == oyuncu && tahta[i][1] == oyuncu && tahta[i][2] == oyuncu) ||
                                        (tahta[0][i] == oyuncu && tahta[1][i] == oyuncu && tahta[2][i] == oyuncu)) {
                                return true;
                        }
                }
                if ((tahta[0][0] == oyuncu && tahta[1][1] == oyuncu && tahta[2][2] == oyuncu) ||
                                (tahta[0][2] == oyuncu && tahta[1][1] == oyuncu && tahta[2][0] == oyuncu)) {
                        return true;
                }
                return false;
        }

        private static boolean tahtaDolu(char[][] tahta) {
                for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                                if (tahta[i][j] == ' ') {
                                        return false;
                                }
                        }
                }
                return true;
        }

        private static void oyuncuHamle(char[][] tahta, char oyuncu, Scanner scanner) {
                int satir, sutun;
                while (true) {
                        System.out.print("Satır (1-3) ve sütun (1-3) girin: ");
                        satir = scanner.nextInt() - 1;
                        sutun = scanner.nextInt() - 1;
                        scanner.nextLine(); // Buffer temizle

                        if (satir >= 0 && satir < 3 && sutun >= 0 && sutun < 3 && tahta[satir][sutun] == ' ') {
                                tahta[satir][sutun] = oyuncu;
                                break;
                        } else {
                                System.out.println("Geçersiz hamle. Tekrar deneyin.");
                        }
                }
        }

        private static void ruhHamle(char[][] tahta, char ruh) {
                // Basit AI: Önce kazanmaya çalış, sonra oyuncuyu engelle, sonra rastgele
                if (kazanmaHamle(tahta, ruh) || engellemeHamle(tahta, ruh) || rastgeleHamle(tahta, ruh)) {
                        return;
                }
        }

        private static boolean kazanmaHamle(char[][] tahta, char ruh) {
                for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                                if (tahta[i][j] == ' ') {
                                        tahta[i][j] = ruh;
                                        if (kazananKontrol(tahta, ruh)) {
                                                return true;
                                        }
                                        tahta[i][j] = ' ';
                                }
                        }
                }
                return false;
        }

        private static boolean engellemeHamle(char[][] tahta, char ruh) {
                char oyuncu = (ruh == 'O') ? 'X' : 'O';
                for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                                if (tahta[i][j] == ' ') {
                                        tahta[i][j] = oyuncu;
                                        if (kazananKontrol(tahta, oyuncu)) {
                                                tahta[i][j] = ruh;
                                                return true;
                                        }
                                        tahta[i][j] = ' ';
                                }
                        }
                }
                return false;
        }

        private static boolean rastgeleHamle(char[][] tahta, char ruh) {
                java.util.List<int[]> bossHamleler = new java.util.ArrayList<>();
                for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                                if (tahta[i][j] == ' ') {
                                        bossHamleler.add(new int[] { i, j });
                                }
                        }
                }
                if (!bossHamleler.isEmpty()) {
                        int[] hamle = bossHamleler.get((int) (Math.random() * bossHamleler.size()));
                        tahta[hamle[0]][hamle[1]] = ruh;
                        return true;
                }
                return false;
        }

        // Ruh için stratejik taş-kağıt-makas hamle algoritması
        private static String ruhStratejikHamle(java.util.List<String> oyuncuGecmisHamleler, String[] secenekler) {
                // Eğer henüz yeterli veri yoksa rastgele seç
                if (oyuncuGecmisHamleler.size() < 2) {
                        return secenekler[(int) (Math.random() * 3)];
                }

                // Oyuncunun en çok kullandığı hamleyi bul
                java.util.Map<String, Integer> hamleFrekansi = new java.util.HashMap<>();
                for (String hamle : oyuncuGecmisHamleler) {
                        hamleFrekansi.put(hamle, hamleFrekansi.getOrDefault(hamle, 0) + 1);
                }

                String enCokKullanilanHamle = "";
                int maxFrekans = 0;
                for (java.util.Map.Entry<String, Integer> entry : hamleFrekansi.entrySet()) {
                        if (entry.getValue() > maxFrekans) {
                                maxFrekans = entry.getValue();
                                enCokKullanilanHamle = entry.getKey();
                        }
                }

                // Oyuncunun en çok kullandığı hamleyi yenecek hamleyi seç
                switch (enCokKullanilanHamle) {
                        case "Taş":
                                return "Kağıt"; // Kağıt taşı yener
                        case "Kağıt":
                                return "Makas"; // Makas kağıdı yener
                        case "Makas":
                                return "Taş"; // Taş makası yener
                        default:
                                return secenekler[(int) (Math.random() * 3)];
                }
        }
}