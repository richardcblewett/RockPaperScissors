package RockPaperScissors;

import java.util.ArrayList;

public abstract class Player {

    public static String[] choicesString = {"rock", "paper", "scissors"};

    abstract String makeAChoice();//want to use an optional for player or computer

    private ArrayList<String> results = new ArrayList<>();
    public void addResults(String what){
        results.add(what);
    }
}

