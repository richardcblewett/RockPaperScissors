package RockPaperScissors;

public class Main {
    static History history = new History();
    static Player1 player1 = new Player1("Ernie");
    static Player2 player2 = new Player2("Bert");
    static Evaluation evaluation = new Evaluation();

    public static void playGame() {
        String choice1 = player1.makeAChoice();
        String choice2 = player2.makeAChoice();
        System.out.println(player2.getName() + " picks: " + choice2);
        System.out.println("User picks: " + choice1);
        String win = evaluation.determineWinner(choice1, choice2);
        String p1n = player1.getName();
        String p2n = player2.getName();
        System.out.println(p1n);
        System.out.println(p2n);
        printResult(win);
        history.addResults(win, p1n, choice1, p2n, choice2);
        openingMenu(); //we start again!
    }

    public static void openingMenu() {
        System.out.println("Welcome to Rock, Paper, Scissors!\n");
        System.out.println("MAIN MENU");
        System.out.println("=====");
        System.out.println("1. Type 'play' to play.");
        System.out.println("2. Type 'history' to view your game history.");
        System.out.println("3. Type 'quit' to stop playing.\n");
        String text = HumanInput.get("openMenu");
        switch (text) {
            case "play": {playGame();}
            case "history": {history.printResults();openingMenu();}
            case "quit": {;}
            default:{;}
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
