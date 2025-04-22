package hexlet.code.games;

import java.util.Scanner;

public class Cli {
    public static String name;

    public static void greetingByName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scan1 = new Scanner(System.in);
        name = scan1.nextLine();
        System.out.println("Hello, " + name + "!");
    }

}
