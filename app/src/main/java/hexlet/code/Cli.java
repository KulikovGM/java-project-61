package hexlet.code;

import java.util.Scanner;
import java.util.logging.Logger;

public final class Cli {
    private static String name;

    public static String getName() {
        return name;
    }

    private Cli() {
    }


    public static void greetingByName() {
        Logger logger = Logger.getLogger(Cli.class.getName());
        logger.info("Welcome to the Brain Games!");
        logger.info("May I have your name? ");

        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        String greetingName = String.format("Hello, %s!", name);
        logger.info(greetingName);
    }
}
