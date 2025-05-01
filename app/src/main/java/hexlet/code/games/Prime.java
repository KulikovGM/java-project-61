package hexlet.code.games;

import hexlet.code.Cli;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.logging.Logger;

public final class Prime {
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int NUMBER_FROM = 2;
    private static final int NUMBER_TO = 20;

    private Prime() {
    }

    public static void game() {
        Logger logger = Logger.getLogger(Prime.class.getName());
        logger.info("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            SecureRandom secureRandom = new SecureRandom();
            int number = secureRandom.nextInt(NUMBER_FROM, NUMBER_TO);
            logger.info("Question: " + number);
            Scanner scan1 = new Scanner(System.in);
            String answer = scan1.nextLine();
            logger.info("Your answer: " + answer);
            String correctAnswer = "yes";
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    correctAnswer = "no";
                    break;
                }
            }
            if (answer.equals(correctAnswer)) {
                logger.info("Your answer: " + answer);
                System.out.println("Correct!");
            } else {
                logger.info("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                logger.info("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        logger.info("Congratulations, " + Cli.getName() + "!");
    }
}

