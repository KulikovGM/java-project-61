package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                0 - Exit
                """);
        Cli.setGameNumber(scanner.nextInt());
        System.out.println("Your choice: " + Cli.gameNumber + "\n");
        System.out.println("Welcome to the Brain Games!");
        Cli.getByName();

        if (Cli.gameNumber == 1) {
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
                        return;
                    }
                } else {
                    if (answer.equals("no")) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.");
                        return;
                    }
                }
            }
            System.out.println("Congratulations, " + Cli.name + "!");
        }
    }
}
