package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

@SuppressWarnings("java:S1118")
public class Prime {
    private static final int RANGE = 30;
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void run() {
        String[][] arrayQuestionsAndAnswers = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            SecureRandom operatorChoice = new SecureRandom();
            int number = operatorChoice.nextInt(RANGE);
            String trueAnswer = isPrime(number) ? "yes" : "no";
            arrayQuestionsAndAnswers[i][0] = "" + number;
            arrayQuestionsAndAnswers[i][1] = trueAnswer;
        }
        Engine.runEngin(RULES, arrayQuestionsAndAnswers);
    }

    public static boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}


