package hexlet.code.games;

import hexlet.code.Cli;

import java.security.SecureRandom;
import java.util.Scanner;

public class Progression {
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int RANGE_NUMB = 10;
    private static final int PROGRESSION_LENGTH = 10;
    private static final int ADD_NUMBER_FROM = 2;
    private static final int ADD_NUMBER_TO = 5;

    public static void game() {

        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            SecureRandom secureRandom = new SecureRandom();
            int firstNum = secureRandom.nextInt(RANGE_NUMB);
            int addedNum = secureRandom.nextInt(ADD_NUMBER_FROM, ADD_NUMBER_TO);
            int missedNum = secureRandom.nextInt(RANGE_NUMB);
            int currentNum = 0;
            int[] array = new int[PROGRESSION_LENGTH];
            System.out.print("Question: ");
            for (int j = 0; j < PROGRESSION_LENGTH; j++) {
                array[j] = firstNum + addedNum * j;
                if (j == missedNum) {
                    currentNum = array[j];
                    System.out.print(".." + " ");
                } else {
                    System.out.print(array[j] + " ");
                }
            }
            Scanner scan1 = new Scanner(System.in);
            int answer = scan1.nextInt();
            System.out.println("Your answer: " + answer);
            if (answer == currentNum) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + currentNum + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}
