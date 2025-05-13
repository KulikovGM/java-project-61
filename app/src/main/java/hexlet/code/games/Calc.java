package hexlet.code.games;

import hexlet.code.Cli;

import java.security.SecureRandom;
import java.util.Scanner;

public class Calc {
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int NUMBER_OF_OPERATORS = 3; // '+' or '-' or '*'
    private static final int RANGE_NUMB = 30;

    public static void game() {
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            SecureRandom operatorChoice = new SecureRandom();
            int number1 = operatorChoice.nextInt(RANGE_NUMB);
            int number2 = operatorChoice.nextInt(RANGE_NUMB);
            int operator = operatorChoice.nextInt(NUMBER_OF_OPERATORS);
            String sign = switch (operator) {
                case 0 -> "+";
                case 1 -> "-";
                case 2 -> "*";
                default -> "";
            };
            System.out.println("Question: " + number1 + " " + sign + " " + number2);
            Scanner scan1 = new Scanner(System.in);
            int answer = scan1.nextInt();
            System.out.println("Your answer: " + answer);
            switch (operator) {
                case 0 -> {
                    int corAnswer = number1 + number2;
                    if (answer == corAnswer) {
                        correctAnswer();
                    } else {
                        wrongAnswer(answer, corAnswer);
                        return;
                    }
                }
                case 1 -> {
                    int corAnswer = number1 - number2;
                    if (answer == corAnswer) {
                        correctAnswer();
                    } else {
                        wrongAnswer(answer, corAnswer);
                        return;
                    }
                }
                case 2 -> {
                    int corAnswer = number1 * number2;
                    if (answer == corAnswer) {
                        correctAnswer();
                    } else {
                        wrongAnswer(answer, corAnswer);
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

    public static void correctAnswer() {
        System.out.println("Correct!");
    }

    public static void wrongAnswer(int answer, int corAnswer) {
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                + corAnswer + "'.");
        System.out.println("Let's try again, " + Cli.getName() + "!");
    }
}
