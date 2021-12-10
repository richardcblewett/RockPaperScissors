package RockPaperScissors;

public class Main {
    static History history = new History();
    static Player player1 = new Player("player1");
    static Player player2 = new Player("player2");
    static Evaluation evaluation = new Evaluation();

    public static void openingMenu() {

    }

    public static void playGame(){
        String choiceA = player1.makeAChoice();
        String choiceB = player2.makeAChoice();
        String win = evaluation.determineWinner(choiceA,choiceB);
        history.addResults(win,player1.getName(),choiceA,player2.getName(),choiceB);
    };

    public static void main(String[] args) {
        openingMenu();
        playGame();
    }
}
