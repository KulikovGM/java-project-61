package hexlet.code.games;

import java.security.SecureRandom;

import static hexlet.code.Engine.ROUNDS;

@SuppressWarnings("java:S1118")
public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";


    public static String getRules() {
        return RULES;
    }

    private static final String[][] ARRAY_QUESTIONS_AND_ANSWERS = new String[ROUNDS][2];

    public static String[][] getArrayQuestionsAndAnswers(int round, int range) {
        for (int i = 0; i < round; i++) {
            questionAnswer(i, range);
        }
        return ARRAY_QUESTIONS_AND_ANSWERS;
    }

    public static void questionAnswer(int round, int range) {
        SecureRandom operatorChoice = new SecureRandom();
        int number = operatorChoice.nextInt(range);
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
        ARRAY_QUESTIONS_AND_ANSWERS[round][0] = "" + number;
        ARRAY_QUESTIONS_AND_ANSWERS[round][1] = trueAnswer;
    }
}


