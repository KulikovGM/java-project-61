package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;

public class Engine {
    public static void game(int gameNumber) {
        if (gameNumber == 1) {
            Cli.greetingByName();
        } else if (gameNumber == 2) {
            Cli.greetingByName();
            Even.gameEven();
        } else if (gameNumber == 3) {
            Cli.greetingByName();
            Calc.gameCalc();
        } else {
            System.out.println("We don't have game number " + gameNumber);
        }
    }
}
