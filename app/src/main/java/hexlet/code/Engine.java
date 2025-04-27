package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Engine {
    // Присваиваем каждой игре конкретный номер
    private static final int numberOfGreeting = 1;
    private static final int numberOfEven = 2;
    private static final int numberOfCalc = 3;
    private static final int numberOfGCD = 4;
    private static final int numberOfProgression = 5;
    private static final int numberOfPrime = 6;

    public static void runGame(int gameNumber) {
        if (gameNumber == numberOfGreeting) {
            Cli.greetingByName();
        } else if (gameNumber == numberOfEven) {
            Cli.greetingByName();
            Even.game();
        } else if (gameNumber == numberOfCalc) {
            Cli.greetingByName();
            Calc.game();
        } else if (gameNumber == numberOfGCD) {
            Cli.greetingByName();
            GCD.game();
        } else if (gameNumber == numberOfProgression) {
            Cli.greetingByName();
            Progression.game();
        } else if (gameNumber == numberOfPrime) {
            Cli.greetingByName();
            Prime.game();
        }
    }
}
