package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

@SuppressWarnings("java:S1118")
public class GCD {
    private static final int RANGE = 30;
    private static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void run() {
        String[][] arrayQuestionsAndAnswers = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            SecureRandom operatorChoice = new SecureRandom();
            int number1 = operatorChoice.nextInt(RANGE);
            int number2 = operatorChoice.nextInt(RANGE);
            arrayQuestionsAndAnswers[i][0] = number1 + " " + number2;
            arrayQuestionsAndAnswers[i][1] = String.valueOf(gcd(number1, number2));
        }
        Engine.runEngin(RULES, arrayQuestionsAndAnswers);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    } // метод для определения наибольшего общего делителя
}
