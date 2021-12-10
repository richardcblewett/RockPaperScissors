package RockPaperScissors;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class History {
    //stores the game results in a list
    private ArrayList<String[]> results = new ArrayList<>();


    //TODO method: add results
    //win/loss/draw | player1 pick | other pick
    public void addResults(String[] game){
        results.add(game);
    }

    //prints the list
    //TODO method: print results
    //public void printResults(){}
}
