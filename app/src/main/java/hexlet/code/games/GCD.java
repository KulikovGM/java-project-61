package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void game() {
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {
            Random operatorChoice = new Random();
            int number = operatorChoice.nextInt(100);
            int number2 = operatorChoice.nextInt(100);
            System.out.println("Question: " + number + " " + number2);
            Scanner scan1 = new Scanner(System.in);
            int answer = scan1.nextInt();
            System.out.println("Your answer: " + answer);
            if (answer == gcd(number, number2)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + gcd(number, number2) + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.name + "!");
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
