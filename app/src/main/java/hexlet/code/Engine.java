package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

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
        } else if (gameNumber == 5) {
            Cli.greetingByName();
            Progression.game();
        } else if (gameNumber == 6) {
            Cli.greetingByName();
            Prime.game();
        }
    }
}
