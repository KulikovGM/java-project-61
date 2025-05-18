package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final int NUMBER_OF_GREETING = 1;
    private static final int NUMBER_OF_EVEN = 2;
    private static final int NUMBER_OF_CALC = 3;
    private static final int NUMBER_OF_GCD = 4;
    private static final int NUMBER_OF_PROGRESSION = 5;
    private static final int NUMBER_OF_PRIME = 6;

    public static void main(String[] args) {
        int gameNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
        gameNumber = scanner.nextInt();
        String choiceGame = String.format("Your choice: %s%n", gameNumber);
        System.out.println(choiceGame);
        runGame(gameNumber);
    }

    public static void runGame(int gameNumber) {
        if (gameNumber == NUMBER_OF_GREETING) {
            Cli.greetingByName();
        } else if (gameNumber == NUMBER_OF_EVEN) {
            Engine.greetingByName();
            Engine.runEngin();
        } else if (gameNumber == NUMBER_OF_CALC) {
            Cli.greetingByName();
            Calc.game();
        } else if (gameNumber == NUMBER_OF_GCD) {
            Cli.greetingByName();
            GCD.game();
        } else if (gameNumber == NUMBER_OF_PROGRESSION) {
            Cli.greetingByName();
            Progression.game();
        } else if (gameNumber == NUMBER_OF_PRIME) {
            Cli.greetingByName();
            Prime.game();
        }
    }
}
