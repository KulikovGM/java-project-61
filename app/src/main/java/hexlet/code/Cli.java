package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static int gameNumber;
    public static String name;

    public static void setGameNumber(int gameNumber) {
        Cli.gameNumber = gameNumber;
    }

    public static void getByName() {
        System.out.print("May I have your name? ");
        Scanner scan1 = new Scanner(System.in);
        name = scan1.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}

/*
public class Cli {
    public static int gameNumber;
    public static String name;
    public static void getNumber() {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "0 - Exit\n");
        Scanner scan = new Scanner(System.in);
        gameNumber = scan.nextInt();
        System.out.println("Your choice: " + gameNumber);
        if (gameNumber == 1) {
            System.out.println("Welcome to the Brain Games!");
            getByName();
        }
    }

    public static void getByName() {
        System.out.println("May I have your name?");
        Scanner scan1 = new Scanner(System.in);
        name = scan1.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}*/
