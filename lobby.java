import java.util.Scanner;

public class lobby {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\033[1;34m"); // Set text color to blue
        System.out.println("****************************************");
        System.out.println("*                                      *");
        System.out.println("*      Welcome to Lostly Memories!     *");
        System.out.println("*                                      *");
        System.out.println("****************************************");
        System.out.println("\033[0m"); // Reset text color

        while (true) {
            System.out.println("\033[1;33mSelect Language / Dil Seçiniz: (1: English / 2: Türkçe)\033[0m");
            System.out.println("\033[0;37m3: Endings Gallery / Sonlar Galerisi   4: Exit / Çıkış\033[0m");
            System.out.print(">> ");
            int languageChoice = gamestate.readChoice(scanner);

            if (languageChoice == 1) {
                storyenglish.startGameEnglish(scanner);
            } else if (languageChoice == 2) {
                storyturkish.startGameTurkish(scanner);
            } else if (languageChoice == 3) {
                gamestate.showEndingsGallery();
                System.out.println();
                continue;
            } else if (languageChoice == 4) {
                break;
            } else {
                System.out.println("\033[1;31mInvalid selection. Defaulting to English.\033[0m");
                storyenglish.startGameEnglish(scanner);
            }

            System.out.println("\n\033[1;33mPlay again? / Tekrar oyna? (1: Yes-Evet / 2: No-Hayır)\033[0m");
            System.out.print(">> ");
            if (gamestate.readChoice(scanner) != 1) {
                break;
            }
            System.out.println();
        }

        System.out.println("\033[1;35mGoodbye! / Hoşça kal!\033[0m");
        scanner.close();
    }
}
