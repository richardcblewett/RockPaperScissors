package RockPaperScissors;

public class Main {
    static History history = new History();
    static Player1 player1 = new Player1("Player1");
    static Player2 player2 = new Player2("Player2", "human");
    static Evaluation evaluation = new Evaluation();

    public static String playerChoicesRPS(String name) {
        System.out.println(name +":");
        System.out.println("Type 'rock', 'paper' 'or 'scissors' to play.");
        System.out.println("Type 'quit' to go back to the main menu.");
        return HumanInput.get("rps");
    }

    public static void playGame() {
        String choice;
        choice = playerChoicesRPS(player1.getName());
        if (!choice.equals("quit")) {
            String choice1 = player1.makeAChoice(choice);
            //either the human makes a choice or the computer does
            if (player2.getType().equals("human")) {
                choice = playerChoicesRPS(player2.getName());
            } else {
                choice = player2.makeAChoice();
            }
            //we will check, but the computer choice will never be quit
            if (!choice.equals("quit")) {
                String choice2 = player2.makeAChoice(choice);
                System.out.println(player2.getName() + " picks: " + choice2);
                System.out.println("User picks: " + choice1);
                String winLoseDraw = evaluation.determineWinner(choice1, choice2);
                String p1n = player1.getName();
                String p2n = player2.getName();
                printResult(winLoseDraw);
                history.addResults(winLoseDraw, p1n, choice1, p2n, choice2);
                player1.addResults(winLoseDraw);
                player2.addResults(evaluation.determineWinner(choice2, choice1));//results from a p2 perspective
                openingMenu(""); //we start again!
            } else openingMenu("quit");
        } else openingMenu("quit");
    }

    public static void openingMenu(String flag) {
        if (!flag.equals("quit")) {
            System.out.println("Welcome to Rock, Paper, Scissors!\n");
            System.out.println("MAIN MENU");
            System.out.println("=====");
            System.out.println("1. Type 'play' to play the computer.");
            System.out.println("2. Type 'human' to play another human.");
            System.out.println("3. Type 'history' to view your game history.");
            System.out.println("4. Type 'quit' to stop playing.\n");
            String text = HumanInput.get("openMenu");
            switch (text) {
                case "play": {
                    player2.setType("computer");
                    player2.setName("Deep Thought");
                    playGame();
                    break;
                }
                case "history": {
                    history.printResults();
                    openingMenu("");
                    break;
                }
                case "quit": {
                    break;
                }
                case "human": {
                    playGame();
                    break;
                }
                default: {
                }
            }
        }
    }

    public static void main(String[] args) {
        openingMenu("");
    }

    public static void printResult(String win) {
        if (win.equals("DRAW")) {
            System.out.println("You tie!");
        } else if (win.equals("WIN")) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
        System.out.println("\n");
    }
}
