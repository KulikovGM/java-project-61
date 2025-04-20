package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int gameNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit
                """);
        gameNumber = scanner.nextInt();
        System.out.println("Your choice: " + gameNumber + "\n");

        if (gameNumber == 1) {
            Cli.greetingByName();
        } else if (gameNumber == 2) {
            Cli.greetingByName();
            Even.gameEven();
        } else if (gameNumber == 3) {
            Cli.greetingByName();
            //Add game number 3
        } else {
            System.out.println("We don't have game number " + gameNumber);
        }
    }
}
