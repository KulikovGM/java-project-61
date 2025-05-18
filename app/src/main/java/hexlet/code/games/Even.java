package hexlet.code.games;

import java.security.SecureRandom;

import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";


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
        int number = operatorChoice.nextInt(range);
        String trueAnswer = number % 2 == 0 ? "yes" : "no";
        ARRAY_QUESTIONS_AND_ANSWERS[round][0] = "" + number;
        ARRAY_QUESTIONS_AND_ANSWERS[round][1] = trueAnswer;
    }
}
