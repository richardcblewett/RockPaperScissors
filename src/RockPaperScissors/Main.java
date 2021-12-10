package RockPaperScissors;

public class Main {
    static History history = new History();
    static Player1 player1 = new Player1("Ernie");
    static Player2 player2 = new Player2("Bert", "computer");
    static Evaluation evaluation = new Evaluation();

   public static void playGame() {
        String choice1 = player1.makeAChoice();
        String choice2 = player2.makeAChoice();
        System.out.println(player2.getName() + " picks: " + choice2);
        System.out.println("User picks: " + choice1);
        String win = evaluation.determineWinner(choice1, choice2);
        String p1n = player1.getName();
        String p2n = player2.getName();
        printResult(win);
        history.addResults(win, p1n, choice1, p2n, choice2);
        openingMenu(); //we start again!
    }

    public static void openingMenu() {
        System.out.println("Welcome to Rock, Paper, Scissors!\n");
        System.out.println("MAIN MENU");
        System.out.println("=====");
        System.out.println("1. Type 'play' to play another human.");
        System.out.println("2. Type 'computer' to play the computer.");
        System.out.println("3. Type 'history' to view your game history.");
        System.out.println("4. Type 'quit' to stop playing.\n");
        String text = HumanInput.get("openMenu");
        switch (text) {
            case "play": {playGame();break;}
            case "history": {history.printResults();openingMenu();break;}
            case "quit": {break;}
            case "computer": {player2.setType(text);playGame();break;}
            default:{}
        }
    }

    public static void main(String[] args) {
        openingMenu();
    }

    public static void printResult(String win) {
        if (win.equals("DRAW")) {
            System.out.println("You tie!");
        } else if (win.equals("WIN")) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}
