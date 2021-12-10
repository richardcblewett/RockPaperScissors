package RockPaperScissors;

public class Evaluation {
    //this takes two choices and determines the winner
//    public static void main(String[] args) {
//    }
    public String determineWinner(String a, String b) {
        //since history is from the player1 perspective, we can return the win/lose/draw based on that
        if (a.equals(b)) {
            return "DRAW";
        } //draw - chose again
        else {
            switch (a) {
                case "rock":
                    return b.equals("paper") ? "LOSS" : "WIN";
                case "paper":
                    return b.equals("rock") ? "WIN" : "LOSS";
                default /*scissors*/:
                    return b.equals("rock") ? "LOSS" : "WIN";
            }
        }
    }
}
