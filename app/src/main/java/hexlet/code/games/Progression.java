package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void game() {
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < 3; i++) {
            Random operatorChoice = new Random();
            int firstNum = operatorChoice.nextInt(10);
            int addedNum = operatorChoice.nextInt(2, 5);
            int lustNum = operatorChoice.nextInt(10);
            int currentNum = 0;
            int[] array = new int[10];
            System.out.print("Question: ");
            for (int j = 0; j < 10; j++) {
                array[j] = firstNum + addedNum * j;
                if (j == lustNum) {
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
                System.out.println("Let's try again, " + Cli.name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.name + "!");
    }
}
