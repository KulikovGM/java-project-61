package hexlet.code.games;

import java.security.SecureRandom;

import static hexlet.code.App.ROUNDS;

public class Calc {
    private static final int NUMBER_OF_OPERATORS = 3; // '+' or '-' or '*'
    private static final String RULES = "What is the result of the expression?";

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
        int number1 = operatorChoice.nextInt(range);
        int number2 = operatorChoice.nextInt(range);
        int operator = operatorChoice.nextInt(NUMBER_OF_OPERATORS);
        String sign = switch (operator) {
            case 0 -> "+";
            case 1 -> "-";
            case 2 -> "*";
            default -> "";
        };
        int trueAnswer;
        switch (operator) {
            case 0 -> {
                trueAnswer = number1 + number2;
            }
            case 1 -> {
                trueAnswer = number1 - number2;
            }
            case 2 -> {
                trueAnswer = number1 * number2;
            }
            default -> {
                return;
            }
        }
        ARRAY_QUESTIONS_AND_ANSWERS[round][0] = number1 + " " + sign + " " + number2;
        ARRAY_QUESTIONS_AND_ANSWERS[round][1] = String.valueOf(trueAnswer);
    }
}
