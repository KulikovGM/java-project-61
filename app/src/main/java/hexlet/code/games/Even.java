package hexlet.code.games;

import hexlet.code.Cli;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.logging.Logger;

public class Even {
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int RANGE_NUMB = 30;
    public static void game() {
        Logger logger = Logger.getLogger(Even.class.getName());
        logger.info("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            SecureRandom operatorChoice = new SecureRandom();
            int number = operatorChoice.nextInt(RANGE_NUMB);
            String question = "Question: " + number;
            logger.info(question);
            Scanner scan1 = new Scanner(System.in);
            String answer = scan1.nextLine();
            String yourAnswer = "Your answer: " + answer;
            logger.info(yourAnswer);
            if (number % 2 == 0) {
                if (answer.equals("yes")) {
                    logger.info("Correct!");
                } else {
                    String wrongAnswer = "'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.";
                    logger.info(wrongAnswer);
                    logger.info("Let's try again, " + Cli.getName() + "!");
                    return;
                }
            } else {
                if (answer.equals("no")) {
                    logger.info("Correct!");
                } else {
                    String wrongAnswer = "'" + answer + "' is wrong answer ;(. Correct answer was 'no'.";
                    logger.info(wrongAnswer);
                    logger.info("Let's try again, " + Cli.getName() + "!");
                    return;
                }
            }
        }
        logger.info("Congratulations, " + Cli.getName() + "!");
    }
}
