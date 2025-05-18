package hexlet.code.games;

import java.security.SecureRandom;

import static hexlet.code.Engine.ROUNDS;

@SuppressWarnings("java:S1118")
public class Progression {
    private static final int PROGRESSION_LENGTH = 10;
    private static final int ADD_NUMBER_FROM = 2;
    private static final int ADD_NUMBER_TO = 5;

    private static final String RULES = "What number is missing in the progression?";

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
        SecureRandom secureRandom = new SecureRandom();
        int firstNum = secureRandom.nextInt(range);
        int addedNum = secureRandom.nextInt(ADD_NUMBER_FROM, ADD_NUMBER_TO);
        int missedNum = secureRandom.nextInt(ADD_NUMBER_FROM, ADD_NUMBER_TO);
        String currentNum = "1";
        String[] array = new String[PROGRESSION_LENGTH];

        for (int i = 0; i < PROGRESSION_LENGTH; i++) {
            array[i] = "" + (firstNum + addedNum * i);
            if (i == missedNum) {
                currentNum = array[i];
                array[i] = "..";
            }
        }
        String result = String.join(" ", array);

        ARRAY_QUESTIONS_AND_ANSWERS[round][0] = result;
        ARRAY_QUESTIONS_AND_ANSWERS[round][1] = currentNum;
    }
}

