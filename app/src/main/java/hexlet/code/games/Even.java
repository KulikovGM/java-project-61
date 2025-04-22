package hexlet.code.games;

import java.util.Scanner;

public class Even {
    public static void gameEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int number = (int) (100 * Math.random() + 1);
            System.out.println("Question: " + number);
            Scanner scan1 = new Scanner(System.in);
            String answer = scan1.nextLine();
            System.out.println("Your answer: " + answer);
            if (number % 2 == 0) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + Cli.name + "!");
                    return;
                }
            } else {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + Cli.name + "!");
                    return;
                }
            }
        }
        System.out.println("Congratulations, " + Cli.name + "!");
    }
}
