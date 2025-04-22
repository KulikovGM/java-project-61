package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

public class Engine {
    public static void runGame(int gameNumber) {
        if (gameNumber == 1) {
            Cli.greetingByName();
        } else if (gameNumber == 2) {
            Cli.greetingByName();
            Even.game();
        } else if (gameNumber == 3) {
            Cli.greetingByName();
            Calc.game();
        } else if (gameNumber == 4) {
            Cli.greetingByName();
            GCD.game();
        }
    }
}
