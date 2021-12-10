package RockPaperScissors;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class History {
    //stores the game results in a list
    private ArrayList<String> results = new ArrayList<>();


    //TODO method: add results
    //win/loss/draw | player1 pick | other pick
    public void addResults(String wld, String p1n, String p1c, String p2n, String p2c){
        String game = wld + ": " + p1n + " picked " + p1c + ", " + p2n + " picked " + p2c ;
        results.add(game);
    }
    //prints the list
    public void printResults(){
        results.forEach(System.out::println);
    }
}
