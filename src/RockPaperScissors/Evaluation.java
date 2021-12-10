package RockPaperScissors;

public class Evaluation {
    //this takes two choices and determines the winner
//    public static void main(String[] args) {
//    }

    public void determineWinner(String choiceA, String choiceB) {
        //since history is from the player1 perspective, we can return the win/lose/draw based on that
        String winLoseDraw = winningChoice(choiceA, choiceB);


    }

    //looks at the choices and determines the winning choice
    private static String winningChoice(String a, String b) {
        //since history is from the player1 perspective, we can return the win/lose/draw based on that
        if (a.equals(b)) {
            return "D";
        } //draw - chose again
        else {
            switch (a) {
                case "rock":
                    return b.equals("paper") ? "L" : "W";
                case "paper":
                    return b.equals("rock") ? "W" : "L";
                default /*scissors*/:
                    return b.equals("rock") ? "L" : "W";
            }
        }
    }
    //storing history - win/loss/draw | player1 name | player1 pick | other pick
    private static void recordWin(String result, String player1pick, String player2pick) {
        history.addResults([result,player1pick,player1pick])
    }
}
