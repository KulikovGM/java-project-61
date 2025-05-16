package hexlet.code.games;

import java.security.SecureRandom;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static String getRules() {
        return RULES;
    }

    public static String[][] arrayQuestionsAndAnswers = new String[3][2];

    public static void questionAnswer(int round, int range) {
        SecureRandom operatorChoice = new SecureRandom();
        int number = operatorChoice.nextInt(range);
        String trueAnswer = number % 2 == 0 ? "yes" : "no";
        arrayQuestionsAndAnswers[round][0] = "" + number;
        arrayQuestionsAndAnswers[round][1] = trueAnswer;
    }

    public static String[][] getArrayQuestionsAndAnswers(int round, int range) {
        for (int i = 0; i < round; i++) {
            questionAnswer(i, range);
        }
        return arrayQuestionsAndAnswers;
    }

}
