package hexlet.code.games;

import hexlet.code.Cli;

import java.security.SecureRandom;
import java.util.Scanner;

public class Calc {
    public static void game() {
        int range = 30;
        int rangeOperator = 3; // '+' or '-' or '*'
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {
            SecureRandom operatorChoice = new SecureRandom();
            int number = operatorChoice.nextInt(range);
            int number2 = operatorChoice.nextInt(range);
            int operator = operatorChoice.nextInt(rangeOperator);
            String sign = switch (operator) {
                case 0 -> "+";
                case 1 -> "-";
                case 2 -> "*";
                default -> "";
            };
            System.out.println("Question: " + number + " " + sign + " " + number2);
            Scanner scan1 = new Scanner(System.in);
            int answer = scan1.nextInt();
            System.out.println("Your answer: " + answer);
            switch (operator) {
                case 0 -> {
                    if (answer == (number + number2)) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                                + (number + number2) + "'.");
                        System.out.println("Let's try again, " + Cli.getName() + "!");
                        return;
                    }
                }
                case 1 -> {
                    if (answer == (number - number2)) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                                + (number - number2) + "'.");
                        System.out.println("Let's try again, " + Cli.getName() + "!");
                        return;
                    }
                }
                case 2 -> {
                    if (answer == (number * number2)) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                                + (number * number2) + "'.");
                        System.out.println("Let's try again, " + Cli.getName() + "!");
                        return;
                    }
                }
                default -> {
                    return;
                }
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}
