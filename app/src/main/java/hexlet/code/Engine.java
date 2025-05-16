package hexlet.code;


import hexlet.code.games.Even;

import java.util.Scanner;


public class Engine {

    private static final int NUMBER_OF_ROUNDS = 3; // число раундов
    private static final int RANGE_NUMB = 30; // диапазон значений
    public static String[][] arrayQuestionsAndAnswers;

    public static void greetingByName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        Cli.name = scan.nextLine();
        System.out.printf("Hello, %s!%n", Cli.getName());
    }

    public static void runEngin() {
        System.out.println(Even.getRules());
        arrayQuestionsAndAnswers = Even.getArrayQuestionsAndAnswers(NUMBER_OF_ROUNDS, RANGE_NUMB);
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            getQuestion(arrayQuestionsAndAnswers[i][0]);
            String answer = getAnswerFromUser();
            String trueAnswer = arrayQuestionsAndAnswers[i][1];
            System.out.println(checkAnswer(answer, trueAnswer));
            if (!checkAnswer(answer, trueAnswer).equals("Correct!")) {
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }

    public static void getQuestion(String number) {
        System.out.println("Question: " + number);
    }

    public static String getAnswerFromUser() {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        System.out.println("Your answer: " + answer); //получаем ответ пользователя
        return answer;
    }

    public static String checkAnswer(String answer, String trueAnswer) {
        if (answer.equals(trueAnswer)) {
            return "Correct!";
        } else {
            return ("'" + answer + "' is wrong answer ;(. Correct answer was '" + trueAnswer + "'.\n"
                    + "Let's try again, " + Cli.getName() + "!");
        }
    }
}
