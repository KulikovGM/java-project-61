package hexlet.code.games;

import hexlet.code.Cli;

import java.security.SecureRandom;
import java.util.Scanner;

public class Even {
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int RANGE_NUMB = 30;
    public static void game() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            SecureRandom operatorChoice = new SecureRandom();
            int number = operatorChoice.nextInt(RANGE_NUMB);
            System.out.println("Question: " + number);
            Scanner scan1 = new Scanner(System.in);
            String answer = scan1.nextLine();
            System.out.println("Your answer: " + answer);
            if (number % 2 == 0) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + Cli.getName() + "!");
                    return;
                }
            } else {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + Cli.getName() + "!");
                    return;
                }
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}
