package hexlet.code;

import java.util.Scanner;

public class Calc {
    public static void gameCalc() {
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {
            int number = (int) (100 * Math.random() + 1);
            int number2 = (int) (100 * Math.random() + 1);
            String sign = "+"; //How random change -+*?

            System.out.println("Question: " + number + sign + number2);
            Scanner scan1 = new Scanner(System.in);
            int answer = scan1.nextInt();
            System.out.println("Your answer: " + answer);
            if (sign.equals("+")) {
                if (answer == (number + number2)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                            + (number + number2) + "'.");
                    System.out.println("Let's try again, " + Cli.name + "!");
                    return;
                }
            } else if (sign.equals("-")) {
                if (answer == (number - number2)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                            + (number - number2) + "'.");
                    System.out.println("Let's try again, " + Cli.name + "!");
                    return;
                }
            } else if (sign.equals("*")) {
                if (answer == (number * number2)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                            + (number * number2) + "'.");
                    System.out.println("Let's try again, " + Cli.name + "!");
                    return;
                }
            }
        }
        System.out.println("Congratulations, " + Cli.name + "!");
    }
}
