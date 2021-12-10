package RockPaperScissors;

public class Main {
    static History history = new History();
    static Player player1 = new Player("player1");
    static Player player2 = new Player("player2");
    static Evaluation evaluation = new Evaluation();

    public static void openingMenu() {
        playGame();
    }

    public static void playGame() {
        String choice1 = player1.makeAChoice();
        String choice2 = player2.makeAChoice();
        System.out.println(player2.getName() + " picks: " + choice2);
        System.out.println("User picks: " + choice1);
        String win = evaluation.determineWinner(choice1, choice1);
        printResult(win);
        history.addResults(win, player1.getName(), choice1, player2.getName(), choice2);
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
