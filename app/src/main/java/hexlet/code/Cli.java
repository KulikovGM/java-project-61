package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void getByName() {
        System.out.println("May I have your name?");
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, " + scan.nextLine() + "!");
        scan.close();
    }
}
