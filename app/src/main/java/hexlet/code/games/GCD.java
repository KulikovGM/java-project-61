package hexlet.code.games;

import java.security.SecureRandom;

import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";


    public static String getRules() {
        return RULES;
    }

    private static final String[][] ARRAY_QUESTIONS_AND_ANSWERS = new String[NUMBER_OF_ROUNDS][2];

    public static String[][] getArrayQuestionsAndAnswers(int round, int range) {
        for (int i = 0; i < round; i++) {
            questionAnswer(i, range);
        }
        return ARRAY_QUESTIONS_AND_ANSWERS;
    }

    public static void questionAnswer(int round, int range) {
        SecureRandom operatorChoice = new SecureRandom();
        int number1 = operatorChoice.nextInt(range);
        int number2 = operatorChoice.nextInt(range);

        ARRAY_QUESTIONS_AND_ANSWERS[round][0] = number1 + " " + number2;
        ARRAY_QUESTIONS_AND_ANSWERS[round][1] = String.valueOf(gcd(number1, number2));
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    } // метод для определения наибольшего общего делителя
}
