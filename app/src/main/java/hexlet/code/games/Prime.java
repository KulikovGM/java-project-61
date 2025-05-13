package hexlet.code.games;

import hexlet.code.Cli;

import java.security.SecureRandom;
import java.util.Scanner;

public class Prime {
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int NUMBER_FROM = 2;
    private static final int NUMBER_TO = 20;

    public static void game() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            SecureRandom secureRandom = new SecureRandom();
            int number = secureRandom.nextInt(NUMBER_FROM, NUMBER_TO);
            System.out.println("Question: " + number);
            Scanner scan1 = new Scanner(System.in);
            String answer = scan1.nextLine();
            System.out.println("Your answer: " + answer);
            String correctAnswer = "yes";
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    correctAnswer = "no";
                    break;
                }
            }
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}

