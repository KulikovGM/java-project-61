package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

@SuppressWarnings("java:S1118")
public class Calc {
    public static final int ROUNDS = 3;
    private static final int RANGE = 30;
    private static final int NUMBER_OF_OPERATORS = 3; // '+' or '-' or '*'
    private static final String RULES = "What is the result of the expression?";

    public static void run() {
        String[][] arrayQuestionsAndAnswers = new String[ROUNDS][2];
        for (int i = 0; i < ROUNDS; i++) {
            SecureRandom operatorChoice = new SecureRandom();
            int number1 = operatorChoice.nextInt(RANGE);
            int number2 = operatorChoice.nextInt(RANGE);
            int operator = operatorChoice.nextInt(NUMBER_OF_OPERATORS);
            String sign;
            int trueAnswer;
            switch (operator) {
                case 0 -> {
                    trueAnswer = number1 + number2;
                    sign = "+";
                }
                case 1 -> {
                    trueAnswer = number1 - number2;
                    sign = "-";
                }
                case 2 -> {
                    trueAnswer = number1 * number2;
                    sign = "*";
                }
                default -> {
                    return;
                }
            }
            arrayQuestionsAndAnswers[i][0] = number1 + " " + sign + " " + number2;
            arrayQuestionsAndAnswers[i][1] = String.valueOf(trueAnswer);
        }
        Engine.runEngin(RULES, arrayQuestionsAndAnswers);
    }
}
