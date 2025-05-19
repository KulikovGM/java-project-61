package hexlet.code;

import java.util.Scanner;

//@SuppressWarnings({"java:S106", "java:S1118"})
public class Engine {
    public static final int ROUNDS = 3;
    private static String[][] arrayQuestionsAndAnswers;

    public static void setArrayQuestionsAndAnswers(String[][] arrayQsAndAs) {
        Engine.arrayQuestionsAndAnswers = arrayQsAndAs;
    }

    public static void runEngin(String rules, String[][] arrayQnsAndAns) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.printf("Hello, %s!%n", name);
        System.out.println(rules);
        setArrayQuestionsAndAnswers(arrayQnsAndAns);
        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + arrayQuestionsAndAnswers[i][0]);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);
            String trueAnswer = arrayQuestionsAndAnswers[i][1];
            if (answer.equals(trueAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + trueAnswer + "'.\n"
                        + "Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
