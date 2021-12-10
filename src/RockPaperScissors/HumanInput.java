package RockPaperScissors;

import java.util.Arrays;
import java.util.Scanner;

public class HumanInput {
    public static String get(String flag) {
        boolean goodInput = false;
        String s = "";
        Scanner input = new Scanner(System.in);
        do {
            s = input.nextLine();
            goodInput = evaluate(s, flag);
        } while (!goodInput);
        input.close();
        return s.toLowerCase();
    }

    private static boolean evaluate(String s, String flag) {

        switch (flag) {
            //main game
            case "rps": {
                if (Arrays.stream(Player.choicesString).anyMatch( elem -> elem.equals(s))) {
                    return true;
                }
            }
            //naming a character
            case "name": {
            }
            //opening menu
            case "openMenu": {
            }
            //fallback
            default: {
            }
        }
        return false;
    }
}
