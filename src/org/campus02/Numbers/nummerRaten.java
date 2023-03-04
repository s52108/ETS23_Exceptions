package org.campus02.Numbers;

import java.util.Random;
import java.util.Scanner;

public class nummerRaten {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(10);

        int input = -1;

        Scanner scanner = new Scanner(System.in);

        while (input != randomNumber) {
            System.out.println("Bitte eine Zahl eingeben: ");
            String console = scanner.next();
            try {
                // kritischen Programmcode
                input = parseInput(console);
            } catch (NotANumberException e) {
                // exception fangen
                e.printStackTrace();
            } finally {
                // wird auf jeden fall ausgeführt
                if (input != randomNumber) {
                    System.out.println("Leider nein. Rate weiter");
                }
            }
        }
        System.out.println("Super. Die Zahl wurde erraten");
    }

    private static int parseInput(String text) throws NotANumberException {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            throw new NotANumberException(text + " is not a number", e);
        }
    }
}