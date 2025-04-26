package hexlet.code.games;

import hexlet.code.Cli;

import java.security.SecureRandom;
import java.util.Scanner;

public class Progression {
    public static void game() {
        int rangeNumb = 10;
        int addNumberIn = 2;
        int addNumberOut = 5;
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < 3; i++) {
            SecureRandom operatorChoice = new SecureRandom();
            int firstNum = operatorChoice.nextInt(rangeNumb);
            int addedNum = operatorChoice.nextInt(addNumberIn, addNumberOut);
            int lustNum = operatorChoice.nextInt(rangeNumb);
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
