package com.banking.demos;
import java.util.Scanner;

public class InputUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static double getDouble(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static int getInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
}
