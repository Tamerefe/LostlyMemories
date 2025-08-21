import java.util.Scanner;

public class storyturkish {
        public static void startGameTurkish(Scanner scanner) {

                System.out.println("\033[1;33mAdınız nedir?\033[0m");
                System.out.print(">> ");
                String playerName = scanner.nextLine();

                System.out.println("\n\033[1;35m=== KAYIP ANILAR: Zamanda Bir Yolculuk ===\033[0m");
                System.out.println("\n\033[1;32mMerhaba, " + playerName
                                + ". Kapının önünde, gönderen adresi olmayan eski, tozlu bir paket buluyorsunuz.\033[0m");
                System.out.println(
                                "\033[1;32mİçinde antika bir müzik kutusu ve soluk bir mektup var:\033[0m");
                System.out.println(
                                "\033[1;33m'Kaybettiğiniz anılar sizi bekliyor. Hatırlamaya hazır olduğunuzda müzik kutusunu çevirin.'\033[0m");
                System.out.println("\033[1;32mNarin mekanizmayı tutarken elleriniz titriyor.\033[0m");
                System.out.println("\033[1;33mNe seçiyorsunuz?\033[0m");
                System.out.println("1: Müzik kutusunu hemen çevir");
                System.out.println("2: Önce mektubu daha dikkatli oku");
                System.out.println("3: Her şeyi şimdilik bir kenara koy");

                System.out.print(">> ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                        muzikKutusuSahnesi(scanner, playerName);
                } else if (choice == 2) {
                        mektupSahnesi(scanner, playerName);
                } else if (choice == 3) {
                        geciktirmeSahnesi(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mGeçersiz seçim. Çok uzun tereddüt ediyorsunuz ve an kaçıyor...\033[0m");
                        geciktirmeSahnesi(scanner, playerName);
                }
        }

        public static void mektupSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Gizli Mesajlar ===\033[0m");
                System.out.println(
                                "\033[1;32mMektubu daha iyi ışık altında incelerken, kenar boşluklarında soluk yazılar fark ediyorsunuz.\033[0m");
                System.out.println(
                                "\033[1;32mFarklı bir el yazısıyla yazılmış gibi görünüyor:\033[0m");
                System.out.println(
                                "\033[1;33m'Deniz kenarındaki feneri hatırla, yıldızlar altında söz verdiğimiz yeri.'\033[0m");
                System.out.println(
                                "\033[1;32mKağıt tuz ve eski gül kokuyor. Garip bir aşinalıkla kalbiniz hızlanmaya başlıyor.\033[0m");
                System.out.println("\033[1;33mNe seçiyorsunuz?\033[0m");
                System.out.println("1: Şimdi müzik kutusunu çevir");
                System.out.println("2: Feneri hatırlamaya çalış");
                System.out.println("3: Pakette daha fazla ipucu ara");

                System.out.print(">> ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                        muzikKutusuSahnesi(scanner, playerName);
                } else if (choice == 2) {
                        fenerHatiraSahnesi(scanner, playerName);
                } else if (choice == 3) {
                        paketAramaSahnesi(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mElleriniz belirsizlikle titriyor...\033[0m");
                        muzikKutusuSahnesi(scanner, playerName);
                }
        }

        public static void geciktirmeSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Huzursuz Gece ===\033[0m");
                System.out.println(
                                "\033[1;32mUyumaya çalışıyorsunuz ama müzik kutusu diğer odadan sizi çağırıyor.\033[0m");
                System.out.println(
                                "\033[1;32mTuhaf rüyalar zihnizi dolduruyor - okyanusun kenarında gülen kızıl saçlı bir kadının parıltıları,\033[0m");
                System.out.println(
                                "\033[1;32mparmağınıza takılan bir yüzük, ay ışığında fısıldanan sözler.\033[0m");
                System.out.println(
                                "\033[1;32mSaat 3'te uyanıyorsunuz, artık dayanamıyorsunuz.\033[0m");
                System.out.println("\033[1;33mNe seçiyorsunuz?\033[0m");
                System.out.println("1: Git müzik kutusunu çevir");
                System.out.println("2: Rüyalardan hatırladıklarını yaz");
                System.out.println("3: Bunu konuşmak için birini ara");

                System.out.print(">> ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                        muzikKutusuSahnesi(scanner, playerName);
                } else if (choice == 2) {
                        ruyaGunluguSahnesi(scanner, playerName);
                } else if (choice == 3) {
                        telefonAramaSahnesi(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mDönüp duruyorsunuz, huzur bulamıyorsunuz...\033[0m");
                        muzikKutusuSahnesi(scanner, playerName);
                }
        }

        public static void paketAramaSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Gizli Bölme ===\033[0m");
                System.out.println(
                                "\033[1;32mPaketi yoklarken gizli bir bölme keşfediyorsunuz.\033[0m");
                System.out.println(
                                "\033[1;32mİçinde küçük bir pirinç anahtar ve tanımadığınız bir kadınla çekilmiş fotoğrafınız var,\033[0m");
                System.out.println("\033[1;32mbir fener önünde duruyorsunuz.\033[0m");
                System.out.println(
                                "\033[1;33mArkasında birisi yazmış: '15 Haziran Düğün Günümüz' ama yıl silik.\033[0m");
                System.out.println(
                                "\033[1;32mKadının gözleri doğrudan size bakıyor gibi, sevgi ve üzüntü dolu.\033[0m");
                System.out.println("\033[1;33mNe seçiyorsunuz?\033[0m");
                System.out.println("1: Müzik kutusunu anahtarla çevir");
                System.out.println("2: Fotoğrafı daha yakından incele");
                System.out.println("3: Bu kadını hatırlamaya çalış");

                System.out.print(">> ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                        derinHatiraSahnesi(scanner, playerName);
                } else if (choice == 2) {
                        fotografSahnesi(scanner, playerName);
                } else if (choice == 3) {
                        kadiniHatirlaSahnesi(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mFotoğraf titreyen ellerinizden kayıyor...\033[0m");
                        fotografSahnesi(scanner, playerName);
                }
        }

        public static void muzikKutusuSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== İlk Anı ===\033[0m");
                System.out.println(
                                "\033[1;32mMüzik kutusu ürkütücü melodisini çalarken, etrafınızdaki dünya parıldamaya ve solmaya başlıyor.\033[0m");
                System.out.println(
                                "\033[1;32mKendinizi okyanusu gören bir uçurumda buluyorsunuz.\033[0m");
                System.out.println(
                                "\033[1;32mKızıl saçlı bir kadın size yaklaşıyor, beyaz elbisesi deniz rüzgarında dalgalanıyor.\033[0m");
                System.out.println(
                                "\033[1;33m'Bana geri döndün,' diye fısıldıyor, gözlerinde yaşlarla. 'Çok uzun zamandır bekliyordum, " + playerName + ".'\033[0m");
                System.out.println("\033[1;32mBu isim dudaklarınızda yabancı ama tanıdık geliyor.\033[0m");
                System.out.println("\033[1;33mNe seçiyorsunuz?\033[0m");
                System.out.println("1: Ona kim olduğunu sor");
                System.out.println("2: Hatırlamadığını söyle");
                System.out.println("3: Soru sormadan onu kucakla");

                System.out.print(">> ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                        elenaTanitmaSahnesi(scanner, playerName);
                } else if (choice == 2) {
                        itirafSahnesi(scanner, playerName);
                } else if (choice == 3) {
                        kucaklamaSahnesi(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mDuygularla dolup taşarak donup kalıyorsunuz...\033[0m");
                        itirafSahnesi(scanner, playerName);
                }
        }

        public static void derinHatiraSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Daha Derin Anı ===\033[0m");
                System.out.println(
                                "\033[1;32mPirinç anahtar müzik kutusundan farklı bir melodi çıkarıyor.\033[0m");
                System.out.println("\033[1;32mBu sefer vizyon daha net.\033[0m");
                System.out.println(
                                "\033[1;32mDeniz kenarında küçük bir kulübede, kadın - Elena - size pozitif hamilelik testi gösteriyor.\033[0m");
                System.out.println(
                                "\033[1;32mYüzü sevinçle ışıldıyor ama gözlerinde korku da var.\033[0m");
                System.out.println(
                                "\033[1;33m'Artık her şey değişecek,' diyor. 'Ne olursa olsun bu anı asla unutmayacağına söz ver.'\033[0m");
                System.out.println("\033[1;33mNe seçiyorsunuz?\033[0m");
                System.out.println("1: Hatırlayacağına söz ver");
                System.out.println("2: Neden korktuğunu sor");
                System.out.println("3: Onu sıkıca tut");

                System.out.print(">> ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                        sozSahnesi(scanner, playerName);
                } else if (choice == 2) {
                        korkuSahnesi(scanner, playerName);
                } else if (choice == 3) {
                        tesellisahnesi(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mDuygularınız sizi büyülerken anı soluyor...\033[0m");
                        tesellisahnesi(scanner, playerName);
                }
        }

        public static void elenaTanitmaSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Kayıp Aşk ===\033[0m");
                System.out.println("\033[1;32mElena'nın yüzü acıyla çöküyor.\033[0m");
                System.out.println(
                                "\033[1;33m'Ben Elena, karın. Kaza olmadan önce üç yıl evliydik.'\033[0m");
                System.out.println(
                                "\033[1;33m'Kafana çok sert vurdun... doktorlar bizi bir daha asla hatırlamayabileceğini söyledi, ama ben hep umut ettim.'\033[0m");
                System.out.println(
                                "\033[1;32mSize parmağınızdaki soluk izle eşleşen bir alyans gösteriyor.\033[0m");
                System.out.println(
                                "\033[1;33m'Aylardır size bu paketleri gönderiyorum, bir şeyin sizi geri getireceğini umarak.'\033[0m");
                System.out.println("\033[1;33mNe seçiyorsunuz?\033[0m");
                System.out.println("1: Kaza hakkında sor");
                System.out.println("2: Birlikte geçirdiğiniz hayat hakkında sor");
                System.out.println("3: Neden sizi ziyaret etmediğini sor");

                System.out.print(">> ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                        kazaSahnesi(scanner, playerName);
                } else if (choice == 2) {
                        birlikteHayatSahnesi(scanner, playerName);
                } else if (choice == 3) {
                        ziyaretSorusuSahnesi(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mBu açıklamanın ağırlığı sizi eziyor...\033[0m");
                        kazaSahnesi(scanner, playerName);
                }
        }

        public static void itirafSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Gerçek Ortaya Çıkıyor ===\033[0m");
                System.out.println("\033[1;32mElena üzgünce başını sallıyor.\033[0m");
                System.out.println(
                                "\033[1;33m'Hatırlamadığını biliyorum. Araba kazası bunu bizden aldı.'\033[0m");
                System.out.println(
                                "\033[1;33m'Ama " + playerName + ", bilmeniz gereken başka bir şey daha var.'\033[0m");
                System.out.println(
                                "\033[1;33m'Bir kızımız vardı, Sophie. Şimdi beş yaşında ve her gün babasını soruyor.'\033[0m");
                System.out.println(
                                "\033[1;32mSesi kırılıyor, sizin gözleriniz ve annesinin gülümsemesiyle küçük bir kız çocuğunun fotoğrafını çıkarıyor.\033[0m");
                System.out.println(
                                "\033[1;33m'Ona fotoğraflar gösteriyorum, hikayeler anlatıyorum, bir gün belki diye umarak...'\033[0m");
                System.out.println("\033[1;33mNe seçiyorsunuz?\033[0m");
                System.out.println("1: Sophie ile tanışmak iste");
                System.out.println("2: Kaza hakkında detay sor");
                System.out.println("3: Hatırlama umudu olup olmadığını sor");

                System.out.print(">> ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                        sophieSahnesi(scanner, playerName);
                } else if (choice == 2) {
                        kazaDetaySahnesi(scanner, playerName);
                } else if (choice == 3) {
                        umutSahnesi(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mGerçek sindiğinde kalbiniz kırılıyor...\033[0m");
                        sophieSahnesi(scanner, playerName);
                }
        }

        public static void kucaklamaSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Tanıdık Sıcaklık ===\033[0m");
                System.out.println(
                                "\033[1;32mElena'yı tutarken anı parçacıkları zihnize akmaya başlıyor.\033[0m");
                System.out.println(
                                "\033[1;32mKahkahası, yemek yaparken mırıldanması, yatakta geçirilen tembel Pazar sabahları, birlikte beşik kurma.\033[0m");
                System.out.println(
                                "\033[1;32mAma eksik parçaları çok olan bir yapbozun parçaları gibi.\033[0m");
                System.out.println(
                                "\033[1;33m'Bir şey hissediyorum,' diye fısıldıyorsunuz. 'Ama sis arasından bakmak gibi.'\033[0m");
                System.out.println(
                                "\033[1;32mElena umutla gözlerinde size bakmak için geri çekiliyor.\033[0m");
                System.out.println("\033[1;33mNe seçiyorsunuz?\033[0m");
                System.out.println("1: Daha fazlasını hatırlamaya çalış");
                System.out.println("2: Hatırlamanıza yardım etmesini iste");
                System.out.println("3: Hissettiğiniz kafa karışıklığını anlat");

                System.out.print(">> ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                        dahafazlaHatirlaSahnesi(scanner, playerName);
                } else if (choice == 2) {
                        yardimHatirlaSahnesi(scanner, playerName);
                } else if (choice == 3) {
                        kafaKarisikligiSahnesi(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mDuygular çok bunaltıcı hale geliyor...\033[0m");
                        kafaKarisikligiSahnesi(scanner, playerName);
                }
        }

        public static void umutSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Tıbbi Gerçek ===\033[0m");
                System.out.println("\033[1;32mElena tıbbi belgelerin olduğu bir dosya çıkarıyor.\033[0m");
                System.out.println(
                                "\033[1;33m'Dr. Martinez hala şans olduğunu söylüyor. Beyin gizemli yollarla iyileşebilir, bazen yıllar sonra.'\033[0m");
                System.out.println(
                                "\033[1;33m'Ama " + playerName + ", sonsuza kadar bekleyemem.'\033[0m");
                System.out.println(
                                "\033[1;33m'Sophie'nin istikrara ihtiyacı var, ve ben... Portland'da iş teklifi aldım.'\033[0m");
                System.out.println(
                                "\033[1;33m'Daha iyi maaş, daha iyi okullar. Ama burada kurduğumuz her şeyi geride bırakmak anlamına gelir.'\033[0m");
                System.out.println("\033[1;33mNe seçiyorsunuz?\033[0m");
                System.out.println("1: Gitmemesini rica et");
                System.out.println("2: Sophie için en iyisini yapmasını söyle");
                System.out.println("3: Önce birlikte terapi denemeyi öner");

                System.out.print(">> ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                        yalvarmaSahnesi(scanner, playerName);
                } else if (choice == 2) {
                        fedakarlikSahnesi(scanner, playerName);
                } else if (choice == 3) {
                        terapiSahnesi(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mKararın ağırlığı sizi felç ediyor...\033[0m");
                        terapiSahnesi(scanner, playerName);
                }
        }

        public static void terapiSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Yeni Bir Başlangıç ===\033[0m");
                System.out.println(
                                "\033[1;32mTakip eden aylarda birlikte terapi seanslarına katılıyorsunuz.\033[0m");
                System.out.println("\033[1;32mBazı günler diğerlerinden daha zor.\033[0m");
                System.out.println(
                                "\033[1;32mFotoğraflar, videolar ve Elena'nın sabırlı anlatımıyla eski hayatınızı öğreniyorsunuz.\033[0m");
                System.out.println(
                                "\033[1;32mYavaşça Elena'ya tekrar aşık olmaya başlıyorsunuz - eski aşkı hatırlamayarak değil, yeni bir aşk keşfederek.\033[0m");
                System.out.println(
                                "\033[1;32mSophie ziyarete gelmeye başlıyor, önce temkinli, sonra artan rahatlıkla.\033[0m");
                System.out.println("\033[1;33mNe seçiyorsunuz?\033[0m");
                System.out.println("1: Yeni anılar kurmaya devam et");
                System.out.println("2: Sophie'nin ihtiyacı olan baba olmaya odaklan");
                System.out.println("3: Deneysel hafıza tedavisini takip et");

                System.out.print(">> ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                        yeniAnılarSahnesi(scanner, playerName);
                } else if (choice == 2) {
                        babalikSahnesi(scanner, playerName);
                } else if (choice == 3) {
                        tedaviSahnesi(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mZamanın yolunuzu yönlendirmesine izin veriyorsunuz...\033[0m");
                        yeniAnılarSahnesi(scanner, playerName);
                }
        }

        public static void yeniAnılarSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== İkinci Şanslar ===\033[0m");
                System.out.println(
                                "\033[1;32mBir yıl sonra, yine fenerde, ama bu sefer Sophie omuzlarınızda ve Elena'nın eli elinizde.\033[0m");
                System.out.println(
                                "\033[1;32mGeçmiş hayatınızın anıları belirsiz kalıyor, ama şimdi yeni sevinçle dolu.\033[0m");
                System.out.println(
                                "\033[1;32mSophie size topladığı kabukları gösteriyor, Elena da sizi ilk kez bir araya getiren aynı Neruda şiirlerini okuyor.\033[0m");
                System.out.println(
                                "\033[1;33mBelki bazı aşk hikayelerinin ikinci bölümü vardır.\033[0m");
                System.out.println("\033[1;33mNe seçiyorsunuz?\033[0m");
                System.out.println("1: Elena'ya tekrar evlenme teklif et");
                System.out.println("2: Yeni bir başlangıç için taşınmaya karar ver");
                System.out.println("3: Kal ve burada yeni hayatını kur");

                System.out.print(">> ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                        tekrarTeklifSahnesi(scanner, playerName);
                } else if (choice == 2) {
                        yeniBaslangicSahnesi(scanner, playerName);
                } else if (choice == 3) {
                        kalVeKurSahnesi(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mAnın kalbinizi yönlendirmesine izin veriyorsunuz...\033[0m");
                        tekrarTeklifSahnesi(scanner, playerName);
                }
        }

        public static void tekrarTeklifSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Yenilenen Aşk ===\033[0m");
                System.out.println(
                                "\033[1;32mİlk evlenme teklifini ettiğiniz aynı fenerde tekrar diz çöküyorsunuz.\033[0m");
                System.out.println(
                                "\033[1;32mAma bu sefer Sophie yardım ediyor, şeker yüzük tutuyor ve kıkırdıyor.\033[0m");
                System.out.println(
                                "\033[1;33m'Elena, seni daha önce sevdiğimi hatırlamasam da, şimdi ve bundan sonraki her gün sevmeyi seçiyorum.'\033[0m");
                System.out.println("\033[1;33m'Benimle tekrar evlenir misin?'\033[0m");
                System.out.println(
                                "\033[1;32mSevinç gözyaşlarıyla evet diyor. Bazı aşklar hafızayı aşar.\033[0m");
                System.out.println("\033[1;33mNe seçiyorsunuz?\033[0m");
                System.out.println("1: Yeni düğününüzü planlamaya başla");
                System.out.println("2: Sadece Sophie ile sessiz bir tören yap");

                System.out.print(">> ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                        dugun2Sahnesi(scanner, playerName);
                } else if (choice == 2) {
                        sesssizDugunSahnesi(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mAşkın karar vermesine izin veriyorsunuz...\033[0m");
                        sesssizDugunSahnesi(scanner, playerName);
                }
        }

        public static void dugun2Sahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Tam Daire ===\033[0m");
                System.out.println(
                                "\033[1;32mİkinci düğününüz farklı ama güzel.\033[0m");
                System.out.println(
                                "\033[1;32mHatırlamadığınız arkadaşlar yeni edindiğiniz arkadaşlarla birlikte duruyor.\033[0m");
                System.out.println(
                                "\033[1;32mSophie çiçek kızı, gururla ışıldıyor.\033[0m");
                System.out.println(
                                "\033[1;32mElena ile ilk düğününüzde çalan aynı şarkıya dans ederken,\033[0m");
                System.out.println(
                                "\033[1;32madımları hatırlamıyorsunuz ama vücudunuz biliyor gibi.\033[0m");
                System.out.println("\033[1;33mAşk bir yolunu buluyor.\033[0m");
                System.out.println(
                                "\n\033[1;35mSON: Unutulan anıların küllerinden yeni bir hayat kurdunuz.\033[0m");
                System.out.println(
                                "\033[1;35mBazen en büyük aşk hikayeleri aynı kişiye iki kez aşık olmakla ilgilidir.\033[0m");
                System.out.println("\n\033[1;32mOynadığınız için teşekkürler, " + playerName + "!\033[0m");
        }

        public static void sesssizDugunSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Aile Öncelikli ===\033[0m");
                System.out.println(
                                "\033[1;32mArka bahçenizde küçük bir tören yapıyorsunuz, sadece üçünüz ve nikah memuru.\033[0m");
                System.out.println(
                                "\033[1;32mSophie kendi yaptığı çiçek tacını takıyor ve kendisini sağdıç yerine 'en iyi kız' ilan ediyor.\033[0m");
                System.out.println("\033[1;32mSadeliğiyle mükemmel.\033[0m");
                System.out.println(
                                "\033[1;32mElena'yı öperken, Sophie alkışlıyor ve her yere çiçek yaprağı atıyor.\033[0m");
                System.out.println(
                                "\n\033[1;35mSON: Sessiz kutlamayı seçerek, en önemli anların\033[0m");
                System.out.println(
                                "\033[1;35men çok sevdiğiniz insanlarla paylaşılan anlar olduğunu keşfettiniz.\033[0m");
                System.out.println("\n\033[1;32mOynadığınız için teşekkürler, " + playerName + "!\033[0m");
        }

        public static void yeniBaslangicSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Yeni Ufuklar ===\033[0m");
                System.out.println(
                                "\033[1;32mBirlikte Portland'a taşınmaya karar veriyorsunuz, unutulan anıların ağırlığını geride bırakarak.\033[0m");
                System.out.println(
                                "\033[1;32mSophie yeni okulundan heyecanlı, Elena da iş teklifini kabul etti.\033[0m");
                System.out.println(
                                "\033[1;32mMüzik kutusunu dikkatli bir şekilde mendile sararak paketlerken, bazı hazinelerin\033[0m");
                System.out.println("\033[1;32mneden değerli olduğunu hatırlamasak da saklamaya değer olduğunu anlıyorsunuz.\033[0m");
                System.out.println(
                                "\n\033[1;35mSON: Bazen ilerlemek geçmişi geride bırakmak anlamına gelir.\033[0m");
                System.out.println(
                                "\033[1;35mYeni bir yerde yeni bir aile hikayesi yarattınız, aşkın her yerde filizlenebileceğini kanıtlayarak.\033[0m");
                System.out.println("\n\033[1;32mOynadığınız için teşekkürler, " + playerName + "!\033[0m");
        }

        public static void kalVeKurSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Kökler Derindir ===\033[0m");
                System.out.println(
                                "\033[1;32mAşk hikayen başladığı kasabada kalmayı seçiyorsunuz.\033[0m");
                System.out.println(
                                "\033[1;32mElena ile ilk tanıştığınız küçük kitapevini devralıyorsunuz\033[0m");
                System.out.println("\033[1;32mve toplumun buluşma yeri haline geliyor.\033[0m");
                System.out.println(
                                "\033[1;32mSophie çocuk bölümünü düzenlemede yardım ediyor, Elena da şiir okuma grubu başlatıyor.\033[0m");
                System.out.println("\033[1;32mFener özel yeriniz olarak kalıyor.\033[0m");
                System.out.println(
                                "\n\033[1;35mSON: Hikayen başladığı yerde kalarak hem geçmişinize hem de şimdi saygı gösterdiniz.\033[0m");
                System.out.println(
                                "\033[1;35mKitapevi ikinci şansların ve kalıcı aşkın sembolü oldu.\033[0m");
                System.out.println("\n\033[1;32mOynadığınız için teşekkürler, " + playerName + "!\033[0m");
        }

        // Tamamlama için ek sahneler
        public static void fenerHatiraSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Fener Anıları ===\033[0m");
                System.out.println(
                                "\033[1;32mGözlerinizi kapatıp feneri hatırlamaya çalışıyorsunuz.\033[0m");
                System.out.println(
                                "\033[1;32mParçalar geliyor: dalga sesleri, bir kadının kahkahası, ayak parmaklarınız arasındaki kum hissi.\033[0m");
                System.out.println(
                                "\033[1;32mAma bu anıları ne kadar sıkı kavramaya çalışırsanız, parmaklarınızın arasından su gibi kayıp gidiyorlar.\033[0m");
                System.out.println("\033[1;33mSinirlenip müzik kutusunu çevirmeye karar veriyorsunuz.\033[0m");
                muzikKutusuSahnesi(scanner, playerName);
        }

        public static void ruyaGunluguSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Rüya Günlüğü ===\033[0m");
                System.out.println(
                                "\033[1;32mRüyalardan hatırlayabildiğiniz her şeyi yazıyorsunuz.\033[0m");
                System.out.println(
                                "\033[1;32mKadının yüzü, yüzük, mutlulukla karışık kayıp hissi.\033[0m");
                System.out.println(
                                "\033[1;32mYazarken daha fazla detay çıkıyor: küçük bir çocuğun kahkahası, sabah kahve kokusu,\033[0m");
                System.out.println("\033[1;32muyuşturucu şekilde mırıldanan bir ninni.\033[0m");
                System.out.println(
                                "\033[1;33mGünlük girişleri müzik kutusu hakkında daha meraklı hale getiriyor.\033[0m");
                muzikKutusuSahnesi(scanner, playerName);
        }

        public static void telefonAramaSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Gece Yarısı Araması ===\033[0m");
                System.out.println(
                                "\033[1;32mTelefonu elinize alıyorsunuz ama kimi arayacağınızı bilmiyorsunuz.\033[0m");
                System.out.println(
                                "\033[1;32mTelefon kişileriniz yabancı görünüyor, başka birinin hayatına aitmiş gibi.\033[0m");
                System.out.println(
                                "\033[1;32mYalnızlık sizi büyülüyor ve telefonu bırakıyorsunuz.\033[0m");
                System.out.println(
                                "\033[1;33mMüzik kutusu cevaplara tek bağlantınız gibi görünüyor.\033[0m");
                muzikKutusuSahnesi(scanner, playerName);
        }

        public static void fotografSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Geçmişi İncelemek ===\033[0m");
                System.out.println(
                                "\033[1;32mFotoğrafın her detayını inceliyorsunuz.\033[0m");
                System.out.println(
                                "\033[1;32mArka plandaki fener, kadının elinizin göğsünüze koyma şekli,\033[0m");
                System.out.println("\033[1;32mher iki yüzünüzdeki gerçek mutluluk.\033[0m");
                System.out.println(
                                "\033[1;32mBu açıkça saf sevinç anıydı, ama yabancılara bakmak gibi hissettiriyor.\033[0m");
                System.out.println("\033[1;33mCevaplara ihtiyacınız var ve müzik kutusu anahtarı tutuyor.\033[0m");
                derinHatiraSahnesi(scanner, playerName);
        }

        public static void kadiniHatirlaSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Hatırlamaya Çalışmak ===\033[0m");
                System.out.println(
                                "\033[1;32mKadının yüzüne bakıyorsunuz, hatırlamaya zorlamaya çalışıyorsunuz.\033[0m");
                System.out.println(
                                "\033[1;32mGözlerinde tanıdık bir şey var, ama duman yakalamaya çalışmak gibi.\033[0m");
                System.out.println(
                                "\033[1;32mNe kadar konsantre olursanız, başınız o kadar ağrımaya başlıyor.\033[0m");
                System.out.println(
                                "\033[1;33mBelki müzik kutusu zihnin açamadığını açacaktır.\033[0m");
                derinHatiraSahnesi(scanner, playerName);
        }

        // Tamamlama için yer tutucu metodlar - bunlar benzer dallanma yollarına götürür
        public static void sozSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;32mElena'ya hatırlayacağınıza söz veriyorsunuz, o taahhüdün ağırlığını hissediyorsunuz.\033[0m");
                itirafSahnesi(scanner, playerName);
        }

        public static void korkuSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;32mElena gelecek ve çocuk yetiştirme konusundaki korkularını açıklıyor.\033[0m");
                itirafSahnesi(scanner, playerName);
        }

        public static void tesellisahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;32mElena'yı sıkıca tutuyorsunuz, kayıp anılara rağmen derin bir bağ hissediyorsunuz.\033[0m");
                itirafSahnesi(scanner, playerName);
        }

        public static void kazaSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;32mElena size her şeyi değiştiren araba kazasını anlatıyor.\033[0m");
                umutSahnesi(scanner, playerName);
        }

        public static void birlikteHayatSahnesi(Scanner scanner, String playerName) {
                System.out.println(
                                "\n\033[1;32mElena birlikte geçirdiğiniz güzel anıları paylaşıyor - nasıl tanıştığınız, ilk randevunuz, düğününüz.\033[0m");
                itirafSahnesi(scanner, playerName);
        }

        public static void ziyaretSorusuSahnesi(Scanner scanner, String playerName) {
                System.out.println(
                                "\n\033[1;32mElena neden uzak durduğunu açıklıyor - sizi tanımadığınızı görmek çok acı vericiydi.\033[0m");
                itirafSahnesi(scanner, playerName);
        }

        public static void sophieSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;32mElena size Sophie hakkında ve babasını ne kadar özlediği hakkında daha fazla bilgi veriyor.\033[0m");
                umutSahnesi(scanner, playerName);
        }

        public static void kazaDetaySahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;32mElena kaza ve iyileşme süreciniz hakkında acı verici detaylar veriyor.\033[0m");
                umutSahnesi(scanner, playerName);
        }

        public static void dahafazlaHatirlaSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;32mYoğun odaklanıyorsunuz ve daha fazla anı parçacığı çıkıyor.\033[0m");
                yardimHatirlaSahnesi(scanner, playerName);
        }

        public static void yardimHatirlaSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;32mElena anılarınızı birlikte yeniden inşa etmek için yardım etmeyi kabul ediyor.\033[0m");
                terapiSahnesi(scanner, playerName);
        }

        public static void kafaKarisikligiSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;32mKafa karışıklığınızı ifade ediyorsunuz ve Elena mücadelenizi anlıyor.\033[0m");
                terapiSahnesi(scanner, playerName);
        }

        public static void yalvarmaSahnesi(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;32mElena'ya kalması ve ilişkinize bir şans daha vermesi için yalvarıyorsunuz.\033[0m");
                terapiSahnesi(scanner, playerName);
        }

        public static void fedakarlikSahnesi(Scanner scanner, String playerName) {
                System.out.println(
                                "\n\033[1;32mElena'ya Sophie için en iyisini yapmasını, sizi geride bırakması anlamına gelse bile söylüyorsunuz.\033[0m");
                System.out.println(
                                "\n\033[1;35mSON: Özverili aşkınız Elena ve Sophie'nin yeni bir hayat kurmasına izin veriyor.\033[0m");
                System.out.println(
                                "\033[1;35mBazen aşk bırakmak anlamına gelir.\033[0m");
                System.out.println("\n\033[1;32mOynadığınız için teşekkürler, " + playerName + "!\033[0m");
        }

        public static void babalikSahnesi(Scanner scanner, String playerName) {
                System.out.println(
                                "\n\033[1;32mKendinizi Sophie'nin hak ettiği baba olmaya adamıyorsunuz, birlikte yeni anılar kuruyorsunuz.\033[0m");
                yeniAnılarSahnesi(scanner, playerName);
        }

        public static void tedaviSahnesi(Scanner scanner, String playerName) {
                System.out.println(
                                "\n\033[1;32mDeneysel tedaviyi takip ediyorsunuz, ama sonunda yeni aşkın hatırlanan aşk kadar değerli olduğunu anlıyorsunuz.\033[0m");
                yeniAnılarSahnesi(scanner, playerName);
        }
}
