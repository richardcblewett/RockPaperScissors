package RockPaperScissors;

public class Player2 extends Player {
    private static String name;
    public Player2(String name) {
        this.name = name;
    }
    public void setName(String name) {this.name = name;}
    public static String getName() {
        return name;
    }
}
