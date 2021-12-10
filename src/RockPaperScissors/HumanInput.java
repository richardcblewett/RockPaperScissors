package RockPaperScissors;

import java.util.Arrays;
import java.util.Scanner;

public class HumanInput {
    public static String get(String flag) {
        boolean goodInput;
        String s;
        Scanner input = new Scanner(System.in);
        do {
            s = input.next();
            goodInput = evaluate(s.toLowerCase(), flag);
        } while (!goodInput);
        //input.close();
        return s.toLowerCase();
    }

    private static boolean evaluate(String s, String flag) {

        switch (flag) {
            //main game
            case "rps": {
                if (Arrays.asList(Player.choicesString).contains(s)) {
                    return true;
                } else if (s.equals("quit")) {return true;}
            }
            //naming a character
            case "name": {
            }
            //opening menu
            case "openMenu":
                if (s.equals("play") || s.equals("history") || s.equals("quit") || s.equals("computer")) {
                    return true;
                }
            default: {
                System.out.println("Invalid entry: please make another selection.");
            }
        }
        return false;
    }
}
