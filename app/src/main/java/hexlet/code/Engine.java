package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Engine {
    // Присваиваем каждой игре конкретный номер
    private static final int NUMBER_OF_GREETING = 1;
    private static final int NUMBER_OF_EVEN = 2;
    private static final int NUMBER_OF_CALC = 3;
    private static final int NUMBER_OF_GCD = 4;
    private static final int NUMBER_OF_PROGRESSION = 5;
    private static final int NUMBER_OF_PRIME = 6;

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
