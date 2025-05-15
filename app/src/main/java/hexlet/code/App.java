package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;
import java.util.logging.Logger;

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
        Logger logger = Logger.getLogger(App.class.getName());
        logger.info("""
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
        logger.info(choiceGame);
        runGame(gameNumber);
    }

    public static void runGame(int gameNumber) {
        if (gameNumber == NUMBER_OF_GREETING) {
            Cli.greetingByName();
        } else if (gameNumber == NUMBER_OF_EVEN) {
            Cli.greetingByName();
            Even.game();
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
