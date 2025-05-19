package hexlet.code.games;

import hexlet.code.Engine;
import java.security.SecureRandom;

public class Even {
    public static final int ROUNDS = 3;
    private static final int RANGE = 30;
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void run() {
        String[][] arrayQuestionsAndAnswers = new String[ROUNDS][2];
        for (int i = 0; i < ROUNDS; i++) {
            SecureRandom operatorChoice = new SecureRandom();
            int number = operatorChoice.nextInt(RANGE);
            String trueAnswer = number % 2 == 0 ? "yes" : "no";
            arrayQuestionsAndAnswers[i][0] = "" + number;
            arrayQuestionsAndAnswers[i][1] = trueAnswer;
        }
        Engine.runEngin(RULES, arrayQuestionsAndAnswers);
    }
}
