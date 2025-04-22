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
                4 - GCD
                0 - Exit
                """);
        gameNumber = scanner.nextInt();
        System.out.println("Your choice: " + gameNumber + "\n");

        Engine.runGame(gameNumber);

    }
}
