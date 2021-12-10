package RockPaperScissors;

public class Player {
    private static String name;
    public static String[] choicesString = {"rock","paper","scissors"};

    public Player(String name) {   //should name be optional for a computer?
        this.name = name;
    }

    public static String getName() {
        return name;
    }
    public void setName(String name) {this.name = name;}
    public static String makeAChoice()//want to use an optional for player or computer
    {return " ";}

}
