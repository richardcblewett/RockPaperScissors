package RockPaperScissors;

public class Player2 extends Player {
    private static String name;
    private static String type;

    public Player2(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;

    }

    @Override
    String makeAChoice() {
        String choice = "";
        if (type.equals("computer")) {
            choice = choicesString[(int)Math.round(Math.random() * 2)];
        } else {
            choice = HumanInput.get("rps");
        }
        return choice;
    }
}
