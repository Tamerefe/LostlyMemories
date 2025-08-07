import java.util.Scanner;

public class storyenglish {
        public static void startGameEnglish(Scanner scanner) {

                System.out.println("\033[1;33mWhat is your name?\033[0m");
                System.out.print(">> ");
                String playerName = scanner.nextLine();

                System.out.println("\n\033[1;32mHello, " + playerName
                                + ". You wake up in a dark forest with no memory of who you are.\033[0m");
                System.out.println(
                                "\033[1;32mIn front of you, there are two paths: one is a misty trail, the other is an old stone bridge.\033[0m");
                System.out.println("\033[1;33mWhich path do you choose?\033[0m (1: Misty Trail / 2: Stone Bridge)");

                System.out.print(">> ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                        mistyPathEnglish(scanner);
                } else if (choice == 2) {
                        stoneBridgeEnglish(scanner);
                } else {
                        System.out.println("\033[1;31mInvalid choice. The shadows consume you...\033[0m");
                }
        }

        public static void mistyPathEnglish(Scanner scanner) {
                System.out.println(
                                "\033[1;32mYou walk along the misty trail, barely able to see your surroundings.\033[0m");
                System.out.println(
                                "\033[1;32mSuddenly, an old cabin appears before you. Do you want to enter?\033[0m (1: Yes / 2: No)");

                System.out.print(">> ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                        System.out.println(
                                        "\033[1;32mYou step inside the cabin and find an ancient book. As you open it, memories start flooding back...\033[0m");
                        System.out.println(
                                        "\033[1;32mThe book describes a hidden temple in the heart of the forest. Do you follow the clues?\033[0m (1: Yes / 2: No)");
                        System.out.print(">> ");
                        choice = scanner.nextInt();

                        if (choice == 1) {
                                System.out.println(
                                                "\033[1;32mYou journey deeper into the forest, encountering strange symbols and ruins.\033[0m");
                                System.out.println(
                                                "\033[1;32mYou find the temple, but a shadowy guardian blocks the entrance.\033[0m");
                                System.out.println(
                                                "\033[1;33mDo you challenge the guardian or attempt to sneak past?\033[0m (1: Challenge / 2: Sneak)");
                                System.out.print(">> ");
                                choice = scanner.nextInt();

                                if (choice == 1) {
                                        System.out.println(
                                                        "\033[1;32mYou fight bravely and defeat the guardian. Inside the temple, you find a glowing altar.\033[0m");
                                        System.out.println(
                                                        "\033[1;32mSuddenly, a mysterious spirit appears before you with ancient eyes full of wisdom.\033[0m");
                                        System.out.println(
                                                        "\033[1;33m'To unlock the secrets of your past, you must prove your strategic mind,' the spirit says.\033[0m");
                                        System.out.println(
                                                        "\033[1;33m'Choose your challenge: A game of wits (Tic-Tac-Toe) or a test of luck (Rock-Paper-Scissors)?'\033[0m");
                                        System.out.println("(1: Tic-Tac-Toe / 2: Rock-Paper-Scissors)");
                                        System.out.print(">> ");
                                        choice = scanner.nextInt();
                                        scanner.nextLine();

                                        boolean puzzleSolved = false;
                                        if (choice == 1) {
                                                puzzleSolved = playTicTacToeWithSpirit(scanner);
                                        } else if (choice == 2) {
                                                puzzleSolved = playRockPaperScissorsWithSpirit(scanner);
                                        } else {
                                                System.out.println(
                                                                "\033[1;31mThe spirit disapproves of your indecision and vanishes...\033[0m");
                                                System.out.println("\033[1;31mGame Over.\033[0m");
                                                return;
                                        }

                                        if (puzzleSolved) {
                                                System.out.println(
                                                                "\033[1;32mThe spirit nods approvingly and reveals pictures of your family and writings about your identity.\033[0m");
                                                System.out.println(
                                                                "\033[1;33m'Your mind is sharp. Now, what will you do with this knowledge?'\033[0m (1: Follow the clues / 2: Reject the past)");
                                                System.out.print(">> ");
                                                choice = scanner.nextInt();
                                                if (choice == 1) {
                                                        System.out.println(
                                                                        "\033[1;32mThe clues lead you to an island where you find your lost memories and identity. The spirit's blessing guides you home!\033[0m");
                                                        System.out.println("\033[1;32mYou win!\033[0m");
                                                } else {
                                                        System.out.println(
                                                                        "\033[1;31mYou reject your past and the temple begins to crumble. The shadows consume you...\033[0m");
                                                        System.out.println("\033[1;31mGame Over.\033[0m");
                                                }
                                        } else {
                                                System.out.println(
                                                                "\033[1;31mThe spirit shakes its head in disappointment and fades away, taking the secrets with it...\033[0m");
                                                System.out.println("\033[1;31mGame Over.\033[0m");
                                        }
                                } else {
                                        System.out.println(
                                                        "\033[1;31mYou try to sneak in but fail. The guardian banishes you to the shadows...\033[0m");
                                        System.out.println("\033[1;31mGame Over.\033[0m");
                                }
                        } else {
                                System.out.println(
                                                "\033[1;31mYou ignore the clues and leave the cabin. The shadows eventually find you...\033[0m");
                                System.out.println("\033[1;31mGame Over.\033[0m");
                        }
                } else {
                        System.out.println(
                                        "\033[1;31mYou decide not to enter and move away. However, the shadows consume you...\033[0m");
                        System.out.println("\033[1;31mGame Over.\033[0m");
                }
        }

        public static void stoneBridgeEnglish(Scanner scanner) {
                System.out
                                .println("\033[1;32mAs you cross the old stone bridge, a shadowy figure appears in the middle.\033[0m");
                System.out.println(
                                "\033[1;32mThe figure asks you who you are. If you answer incorrectly, the bridge will collapse.\033[0m");
                System.out.println(
                                "\033[1;33mWhat is your answer?\033[0m (1: The Unknown Wanderer / 2: Shadow Hunter)");

                System.out.print(">> ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                        System.out.println(
                                        "\033[1;32mThe shadow nods as if recognizing you and vanishes. You safely cross the bridge and find a forgotten village.\033[0m");
                        System.out.println(
                                        "\033[1;32mThe villagers seem to know you. They take you to an elder who reveals your past.\033[0m");
                        System.out.println(
                                        "\033[1;33mDo you stay to learn more or continue your journey?\033[0m (1: Stay / 2: Continue)");
                        System.out.print(">> ");
                        choice = scanner.nextInt();

                        if (choice == 1) {
                                System.out.println(
                                                "\033[1;32mThe elder reveals you are the lost guardian of the Shadow Realm! With these abilities, what will you do?\033[0m (1: Protect / 2: Destroy)");
                                System.out.print(">> ");
                                choice = scanner.nextInt();
                                if (choice == 1) {
                                        System.out.println(
                                                        "\033[1;32mYou protect the village and the people are grateful. You find your lost identity and become a true hero!\033[0m");
                                        System.out.println("\033[1;32mYou win!\033[0m");
                                } else {
                                        System.out.println(
                                                        "\033[1;31mYou destroy the village and the shadows consume you. You are lost forever...\033[0m");
                                        System.out.println("\033[1;31mGame Over.\033[0m");
                                }
                        } else {
                                System.out.println(
                                                "\033[1;31mYou continue your journey but the truth remains a mystery. You live in the shadows forever...\033[0m");
                                System.out.println("\033[1;31mGame Over.\033[0m");
                        }
                } else {
                        System.out.println(
                                        "\033[1;31mThe shadow perceives you as a threat and shatters the bridge! You fall into the abyss...\033[0m");
                        System.out.println("\033[1;31mGame Over.\033[0m");
                }
        }

        public static boolean playTicTacToeWithSpirit(Scanner scanner) {
                System.out.println(
                                "\033[1;35mThe spirit conjures a mystical Tic-Tac-Toe board made of light and shadow...\033[0m");

                char[][] board = {
                                { ' ', ' ', ' ' },
                                { ' ', ' ', ' ' },
                                { ' ', ' ', ' ' }
                };

                char playerSymbol = 'X';
                char spiritSymbol = 'O';
                boolean gameWon = false;
                boolean playerTurn = true;

                while (!gameWon && !isBoardFull(board)) {
                        displayBoard(board);

                        if (playerTurn) {
                                playerMove(board, playerSymbol, scanner);
                                gameWon = checkWinner(board, playerSymbol);
                                if (gameWon) {
                                        displayBoard(board);
                                        System.out.println("\033[1;32mYou have outwitted the spirit!\033[0m");
                                        return true;
                                }
                        } else {
                                spiritMove(board, spiritSymbol);
                                System.out.println("\033[1;35mThe spirit makes its move...\033[0m");
                                gameWon = checkWinner(board, spiritSymbol);
                                if (gameWon) {
                                        displayBoard(board);
                                        System.out.println("\033[1;31mThe spirit has defeated you...\033[0m");
                                        return false;
                                }
                        }

                        if (isBoardFull(board)) {
                                displayBoard(board);
                                System.out.println("\033[1;33mIt's a draw! The spirit appreciates your effort.\033[0m");
                                return true;
                        }

                        playerTurn = !playerTurn;
                }
                return false;
        }

        public static boolean playRockPaperScissorsWithSpirit(Scanner scanner) {
                System.out.println("\033[1;35mThe spirit challenges you to a game of Rock-Paper-Scissors!\033[0m");
                System.out.println(
                                "\033[1;35m'Best of 3 rounds will determine the winner,' the spirit declares.\033[0m");
                System.out.println(
                                "\033[1;35m'The spirit can analyze your previous moves to develop strategy...' it whispers.\033[0m");

                String[] choices = { "Rock", "Paper", "Scissors" };
                java.util.List<String> playerPreviousMoves = new java.util.ArrayList<>();
                int playerWins = 0;
                int spiritWins = 0;
                int round = 1;

                while (playerWins < 2 && spiritWins < 2) {
                        System.out.println("\n\033[1;33mRound " + round + ":\033[0m");
                        System.out.print("Enter your choice (Rock(r), Paper(p), Scissors(s)): ");
                        String playerChoice = scanner.nextLine().toLowerCase();

                        String playerMove = "";
                        switch (playerChoice) {
                                case "r":
                                case "rock":
                                        playerMove = "Rock";
                                        break;
                                case "p":
                                case "paper":
                                        playerMove = "Paper";
                                        break;
                                case "s":
                                case "scissors":
                                        playerMove = "Scissors";
                                        break;
                                default:
                                        System.out.println("Invalid choice, spirit chooses for you...");
                                        playerMove = choices[(int) (Math.random() * 3)];
                        }

                        // Spirit makes strategic move
                        String spiritMove = spiritStrategicMove(playerPreviousMoves, choices);
                        playerPreviousMoves.add(playerMove);

                        System.out.println("Your choice: " + playerMove);
                        System.out.println("Spirit's choice: " + spiritMove);

                        if (playerMove.equals(spiritMove)) {
                                System.out.println("\033[1;33mTie! No one wins this round.\033[0m");
                        } else if ((playerMove.equals("Rock") && spiritMove.equals("Scissors")) ||
                                        (playerMove.equals("Paper") && spiritMove.equals("Rock")) ||
                                        (playerMove.equals("Scissors") && spiritMove.equals("Paper"))) {
                                System.out.println("\033[1;32mYou win this round!\033[0m");
                                playerWins++;
                        } else {
                                System.out.println("\033[1;31mThe spirit wins this round!\033[0m");
                                spiritWins++;
                        }

                        System.out.println("Score - You: " + playerWins + " | Spirit: " + spiritWins);
                        round++;
                }

                if (playerWins > spiritWins) {
                        System.out.println(
                                        "\033[1;32mCongratulations! You have defeated the spirit in battle of chance!\033[0m");
                        return true;
                } else {
                        System.out.println("\033[1;31mThe spirit has proven superior in the game of chance...\033[0m");
                        return false;
                }
        }

        private static void displayBoard(char[][] board) {
                System.out.println("\033[1;36mr/c 1   2   3\033[0m");
                System.out.println("  -------------");
                for (int i = 0; i < 3; i++) {
                        System.out.print((i + 1) + " | ");
                        for (int j = 0; j < 3; j++) {
                                System.out.print(board[i][j] + " | ");
                        }
                        System.out.println("\n  -------------");
                }
        }

        private static boolean checkWinner(char[][] board, char player) {
                for (int i = 0; i < 3; i++) {
                        if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                                        (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                                return true;
                        }
                }
                if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                                (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
                        return true;
                }
                return false;
        }

        private static boolean isBoardFull(char[][] board) {
                for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                                if (board[i][j] == ' ') {
                                        return false;
                                }
                        }
                }
                return true;
        }

        private static void playerMove(char[][] board, char player, Scanner scanner) {
                int row, col;
                while (true) {
                        System.out.print("Enter row (1-3) and column (1-3): ");
                        row = scanner.nextInt() - 1;
                        col = scanner.nextInt() - 1;
                        scanner.nextLine(); // Clear buffer

                        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                                board[row][col] = player;
                                break;
                        } else {
                                System.out.println("Invalid move. Try again.");
                        }
                }
        }

        private static void spiritMove(char[][] board, char spirit) {
                // Simple AI: Try to win, then block player, then random
                if (makeWinningMove(board, spirit) || makeBlockingMove(board, spirit)
                                || makeRandomMove(board, spirit)) {
                        return;
                }
        }

        private static boolean makeWinningMove(char[][] board, char spirit) {
                for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                                if (board[i][j] == ' ') {
                                        board[i][j] = spirit;
                                        if (checkWinner(board, spirit)) {
                                                return true;
                                        }
                                        board[i][j] = ' ';
                                }
                        }
                }
                return false;
        }

        private static boolean makeBlockingMove(char[][] board, char spirit) {
                char player = (spirit == 'O') ? 'X' : 'O';
                for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                                if (board[i][j] == ' ') {
                                        board[i][j] = player;
                                        if (checkWinner(board, player)) {
                                                board[i][j] = spirit;
                                                return true;
                                        }
                                        board[i][j] = ' ';
                                }
                        }
                }
                return false;
        }

        private static boolean makeRandomMove(char[][] board, char spirit) {
                java.util.List<int[]> availableMoves = new java.util.ArrayList<>();
                for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                                if (board[i][j] == ' ') {
                                        availableMoves.add(new int[] { i, j });
                                }
                        }
                }
                if (!availableMoves.isEmpty()) {
                        int[] move = availableMoves.get((int) (Math.random() * availableMoves.size()));
                        board[move[0]][move[1]] = spirit;
                        return true;
                }
                return false;
        }

        // Strategic Rock-Paper-Scissors AI for the spirit
        private static String spiritStrategicMove(java.util.List<String> playerPreviousMoves, String[] choices) {
                // If not enough data yet, choose randomly
                if (playerPreviousMoves.size() < 2) {
                        return choices[(int) (Math.random() * 3)];
                }

                // Find the player's most frequently used move
                java.util.Map<String, Integer> moveFrequency = new java.util.HashMap<>();
                for (String move : playerPreviousMoves) {
                        moveFrequency.put(move, moveFrequency.getOrDefault(move, 0) + 1);
                }

                String mostUsedMove = "";
                int maxFrequency = 0;
                for (java.util.Map.Entry<String, Integer> entry : moveFrequency.entrySet()) {
                        if (entry.getValue() > maxFrequency) {
                                maxFrequency = entry.getValue();
                                mostUsedMove = entry.getKey();
                        }
                }

                // Choose the move that beats the player's most used move
                switch (mostUsedMove) {
                        case "Rock":
                                return "Paper"; // Paper beats Rock
                        case "Paper":
                                return "Scissors"; // Scissors beats Paper
                        case "Scissors":
                                return "Rock"; // Rock beats Scissors
                        default:
                                return choices[(int) (Math.random() * 3)];
                }
        }
}