package RockPaperScissors;

import java.util.Scanner;

public class HumanInput {
    public static String get() {
        boolean goodInput = false;
        String s = "";
        Scanner input = new Scanner(System.in);
        do {
            s = input.nextLine();
            goodInput = evaluate(s);
        } while (!goodInput);
        input.close();
        return s.toLowerCase();
    }
    private static boolean evaluate(String s) {
        return !s.isEmpty();
    }
}
