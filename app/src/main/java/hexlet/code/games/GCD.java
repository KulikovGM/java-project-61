package hexlet.code.games;

import hexlet.code.Cli;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.logging.Logger;

public final class GCD {
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int RANGE = 100;

    private GCD() {
    }

    public static void game() {
        Logger logger = Logger.getLogger(GCD.class.getName());
        logger.info("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            SecureRandom secureRandom = new SecureRandom();
            int number = secureRandom.nextInt(RANGE);
            int number2 = secureRandom.nextInt(RANGE);
            logger.info("Question: " + number + " " + number2);
            Scanner scan1 = new Scanner(System.in);
            int answer = scan1.nextInt();
            logger.info("Your answer: " + answer);
            if (answer == gcd(number, number2)) {
                logger.info("Correct!");
            } else {
                logger.info("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + gcd(number, number2) + "'.");
                logger.info("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        logger.info("Congratulations, " + Cli.getName() + "!");
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
