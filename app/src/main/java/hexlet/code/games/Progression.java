package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

@SuppressWarnings("java:S1118")
public class Progression {
    public static final int ROUNDS = 3;
    private static final int RANGE = 30;
    private static final int PROGRESSION_LENGTH = 10;
    private static final int ADD_NUMBER_FROM = 2;
    private static final int ADD_NUMBER_TO = 5;

    private static final String RULES = "What number is missing in the progression?";

    public static void run() {
        String[][] arrayQuestionsAndAnswers = new String[ROUNDS][2];
        for (int i = 0; i < ROUNDS; i++) {
            SecureRandom secureRandom = new SecureRandom();
            int firstNum = secureRandom.nextInt(RANGE);
            int addedNum = secureRandom.nextInt(ADD_NUMBER_FROM, ADD_NUMBER_TO);
            int missedNum = secureRandom.nextInt(ADD_NUMBER_FROM, ADD_NUMBER_TO);
            String currentNum = "1";
            String[] array = new String[PROGRESSION_LENGTH];

            for (int j = 0; j < PROGRESSION_LENGTH; j++) {
                array[j] = "" + (firstNum + addedNum * j);
                if (j == missedNum) {
                    currentNum = array[j];
                    array[j] = "..";
                }
            }
            String result = String.join(" ", array);

            arrayQuestionsAndAnswers[i][0] = result;
            arrayQuestionsAndAnswers[i][1] = currentNum;
        }
        Engine.runEngin(RULES, arrayQuestionsAndAnswers);
    }
}

