package hexlet.code;

import java.util.Scanner;
import java.util.logging.Logger;

public class App {

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
        logger.info(String.format("Your choice: %s\n", gameNumber));

        Engine.runGame(gameNumber);

    }
}
