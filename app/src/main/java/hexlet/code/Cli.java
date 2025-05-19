package hexlet.code;

import java.util.Scanner;

public final class Cli {

    private Cli() {
    }

    public static void greetingByName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        System.out.printf("Hello, %s!%n", scan.nextLine());
    }
}
