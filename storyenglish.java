import java.util.Scanner;

public class storyenglish {
        public static void startGameEnglish(Scanner scanner) {

                System.out.println("\033[1;33mWhat is your name?\033[0m");
                System.out.print(">> ");
                String playerName = scanner.nextLine().trim();
                if (playerName.isEmpty()) {
                        playerName = "Traveler";
                }
                gamestate.reset(false);

                System.out.println("\n\033[1;35m=== LOSTLY MEMORIES: A Journey Through Time ===\033[0m");
                gamestate.printTips();
                System.out.println("\n\033[1;32mHello, " + playerName
                                + ". You find an old, dusty package on your doorstep with no return address.\033[0m");
                System.out.println(
                                "\033[1;32mInside is an antique music box and a faded letter that reads:\033[0m");
                System.out.println(
                                "\033[1;33m'The memories you've lost await you. Wind the music box when you're ready to remember.'\033[0m");
                System.out.println("\033[1;32mYour hands tremble as you hold the delicate mechanism.\033[0m");
                System.out.println("\033[1;33mWhat do you choose?\033[0m");
                System.out.println("1: Wind the music box immediately");
                System.out.println("2: Read the letter more carefully first");
                System.out.println("3: Put everything away for now");

                System.out.print(">> ");
                int choice = gamestate.readChoice(scanner);

                if (choice == 1) {
                        musicBoxScene(scanner, playerName);
                } else if (choice == 2) {
                        letterScene(scanner, playerName);
                } else if (choice == 3) {
                        delayScene(scanner, playerName);
                } else {
                        System.out.println(
                                        "\033[1;31mInvalid choice. You hesitate too long and the moment passes...\033[0m");
                        delayScene(scanner, playerName);
                }
        }

