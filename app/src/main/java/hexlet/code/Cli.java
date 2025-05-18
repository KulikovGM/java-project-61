package hexlet.code;

import java.util.Scanner;
@SuppressWarnings("java:S106")
public final class Cli {
    private static String name;

    public static void setName(String nameCli) {
        Cli.name = nameCli;
    }

    public static String getName() {
        return name;
    }

    private Cli() {
    }

    public static void greetingByName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        System.out.printf("Hello, %s!%n", name);
    }
}
