package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

@SuppressWarnings("java:S1118")
public class Progression {
    private static final int RANGE = 30;
    private static final int PROGRESSION_LENGTH = 10;
    private static final int ADD_NUMBER_FROM = 2;
    private static final int ADD_NUMBER_TO = 5;

    private static final String RULES = "What number is missing in the progression?";

    public static void run() {
        String[][] arrayQuestionsAndAnswers = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            SecureRandom secureRandom = new SecureRandom();
            int firstNum = secureRandom.nextInt(RANGE);
            int addedNum = secureRandom.nextInt(ADD_NUMBER_FROM, ADD_NUMBER_TO);
            int missedNum = secureRandom.nextInt(ADD_NUMBER_FROM, ADD_NUMBER_TO);
            String[] array = getProgression(firstNum, addedNum);
            String currentNum = array[missedNum];
            array[missedNum] = "..";
            String result = String.join(" ", array);
            arrayQuestionsAndAnswers[i][0] = result;
            arrayQuestionsAndAnswers[i][1] = currentNum;
        }
        Engine.runEngin(RULES, arrayQuestionsAndAnswers);
    }

    public static String[] getProgression(int firstNum, int addedNum) {
        String[] array = new String[PROGRESSION_LENGTH];
        for (int j = 0; j < PROGRESSION_LENGTH; j++) {
            array[j] = "" + (firstNum + addedNum * j);
        }
        return array;
    }
}

