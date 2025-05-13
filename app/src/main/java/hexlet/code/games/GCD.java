package hexlet.code.games;

import hexlet.code.Cli;

import java.security.SecureRandom;
import java.util.Scanner;

public class GCD {
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int RANGE = 100;
    public static void game() {

        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            SecureRandom secureRandom = new SecureRandom();
            int number = secureRandom.nextInt(RANGE);
            int number2 = secureRandom.nextInt(RANGE);
            System.out.println("Question: " + number + " " + number2);
            Scanner scan1 = new Scanner(System.in);
            int answer = scan1.nextInt();
            System.out.println("Your answer: " + answer);
            if (answer == gcd(number, number2)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + gcd(number, number2) + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
