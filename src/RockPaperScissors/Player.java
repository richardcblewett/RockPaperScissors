package RockPaperScissors;

public class Player {
    private static String name;
    private final String[] choicesString = {"rock","paper","scissors"};

    public Player(String name) {   //should name be optional for a computer?
        this.name = name;
    }

    public static String getName() {
        return name;
    }


    public void makeAChoice()//want to use an optional for player or computer
    {}

}
