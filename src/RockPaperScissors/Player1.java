package RockPaperScissors;

public class Player1 extends Player {
    private static String name;
    public Player1(String name) {
        this.name = name;
    }
    public void setName(String name) {this.name = name;}
    public static String getName() {
        return name;
    }
}

