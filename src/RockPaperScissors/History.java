package RockPaperScissors;

import java.util.ArrayList;

public class History {
    //stores the game results in a list
    private final ArrayList<String> results = new ArrayList<>();

    //win/loss/draw | player1 & choice | player2 & choice
    public void addResults(String wld, String p1n, String p1c, String p2n, String p2c) {
        String game = wld + ": " + p1n + " picked " + p1c + ", " + p2n + " picked " + p2c;
        results.add(game);
    }

    //prints the list
    public void printResults() {
        results.forEach(System.out::println);
    }
}
