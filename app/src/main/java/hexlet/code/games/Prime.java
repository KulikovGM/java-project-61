package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public class Prime {
    public static final int ROUNDS = 3;
    private static final int RANGE = 30;
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void run() {
        String[][] arrayQuestionsAndAnswers = new String[ROUNDS][2];
        for (int i = 0; i < ROUNDS; i++) {
            SecureRandom operatorChoice = new SecureRandom();
            int number = operatorChoice.nextInt(RANGE);
            String trueAnswer = "yes";
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    trueAnswer = "no";
                    break;
                }
            }
            if (number == 0 || number == 1) {
                trueAnswer = "no";
            }
            arrayQuestionsAndAnswers[i][0] = "" + number;
            arrayQuestionsAndAnswers[i][1] = trueAnswer;
        }
        Engine.runEngin(RULES, arrayQuestionsAndAnswers);
    }
}


