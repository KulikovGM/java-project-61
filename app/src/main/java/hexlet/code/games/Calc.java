package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void game() {
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {
            Random operatorChoice = new Random();
            int number = operatorChoice.nextInt(100);
            int number2 = operatorChoice.nextInt(100);
            int operator = operatorChoice.nextInt(3);
            String sign = switch (operator) {
                case 0 -> "+";
                case 1 -> "-";
                case 2 -> "*";
                default -> "";
            };
            System.out.println("Question: " + number + sign + number2);
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
                        System.out.println("Let's try again, " + Cli.name + "!");
                        return;
                    }
                }
                case 1 -> {
                    if (answer == (number - number2)) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                                + (number - number2) + "'.");
                        System.out.println("Let's try again, " + Cli.name + "!");
                        return;
                    }
                }
                case 2 -> {
                    if (answer == (number * number2)) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                                + (number * number2) + "'.");
                        System.out.println("Let's try again, " + Cli.name + "!");
                        return;
                    }
                }
                default -> {
                    return;
                }
            }
        }
        System.out.println("Congratulations, " + Cli.name + "!");
    }
}
