package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;
@SuppressWarnings("java:S106")
public class App {
    private static final int NUMBER_OF_GREETING = 1;
    private static final int NUMBER_OF_EVEN = 2;
    private static final int NUMBER_OF_CALC = 3;
    private static final int NUMBER_OF_GCD = 4;
    private static final int NUMBER_OF_PROGRESSION = 5;
    private static final int NUMBER_OF_PRIME = 6;

    public static final int ROUNDS = 3; // число раундов
    private static final int RANGE = 30; // диапазон значений

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
            Engine.runEngin(Even.getRules(), Even.getArrayQuestionsAndAnswers(ROUNDS, RANGE));
        } else if (gameNumber == NUMBER_OF_CALC) {
            Engine.greetingByName();
            Engine.runEngin(Calc.getRules(), Calc.getArrayQuestionsAndAnswers(ROUNDS, RANGE));
        } else if (gameNumber == NUMBER_OF_GCD) {
            Engine.greetingByName();
            Engine.runEngin(GCD.getRules(), GCD.getArrayQuestionsAndAnswers(ROUNDS, RANGE));
        } else if (gameNumber == NUMBER_OF_PROGRESSION) {
            Engine.greetingByName();
            Engine.runEngin(Progression.getRules(), Progression.getArrayQuestionsAndAnswers(ROUNDS, RANGE));
        } else if (gameNumber == NUMBER_OF_PRIME) {
            Engine.greetingByName();
            Engine.runEngin(Prime.getRules(), Prime.getArrayQuestionsAndAnswers(ROUNDS, RANGE));
        }
    }
}
