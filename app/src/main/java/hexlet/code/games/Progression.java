package hexlet.code.games;

import hexlet.code.Cli;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.logging.Logger;

public final class Progression {
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int RANGE_NUMB = 10;
    private static final int PROGRESSION_LENGTH = 10;
    private static final int ADD_NUMBER_FROM = 2;
    private static final int ADD_NUMBER_TO = 5;

    private Progression() {
    }

    public static void game() {
        Logger logger = Logger.getLogger(Progression.class.getName());
        logger.info("What number is missing in the progression?");
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            SecureRandom secureRandom = new SecureRandom();
            int firstNum = secureRandom.nextInt(RANGE_NUMB);
            int addedNum = secureRandom.nextInt(ADD_NUMBER_FROM, ADD_NUMBER_TO);
            int missedNum = secureRandom.nextInt(RANGE_NUMB);
            int currentNum = 0;
            int[] array = new int[PROGRESSION_LENGTH];
            logger.info("Question: ");
            for (int j = 0; j < PROGRESSION_LENGTH; j++) {
                array[j] = firstNum + addedNum * j;
                if (j == missedNum) {
                    currentNum = array[j];
                    logger.info(".. ");
                } else {
                    String element = array[j] + " ";
                    logger.info(element);
                }
            }
            Scanner scan1 = new Scanner(System.in);
            int answer = scan1.nextInt();
            String yourAnswer = "Your answer: " + answer;
            logger.info(yourAnswer);
            if (answer == currentNum) {
                logger.info("Correct!");
            } else {
                String wrongAnswer = "'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + currentNum + "'.";
                logger.info(wrongAnswer);
                logger.info("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        logger.info("Congratulations, " + Cli.getName() + "!");
    }
}
