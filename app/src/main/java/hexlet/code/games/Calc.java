package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

@SuppressWarnings("java:S1118")
public class Calc {
    private static final int RANGE = 30;
    private static final int NUMBER_OF_OPERATORS = 3; // '+' or '-' or '*'
    private static final String RULES = "What is the result of the expression?";

    public static void run() {
        String[][] arrayQuestionsAndAnswers = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            SecureRandom operatorChoice = new SecureRandom();
            int number1 = operatorChoice.nextInt(RANGE);
            int number2 = operatorChoice.nextInt(RANGE);
            String[] operators = {"+", "-", "*"};
            int numbOfOperator = operatorChoice.nextInt(operators.length);
            String sign = operators[numbOfOperator];
            int trueAnswer = calculate(sign, number1, number2);
            arrayQuestionsAndAnswers[i][0] = number1 + " " + sign + " " + number2;
            arrayQuestionsAndAnswers[i][1] = String.valueOf(trueAnswer);
        }
        Engine.runEngin(RULES, arrayQuestionsAndAnswers);
    }

    public static int calculate(String operator, int number1, int number2) {
        switch (operator) {
            case "+" -> {
                return number1 + number2;
            }
            case "-" -> {
                return number1 - number2;
            }
            case "*" -> {
                return number1 * number2;
            }
            default -> {
                return 0;
            }
        }
    }
}
