package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

@SuppressWarnings("java:S1118")
public class Even {
    private static final int RANGE = 30;
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void run() {
        String[][] arrayQuestionsAndAnswers = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            SecureRandom operatorChoice = new SecureRandom();
            int number = operatorChoice.nextInt(RANGE);
            String trueAnswer = isEven(number) ? "yes" : "no";
            arrayQuestionsAndAnswers[i][0] = "" + number;
            arrayQuestionsAndAnswers[i][1] = trueAnswer;
        }
        Engine.runEngin(RULES, arrayQuestionsAndAnswers);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
