package RockPaperScissors;

public class Player1 extends Player {
    private String name;

    public Player1(String name) {
        this.name = name;
    }

    //if we want to give player 1 the option to set their name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    String makeAChoice() {
        return HumanInput.get("rps");
    }

    String makeAChoice(String choice) {
        return choice;
    }
}