        public static void letterScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Hidden Messages ===\033[0m");
                System.out.println(
                                "\033[1;32mAs you examine the letter under better light, you notice faint writing in the margins.\033[0m");
                System.out.println(
                                "\033[1;32mIt appears to be written in a different hand:\033[0m");
                System.out.println(
                                "\033[1;33m'Remember the lighthouse by the sea, where we made our promise under the stars.'\033[0m");
                System.out.println(
                                "\033[1;32mThe paper smells of salt and old roses. Your heart begins to race with a strange familiarity.\033[0m");
                gamestate.awardFragment("promise", "The Promise Under the Stars", "Yıldızlar Altındaki Söz");
                System.out.println("\033[1;33mWhat do you choose?\033[0m");
                System.out.println("1: Wind the music box now");
                System.out.println("2: Try to remember the lighthouse");
                System.out.println("3: Search for more clues in the package");

                System.out.print(">> ");
                int choice = gamestate.readChoice(scanner);

                if (choice == 1) {
                        musicBoxScene(scanner, playerName);
                } else if (choice == 2) {
                        lighthouseMemoryScene(scanner, playerName);
                } else if (choice == 3) {
                        searchPackageScene(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mYour hands shake with uncertainty...\033[0m");
                        musicBoxScene(scanner, playerName);
                }
        }

        public static void delayScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Restless Night ===\033[0m");
                System.out.println(
                                "\033[1;32mYou try to sleep, but the music box calls to you from the other room.\033[0m");
                System.out.println(
                                "\033[1;32mStrange dreams fill your mind - flashes of a woman with auburn hair laughing by the ocean,\033[0m");
                System.out.println(
                                "\033[1;32ma ring being placed on your finger, promises whispered in the moonlight.\033[0m");
                System.out.println(
                                "\033[1;32mYou wake at 3 AM, unable to resist any longer.\033[0m");
                System.out.println("\033[1;33mWhat do you choose?\033[0m");
                System.out.println("1: Go wind the music box");
                System.out.println("2: Write down what you remember from the dreams");
                System.out.println("3: Call someone to talk about this");

                System.out.print(">> ");
                int choice = gamestate.readChoice(scanner);

                if (choice == 1) {
                        musicBoxScene(scanner, playerName);
                } else if (choice == 2) {
                        dreamJournalScene(scanner, playerName);
                } else if (choice == 3) {
                        phoneCallScene(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mYou toss and turn, unable to find peace...\033[0m");
                        musicBoxScene(scanner, playerName);
                }
        }

        public static void searchPackageScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Hidden Compartment ===\033[0m");
                System.out.println(
                                "\033[1;32mFeeling around the package, you discover a hidden compartment.\033[0m");
                System.out.println(
                                "\033[1;32mInside, you find a small brass key and a photograph of yourself with a woman you don't recognize,\033[0m");
                System.out.println("\033[1;32mstanding in front of a lighthouse.\033[0m");
                System.out.println(
                                "\033[1;33mOn the back, someone has written: 'Our Wedding Day - June 15th' but the year is smudged.\033[0m");
                System.out.println(
                                "\033[1;32mThe woman's eyes seem to stare directly at you, full of love and sadness.\033[0m");
                gamestate.awardFragment("wedding_photo", "Our Wedding Day, June 15th", "Düğün Günümüz, 15 Haziran");
                System.out.println("\033[1;33mWhat do you choose?\033[0m");
                System.out.println("1: Wind the music box with the key");
                System.out.println("2: Study the photograph more closely");
                System.out.println("3: Try to remember this woman");

                System.out.print(">> ");
                int choice = gamestate.readChoice(scanner);

                if (choice == 1) {
                        deeperMemoryScene(scanner, playerName);
                } else if (choice == 2) {
                        photographScene(scanner, playerName);
                } else if (choice == 3) {
                        rememberWomanScene(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mThe photograph slips from your trembling hands...\033[0m");
                        photographScene(scanner, playerName);
                }
        }

        public static void musicBoxScene(Scanner scanner, String playerName) {
                playMelodyOnce(scanner);
                System.out.println("\n\033[1;36m=== First Memory ===\033[0m");
                System.out.println(
                                "\033[1;32mAs the music box plays its haunting melody, the world around you begins to shimmer and fade.\033[0m");
                System.out.println(
                                "\033[1;32mYou find yourself standing on a cliff overlooking the ocean.\033[0m");
                System.out.println(
                                "\033[1;32mA woman with auburn hair approaches you, her white dress flowing in the sea breeze.\033[0m");
                System.out.println(
                                "\033[1;33m'You came back to me,' she whispers, tears in her eyes. 'I've been waiting so long, "
                                                + playerName + ".'\033[0m");
                System.out.println("\033[1;32mThe name feels foreign yet familiar on your lips.\033[0m");
                gamestate.awardFragment("cliff", "Elena on the Cliff", "Uçurumdaki Elena");
                System.out.println("\033[1;33mWhat do you choose?\033[0m");
                System.out.println("1: Ask her who she is");
                System.out.println("2: Tell her you don't remember");
                System.out.println("3: Embrace her without questions");

                System.out.print(">> ");
                int choice = gamestate.readChoice(scanner);

                if (choice == 1) {
                        elenaIntroScene(scanner, playerName);
                } else if (choice == 2) {
                        confessionScene(scanner, playerName);
                } else if (choice == 3) {
                        embraceScene(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mYou stand frozen, overwhelmed by emotions...\033[0m");
                        confessionScene(scanner, playerName);
                }
        }

        public static void deeperMemoryScene(Scanner scanner, String playerName) {
                playMelodyOnce(scanner);
                System.out.println("\n\033[1;36m=== Deeper Memory ===\033[0m");
                System.out.println(
                                "\033[1;32mThe brass key unlocks a different melody from the music box.\033[0m");
                System.out.println("\033[1;32mThis time, the vision is clearer.\033[0m");
                System.out.println(
                                "\033[1;32mYou're in a small cottage by the sea, and the woman - Elena - is showing you a positive pregnancy test.\033[0m");
                System.out.println(
                                "\033[1;32mHer face is radiant with joy, but there's also fear in her eyes.\033[0m");
                System.out.println(
                                "\033[1;33m'Everything will change now,' she says. 'Promise me you'll never forget this moment, no matter what happens.'\033[0m");
                gamestate.awardFragment("first_news", "News of a Child", "Bir Çocuk Haberi");
                System.out.println("\033[1;33mWhat do you choose?\033[0m");
                System.out.println("1: Promise her you'll remember");
                System.out.println("2: Ask what she's afraid of");
                System.out.println("3: Hold her close");

                System.out.print(">> ");
                int choice = gamestate.readChoice(scanner);

                if (choice == 1) {
                        promiseScene(scanner, playerName);
                } else if (choice == 2) {
                        fearScene(scanner, playerName);
                } else if (choice == 3) {
                        comfortScene(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mThe memory fades as your emotions overwhelm you...\033[0m");
                        comfortScene(scanner, playerName);
                }
        }

        public static void elenaIntroScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Lost Love ===\033[0m");
                System.out.println("\033[1;32mElena's face crumbles with pain.\033[0m");
                System.out.println(
                                "\033[1;33m'I'm Elena, your wife. We were married for three years before the accident.'\033[0m");
                System.out.println(
                                "\033[1;33m'You hit your head so hard... the doctors said you might never remember us, but I kept hoping.'\033[0m");
                System.out.println(
                                "\033[1;32mShe shows you a wedding ring that matches the tan line on your finger.\033[0m");
                System.out.println(
                                "\033[1;33m'I've been sending you these packages for months, hoping something would bring you back.'\033[0m");
                System.out.println("\033[1;33mWhat do you choose?\033[0m");
                System.out.println("1: Ask about the accident");
                System.out.println("2: Ask about your life together");
                System.out.println("3: Ask why she didn't visit you");

                System.out.print(">> ");
                int choice = gamestate.readChoice(scanner);

                if (choice == 1) {
                        accidentScene(scanner, playerName);
                } else if (choice == 2) {
                        lifeTogetherScene(scanner, playerName);
                } else if (choice == 3) {
                        visitQuestionScene(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mThe weight of this revelation overwhelms you...\033[0m");
                        accidentScene(scanner, playerName);
                }
        }

        public static void confessionScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== The Truth Revealed ===\033[0m");
                System.out.println("\033[1;32mElena nods sadly.\033[0m");
                System.out.println(
                                "\033[1;33m'I know you don't. The car accident took that from us.'\033[0m");
                System.out.println(
                                "\033[1;33m'But " + playerName + ", there's something else you need to know.'\033[0m");
                System.out.println(
                                "\033[1;33m'We had a daughter, Sophie. She's five now, and she asks about her daddy every day.'\033[0m");
                System.out.println(
                                "\033[1;32mHer voice breaks as she pulls out a small photo of a little girl with your eyes and her mother's smile.\033[0m");
                System.out.println(
                                "\033[1;33m'I've been showing her pictures, telling her stories, hoping that someday...'\033[0m");
                System.out.println("\033[1;33mWhat do you choose?\033[0m");
                System.out.println("1: Ask to meet Sophie");
                System.out.println("2: Ask about the accident in detail");
                System.out.println("3: Ask if there's any hope of remembering");

                System.out.print(">> ");
                int choice = gamestate.readChoice(scanner);

                if (choice == 1) {
                        sophieScene(scanner, playerName);
                } else if (choice == 2) {
                        accidentDetailScene(scanner, playerName);
                } else if (choice == 3) {
                        hopeScene(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mYour heart breaks as the truth sinks in...\033[0m");
                        sophieScene(scanner, playerName);
                }
        }

        public static void embraceScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Familiar Warmth ===\033[0m");
                System.out.println(
                                "\033[1;32mAs you hold Elena, fragments of memories begin flooding back.\033[0m");
                System.out.println(
                                "\033[1;32mHer laugh, the way she hummed while cooking, lazy Sunday mornings in bed, building a crib together.\033[0m");
                System.out.println(
                                "\033[1;32mBut they're like pieces of a puzzle with most parts missing.\033[0m");
                System.out.println(
                                "\033[1;33m'I can feel something,' you whisper. 'But it's like looking through fog.'\033[0m");
                System.out.println(
                                "\033[1;32mElena pulls back to look at you, hope shining in her eyes.\033[0m");
                gamestate.awardFragment("sundays", "Lazy Sunday Mornings", "Tembel Pazar Sabahları");
                gamestate.addElenaBond(1);
                System.out.println("\033[1;33mWhat do you choose?\033[0m");
                System.out.println("1: Try to remember more");
                System.out.println("2: Ask her to help you remember");
                System.out.println("3: Tell her about the confusion you feel");

                System.out.print(">> ");
                int choice = gamestate.readChoice(scanner);

                if (choice == 1) {
                        rememberMoreScene(scanner, playerName);
                } else if (choice == 2) {
                        helpRememberScene(scanner, playerName);
                } else if (choice == 3) {
                        confusionScene(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mThe emotions become too overwhelming...\033[0m");
                        confusionScene(scanner, playerName);
                }
        }

        public static void hopeScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Medical Reality ===\033[0m");
                System.out.println("\033[1;32mElena pulls out a folder of medical documents.\033[0m");
                System.out.println(
                                "\033[1;33m'Dr. Martinez says there's still a chance. The brain can heal in mysterious ways, sometimes years later.'\033[0m");
                System.out.println(
                                "\033[1;33m'But " + playerName + ", I can't keep waiting forever.'\033[0m");
                System.out.println(
                                "\033[1;33m'Sophie needs stability, and I... I've been offered a job in Portland.'\033[0m");
                System.out.println(
                                "\033[1;33m'Better pay, better schools. But it would mean leaving everything we built here.'\033[0m");
                System.out.println("\033[1;33mWhat do you choose?\033[0m");
                System.out.println("1: Ask her not to leave");
                System.out.println("2: Tell her to do what's best for Sophie");
                System.out.println("3: Suggest trying therapy together first");

                System.out.print(">> ");
                int choice = gamestate.readChoice(scanner);

                if (choice == 1) {
                        pleadingScene(scanner, playerName);
                } else if (choice == 2) {
                        sacrificeScene(scanner, playerName);
                } else if (choice == 3) {
                        therapyScene(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mThe weight of the decision paralyzes you...\033[0m");
                        therapyScene(scanner, playerName);
                }
        }

        public static void therapyScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== A New Beginning ===\033[0m");
                System.out.println(
                                "\033[1;32mOver the following months, you attend therapy sessions together.\033[0m");
                System.out.println("\033[1;32mSome days are harder than others.\033[0m");
                System.out.println(
                                "\033[1;32mYou learn about your old life through photos, videos, and Elena's patient storytelling.\033[0m");
                System.out.println(
                                "\033[1;32mSlowly, you begin to fall in love with Elena again - not remembering the old love, but discovering a new one.\033[0m");
                System.out.println(
                                "\033[1;32mSophie starts visiting, cautiously at first, then with growing comfort.\033[0m");
                System.out.println("\033[1;33mWhat do you choose?\033[0m");
                System.out.println("1: Continue building new memories");
                System.out.println("2: Focus on being the father Sophie needs");
                System.out.println("3: Pursue experimental memory treatment");

                System.out.print(">> ");
                int choice = gamestate.readChoice(scanner);

                if (choice == 1) {
                        newMemoriesScene(scanner, playerName);
                } else if (choice == 2) {
                        fatherhoodScene(scanner, playerName);
                } else if (choice == 3) {
                        treatmentScene(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mYou choose to let time guide your path...\033[0m");
                        newMemoriesScene(scanner, playerName);
                }
        }

        public static void newMemoriesScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Second Chances ===\033[0m");
                System.out.println(
                                "\033[1;32mA year later, you're at the lighthouse again, but this time with Sophie on your shoulders and Elena's hand in yours.\033[0m");
                System.out.println(
                                "\033[1;32mThe memories of your past life remain elusive, but the present is filled with new joy.\033[0m");
                System.out.println(
                                "\033[1;32mSophie shows you the shells she's collected, and Elena reads the same Neruda poems that brought you together the first time.\033[0m");
                System.out.println(
                                "\033[1;33mMaybe some love stories get a second chapter.\033[0m");
                System.out.println("\033[1;33mWhat do you choose?\033[0m");
                System.out.println("1: Propose to Elena again");
                System.out.println("2: Decide to move away for a fresh start");
                System.out.println("3: Stay and build your new life here");
                boolean lastSong = gamestate.fragments.size() >= gamestate.TRUE_ENDING_FRAGMENTS;
                if (lastSong) {
                        System.out.println("\033[1;36m4: Wind the music box one last time\033[0m");
                } else {
                        System.out.println("\033[0;37m(Back home, the music box sits silent on the shelf. Memory fragments: "
                                        + gamestate.fragments.size() + "/" + gamestate.TRUE_ENDING_FRAGMENTS + ")\033[0m");
                }

                System.out.print(">> ");
                int choice = gamestate.readChoice(scanner);

                if (choice == 4 && lastSong) {
                        lastSongScene(scanner, playerName);
                } else if (choice == 1) {
                        proposalAgainScene(scanner, playerName);
                } else if (choice == 2) {
                        freshStartScene(scanner, playerName);
                } else if (choice == 3) {
                        stayAndBuildScene(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mYou let the moment guide your heart...\033[0m");
                        proposalAgainScene(scanner, playerName);
                }
        }

        public static void proposalAgainScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Love Renewed ===\033[0m");
                System.out.println(
                                "\033[1;32mAt the same lighthouse where you first proposed, you get down on one knee again.\033[0m");
                System.out.println(
                                "\033[1;32mBut this time, Sophie helps, holding a ring pop and giggling.\033[0m");
                System.out.println(
                                "\033[1;33m'Elena, I may not remember loving you before, but I choose to love you now and every day forward.'\033[0m");
                System.out.println("\033[1;33m'Will you marry me again?'\033[0m");
                System.out.println(
                                "\033[1;32mThrough tears of joy, she says yes. Some love transcends memory.\033[0m");
                System.out.println("\033[1;33mWhat do you choose?\033[0m");
                System.out.println("1: Start planning your new wedding");
                System.out.println("2: Have a quiet ceremony with just Sophie");

                System.out.print(">> ");
                int choice = gamestate.readChoice(scanner);

                if (choice == 1) {
                        wedding2Scene(scanner, playerName);
                } else if (choice == 2) {
                        quietWeddingScene(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mYou choose to let love decide...\033[0m");
                        quietWeddingScene(scanner, playerName);
                }
        }

        public static void wedding2Scene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Full Circle ===\033[0m");
                System.out.println(
                                "\033[1;32mYour second wedding is different but beautiful.\033[0m");
                System.out.println(
                                "\033[1;32mFriends you don't remember stand beside new friends you've made.\033[0m");
                System.out.println(
                                "\033[1;32mSophie is your flower girl, beaming with pride.\033[0m");
                System.out.println(
                                "\033[1;32mAs you dance with Elena to the same song that played at your first wedding,\033[0m");
                System.out.println(
                                "\033[1;32myou don't remember the steps, but somehow your body knows them.\033[0m");
                System.out.println("\033[1;33mLove finds a way.\033[0m");
                System.out.println(
                                "\n\033[1;35mENDING: You built a new life from the ashes of forgotten memories.\033[0m");
                System.out.println(
                                "\033[1;35mSometimes the greatest love stories are about falling in love with the same person twice.\033[0m");
                System.out.println("\n\033[1;32mThank you for playing, " + playerName + "!\033[0m");
                gamestate.unlockEnding("second_wedding");
        }

        public static void quietWeddingScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Family First ===\033[0m");
                System.out.println(
                                "\033[1;32mYou have a small ceremony in your backyard, just the three of you and an officiant.\033[0m");
                System.out.println(
                                "\033[1;32mSophie wears a flower crown she made herself and declares herself the 'best daughter' instead of best man.\033[0m");
                System.out.println("\033[1;32mIt's perfect in its simplicity.\033[0m");
                System.out.println(
                                "\033[1;32mAs you kiss Elena, Sophie cheers and throws flower petals everywhere.\033[0m");
                System.out.println(
                                "\n\033[1;35mENDING: In choosing a quiet celebration, you discovered that the most important moments\033[0m");
                System.out.println(
                                "\033[1;35mare the ones shared with those you love most.\033[0m");
                System.out.println("\n\033[1;32mThank you for playing, " + playerName + "!\033[0m");
                gamestate.unlockEnding("quiet_wedding");
        }

        public static void freshStartScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== New Horizons ===\033[0m");
                System.out.println(
                                "\033[1;32mYou decide to move to Portland together, leaving the weight of forgotten memories behind.\033[0m");
                System.out.println(
                                "\033[1;32mSophie is excited about her new school, and Elena has taken the job offer.\033[0m");
                System.out.println(
                                "\033[1;32mAs you pack the music box carefully in tissue paper, you realize some treasures are worth keeping,\033[0m");
                System.out.println("\033[1;32meven if you don't remember why they're precious.\033[0m");
                System.out.println(
                                "\n\033[1;35mENDING: Sometimes moving forward means leaving the past behind.\033[0m");
                System.out.println(
                                "\033[1;35mYou created a new family story in a new place, proving that love can bloom anywhere.\033[0m");
                System.out.println("\n\033[1;32mThank you for playing, " + playerName + "!\033[0m");
                gamestate.unlockEnding("fresh_start");
        }

        public static void stayAndBuildScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Roots Run Deep ===\033[0m");
                System.out.println(
                                "\033[1;32mYou choose to stay in the town where your love story began.\033[0m");
                System.out.println(
                                "\033[1;32mYou take over the small bookstore where you and Elena first met,\033[0m");
                System.out.println("\033[1;32mand it becomes a gathering place for the community.\033[0m");
                System.out.println(
                                "\033[1;32mSophie helps you organize the children's section, and Elena starts a poetry reading group.\033[0m");
                System.out.println("\033[1;32mThe lighthouse remains your special place.\033[0m");
                System.out.println(
                                "\n\033[1;35mENDING: By staying where your story began, you honored both your past and present.\033[0m");
                System.out.println(
                                "\033[1;35mThe bookstore became a symbol of second chances and enduring love.\033[0m");
                System.out.println("\n\033[1;32mThank you for playing, " + playerName + "!\033[0m");
                gamestate.unlockEnding("roots");
        }

        // Additional scenes for completeness
        public static void lighthouseMemoryScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Lighthouse Memories ===\033[0m");
                System.out.println(
                                "\033[1;32mYou close your eyes and try to remember the lighthouse.\033[0m");
                System.out.println(
                                "\033[1;32mFragments come to you: the sound of waves, a woman's laughter, the feeling of sand between your toes.\033[0m");
                System.out.println(
                                "\033[1;32mBut the harder you try to grasp these memories, the more they slip away like water through your fingers.\033[0m");
                System.out.println("\033[1;33mFrustrated, you decide to wind the music box after all.\033[0m");
                musicBoxScene(scanner, playerName);
        }

        public static void dreamJournalScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Dream Journal ===\033[0m");
                System.out.println(
                                "\033[1;32mYou write down everything you can remember from the dreams.\033[0m");
                System.out.println(
                                "\033[1;32mThe woman's face, the ring, the feeling of happiness mixed with loss.\033[0m");
                System.out.println(
                                "\033[1;32mAs you write, more details surface: a small child's laughter, the smell of coffee in the morning,\033[0m");
                System.out.println("\033[1;32ma lullaby hummed softly.\033[0m");
                gamestate.awardFragment("lullaby", "The Lullaby", "Ninni");
                System.out.println(
                                "\033[1;33mThe journal entries only make you more curious about the music box.\033[0m");
                musicBoxScene(scanner, playerName);
        }

        public static void phoneCallScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Late Night Call ===\033[0m");
                System.out.println(
                                "\033[1;32mYou pick up the phone, but realize you don't know who to call.\033[0m");
                System.out.println(
                                "\033[1;32mYour phone contacts seem foreign, like they belong to someone else's life.\033[0m");
                System.out.println(
                                "\033[1;32mThe loneliness overwhelms you, and you put the phone down.\033[0m");
                System.out.println(
                                "\033[1;33mThe music box seems like your only connection to answers.\033[0m");
                System.out.println(
                                "\033[1;32mThen you notice it: a phone number pencilled faintly inside the lid of the box.\033[0m");
                System.out.println("\033[1;33mWhat do you choose?\033[0m");
                System.out.println("1: Call the number");
                System.out.println("2: Wind the music box");

                System.out.print(">> ");
                int choice = gamestate.readChoice(scanner);

                if (choice == 1) {
                        voiceInTheDarkScene(scanner, playerName);
                } else {
                        musicBoxScene(scanner, playerName);
                }
        }

        public static void voiceInTheDarkScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== A Voice in the Dark ===\033[0m");
                System.out.println("\033[1;32mThe phone rings four times. Then a woman answers, her voice thick with sleep.\033[0m");
                System.out.println("\033[1;33m'Hello...?'\033[0m");
                System.out.println("\033[1;32mYou say nothing, but she hears your breathing. The silence stretches.\033[0m");
                System.out.println("\033[1;33m'" + playerName + "? ...Is that you?'\033[0m");
                System.out.println(
                                "\033[1;32mShe is crying now, softly. 'The lighthouse. At dawn. Please... just come.'\033[0m");
                System.out.println("\033[1;33mWhat do you choose?\033[0m");
                System.out.println("1: Drive to the lighthouse before sunrise");
                System.out.println("2: Hang up and wind the music box instead");

                System.out.print(">> ");
                int choice = gamestate.readChoice(scanner);

                if (choice == 1) {
                        dawnLighthouseScene(scanner, playerName);
                } else {
                        System.out.println("\033[1;31mYour hand shakes as you set the phone down...\033[0m");
                        musicBoxScene(scanner, playerName);
                }
        }

        public static void dawnLighthouseScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Dawn at the Lighthouse ===\033[0m");
                System.out.println(
                                "\033[1;32mThe sky is turning pink when you arrive. The lighthouse is smaller than in the photograph,\033[0m");
                System.out.println("\033[1;32mits white paint peeling in the salt wind.\033[0m");
                System.out.println(
                                "\033[1;32mA woman with auburn hair stands at the railing, a coat thrown over her pajamas.\033[0m");
                System.out.println(
                                "\033[1;32mWhen she turns and sees you, her hand flies to her mouth.\033[0m");
                System.out.println("\033[1;33m'You came. You actually came.'\033[0m");
                System.out.println(
                                "\033[1;32mYou want to say her name, but you don't know it. The wanting hurts more than you expected.\033[0m");
                gamestate.addElenaBond(2);
                System.out.println("\033[1;33m'I'm sorry,' you finally say. 'I don't remember you.'\033[0m");
                System.out.println("\033[1;33m'I know,' she whispers. 'I'm Elena.'\033[0m");
                confessionScene(scanner, playerName);
        }

        public static void photographScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Studying the Past ===\033[0m");
                System.out.println(
                                "\033[1;32mYou study every detail of the photograph.\033[0m");
                System.out.println(
                                "\033[1;32mThe lighthouse in the background, the way the woman's hand rests on your chest,\033[0m");
                System.out.println("\033[1;32mthe genuine happiness in both your faces.\033[0m");
                System.out.println(
                                "\033[1;32mThis was clearly a moment of pure joy, but it feels like looking at strangers.\033[0m");
                System.out.println("\033[1;33mYou need answers, and the music box holds the key.\033[0m");
                deeperMemoryScene(scanner, playerName);
        }

        public static void rememberWomanScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Trying to Remember ===\033[0m");
                System.out.println(
                                "\033[1;32mYou stare at the woman's face, willing yourself to remember.\033[0m");
                System.out.println(
                                "\033[1;32mThere's something about her eyes, something familiar, but it's like trying to catch smoke.\033[0m");
                System.out.println(
                                "\033[1;32mThe harder you concentrate, the more your head begins to ache.\033[0m");
                System.out.println(
                                "\033[1;33mPerhaps the music box will unlock what your mind cannot.\033[0m");
                deeperMemoryScene(scanner, playerName);
        }

        // Short connecting scenes that lead back into the main branches
        public static void promiseScene(Scanner scanner, String playerName) {
                System.out.println(
                                "\n\033[1;32mYou promise Elena you'll remember, feeling the weight of that commitment.\033[0m");
                System.out.println(
                                "\033[1;32mShe presses your hand to her stomach and laughs through her tears. 'Both of us are holding you to it.'\033[0m");
                System.out.println(
                                "\033[1;32mThe vision wavers. The cottage dissolves, and you're back on the cliff with her - older now, tired, waiting.\033[0m");
                gamestate.addElenaBond(1);
                confessionScene(scanner, playerName);
        }

        public static void fearScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;32mElena explains her fears about the future and raising a child.\033[0m");
                System.out.println(
                                "\033[1;33m'My father left when I was six. What if I don't know how to do this? What if you leave too?'\033[0m");
                System.out.println(
                                "\033[1;32mYou hear yourself answer, in a voice that is yours and not yours: 'I'm not going anywhere.'\033[0m");
                System.out.println(
                                "\033[1;32mThe words echo strangely. You wonder if they turned out to be a lie.\033[0m");
                gamestate.addElenaBond(1);
                confessionScene(scanner, playerName);
        }

        public static void comfortScene(Scanner scanner, String playerName) {
                System.out.println(
                                "\n\033[1;32mYou hold Elena close, feeling a deep connection despite the lost memories.\033[0m");
                System.out.println(
                                "\033[1;32mHer hair smells of lavender. Your arms know exactly where to rest, even if your mind doesn't.\033[0m");
                gamestate.addElenaBond(1);
                confessionScene(scanner, playerName);
        }

        public static void accidentScene(Scanner scanner, String playerName) {
                System.out.println(
                                "\n\033[1;32mElena tells you about the car accident that changed everything.\033[0m");
                System.out.println(
                                "\033[1;33m'It was raining. You were driving home from the city, late. You'd called to say you had a surprise.'\033[0m");
                System.out.println(
                                "\033[1;33m'They found you three hours later. The surprise was never in the car... or so I thought.'\033[0m");
                gamestate.awardFragment("rain", "The Rainy Night", "Yağmurlu Gece");
                hopeScene(scanner, playerName);
        }

        public static void lifeTogetherScene(Scanner scanner, String playerName) {
                System.out.println(
                                "\n\033[1;32mElena shares beautiful memories of your life together - how you met, your first date, your wedding.\033[0m");
                System.out.println(
                                "\033[1;33m'We met in the little bookstore on Harbor Street. We reached for the same book of Neruda poems.'\033[0m");
                System.out.println(
                                "\033[1;33m'You let me have it, then waited outside in the rain to ask what I thought of it.'\033[0m");
                System.out.println(
                                "\033[1;32mFor a second you can smell old paper and wet pavement. Then it's gone.\033[0m");
                gamestate.awardFragment("bookstore", "The Bookstore Where We Met", "Tanıştığımız Kitapevi");
                confessionScene(scanner, playerName);
        }

        public static void visitQuestionScene(Scanner scanner, String playerName) {
                System.out.println(
                                "\n\033[1;32mElena explains why she stayed away - it was too painful to see you not recognize her.\033[0m");
                System.out.println(
                                "\033[1;33m'The first time I visited, you asked the nurse who I was. I went home and couldn't get out of bed for a week.'\033[0m");
                System.out.println(
                                "\033[1;32mInstead of anger, you feel something unexpected: you want to make it up to her.\033[0m");
                gamestate.addElenaBond(1);
                confessionScene(scanner, playerName);
        }

        public static void sophieScene(Scanner scanner, String playerName) {
                System.out.println(
                                "\n\033[1;32mElena tells you more about Sophie and how much she misses her father.\033[0m");
                System.out.println(
                                "\033[1;33m'She draws you every day. Always tall, always with a music box under your arm.'\033[0m");
                System.out.println(
                                "\033[1;32mElena hands you a crayon drawing: three stick figures and a lighthouse. Above one of them, in shaky letters: DADDY.\033[0m");
                gamestate.addSophieBond(1);
                hopeScene(scanner, playerName);
        }

        public static void accidentDetailScene(Scanner scanner, String playerName) {
                System.out.println(
                                "\n\033[1;32mElena provides painful details about the accident and your recovery.\033[0m");
                System.out.println(
                                "\033[1;33m'A deer on the coast road. You swerved. The car went down the embankment.'\033[0m");
                System.out.println(
                                "\033[1;33m'Two weeks in a coma. When you woke up, you knew how to tie your shoes, but not my name.'\033[0m");
                System.out.println(
                                "\033[1;32mHeadlights. Rain on the windshield. A small gift-wrapped box on the passenger seat. The image flashes and is gone.\033[0m");
                gamestate.awardFragment("rain", "The Rainy Night", "Yağmurlu Gece");
                hopeScene(scanner, playerName);
        }

        public static void rememberMoreScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;32mYou focus intently, and more memory fragments surface.\033[0m");
                System.out.println(
                                "\033[1;32mA crib with one crooked leg. Elena laughing at the instructions. You, swearing you followed them perfectly.\033[0m");
                helpRememberScene(scanner, playerName);
        }

        public static void helpRememberScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;32mElena agrees to help you rebuild your memories together.\033[0m");
                System.out.println(
                                "\033[1;33m'We'll go slowly,' she says. 'One photo, one story, one day at a time.'\033[0m");
                gamestate.addElenaBond(1);
                therapyScene(scanner, playerName);
        }

        public static void confusionScene(Scanner scanner, String playerName) {
                System.out.println(
                                "\n\033[1;32mYou express your confusion and Elena understands your struggle.\033[0m");
                System.out.println(
                                "\033[1;33m'You don't have to feel anything yet,' she says. 'Just don't disappear again.'\033[0m");
                therapyScene(scanner, playerName);
        }

        public static void pleadingScene(Scanner scanner, String playerName) {
                System.out.println(
                                "\n\033[1;32mYou plead with Elena to stay and give your relationship another chance.\033[0m");
                System.out.println(
                                "\033[1;33m'Six months,' she says at last. 'Give me six months of really trying. Then we decide together.'\033[0m");
                gamestate.addElenaBond(1);
                therapyScene(scanner, playerName);
        }

        public static void sacrificeScene(Scanner scanner, String playerName) {
                System.out.println(
                                "\n\033[1;32mYou tell Elena to do what's best for Sophie, even if it means leaving you behind.\033[0m");
                System.out.println(
                                "\033[1;32mOn the morning they leave, Sophie runs back from the car and presses the music box into your hands.\033[0m");
                System.out.println("\033[1;33m'So you don't forget us again, Daddy.'\033[0m");
                System.out.println(
                                "\n\033[1;35mENDING: Your selfless love allows Elena and Sophie to build a new life.\033[0m");
                System.out.println(
                                "\033[1;35mSometimes love means letting go.\033[0m");
                System.out.println("\n\033[1;32mThank you for playing, " + playerName + "!\033[0m");
                gamestate.unlockEnding("letting_go");
        }

        public static void fatherhoodScene(Scanner scanner, String playerName) {
                System.out.println(
                                "\n\033[1;32mYou dedicate yourself to being the father Sophie deserves, building new memories together.\033[0m");
                System.out.println(
                                "\033[1;32mOne rainy Saturday, Sophie marches into the living room with her hands behind her back.\033[0m");
                System.out.println("\033[1;33m'Mommy says you used to be the champion. Prove it.'\033[0m");
                if (minigames.rockPaperScissorsWithSophie(scanner)) {
                        gamestate.awardFragment("sophie_laugh", "Sophie's Laughter", "Sophie'nin Kahkahası");
                        gamestate.addSophieBond(2);
                } else {
                        gamestate.addSophieBond(1);
                }
                newMemoriesScene(scanner, playerName);
        }

        public static void treatmentScene(Scanner scanner, String playerName) {
                System.out.println(
                                "\n\033[1;32mYou pursue experimental treatment, but ultimately realize that new love is just as valuable as remembered love.\033[0m");
                System.out.println(
                                "\033[1;32mThe sessions bring back only scraps - but one night you wake up humming a tune you've never learned.\033[0m");
                if (!gamestate.hasFragment("song")) {
                        System.out.println("\033[1;33mElena sits up in bed. 'That's our song,' she whispers.\033[0m");
                        gamestate.awardFragment("song", "Elena's Melody", "Elena'nın Melodisi");
                }
                newMemoriesScene(scanner, playerName);
        }

        // Plays the music box melody puzzle the first time the box is wound
        static void playMelodyOnce(Scanner scanner) {
                if (gamestate.melodyPlayed) {
                        return;
                }
                gamestate.melodyPlayed = true;
                if (minigames.melodyPuzzle(scanner)) {
                        gamestate.awardFragment("song", "Elena's Melody", "Elena'nın Melodisi");
                }
        }

        public static void lastSongScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== The Last Song ===\033[0m");
                System.out.println(
                                "\033[1;32mThat night, while everyone sleeps, you wind the music box one last time.\033[0m");
                System.out.println(
                                "\033[1;32mThe melody plays - and this time it doesn't stop at the usual note. It keeps going.\033[0m");
                System.out.println("\033[1;32mEvery fragment you've gathered clicks into place, like teeth on the cylinder.\033[0m");
                System.out.println(
                                "\033[1;32mThe rainy coast road. The deer. The small gift-wrapped box on the passenger seat -\033[0m");
                System.out.println(
                                "\033[1;32mthis music box, bought for your anniversary, its song chosen because Elena hummed it every morning.\033[0m");
                System.out.println(
                                "\033[1;32mElena found it in the wreck. She repaired it herself. She has been sending you your own gift.\033[0m");
                System.out.println("\033[1;33mYou remember. All of it.\033[0m");
                System.out.println("\033[1;33mWhat do you choose?\033[0m");
                System.out.println("1: Wake Elena and tell her everything");
                System.out.println("2: Keep it close for now, and hum the song to Sophie in the morning");

                System.out.print(">> ");
                int choice = gamestate.readChoice(scanner);

                if (choice == 2) {
                        quietSongScene(scanner, playerName);
                } else {
                        memoriesRestoredScene(scanner, playerName);
                }
        }

        public static void memoriesRestoredScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== Memories Restored ===\033[0m");
                System.out.println("\033[1;32mYou sit on the edge of the bed and touch Elena's shoulder.\033[0m");
                System.out.println("\033[1;33m'June 15th. You wore your grandmother's earrings and lost one in the sand.'\033[0m");
                System.out.println("\033[1;33m'We looked for it until the lighthouse came on. We never found it.'\033[0m");
                System.out.println(
                                "\033[1;32mElena stares at you. Then she is laughing and crying at the same time, and so are you.\033[0m");
                System.out.println("\033[1;32mSophie appears in the doorway, rubbing her eyes. 'Why is everyone crying?'\033[0m");
                System.out.println("\033[1;33m'Because Daddy came home,' Elena says.\033[0m");
                System.out.println(
                                "\n\033[1;35mTRUE ENDING: The music box gave back everything the rain took.\033[0m");
                System.out.println(
                                "\033[1;35mYou didn't just fall in love again - you remembered why you never stopped.\033[0m");
                System.out.println("\n\033[1;32mThank you for playing, " + playerName + "!\033[0m");
                gamestate.unlockEnding("memories_restored");
        }

        public static void quietSongScene(Scanner scanner, String playerName) {
                System.out.println("\n\033[1;36m=== The Quiet Song ===\033[0m");
                System.out.println(
                                "\033[1;32mIn the morning, you make pancakes and hum the melody without thinking.\033[0m");
                System.out.println(
                                "\033[1;32mElena freezes at the stove. She doesn't ask. She just starts humming the second part,\033[0m");
                System.out.println("\033[1;32mthe part only the two of you ever knew.\033[0m");
                System.out.println("\033[1;32mSophie joins in, off-key and delighted.\033[0m");
                System.out.println(
                                "\n\033[1;35mSECRET ENDING: Some memories don't need to be announced.\033[0m");
                System.out.println("\033[1;35mThey only need to be shared.\033[0m");
                System.out.println("\n\033[1;32mThank you for playing, " + playerName + "!\033[0m");
                gamestate.unlockEnding("quiet_song");
        }
}
