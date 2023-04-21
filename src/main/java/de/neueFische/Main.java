package de.neueFische;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ein Passwort ein und Drücken Sie Enter:");
        String input = scanner.nextLine();
        passwortContainsNumber(input);
        passwortContainsNumber(input);
        if (passwortCountSymbols(input) && passwortContainsNumber(input)) {
            System.out.println("Dein Passwort erfüllt alle Kriterien");
        }
        if (passwortCountSymbols(input) == false) {
            System.out.println("Fehler: Das Passowort muss mindestens 5 Zeichen enthalten");
        }
        if (passwortContainsNumber(input) == false) {
            System.out.println("Fehler: Das Passowort muss mindestens eine Zahl enthalten");
        }

    }

    public static boolean passwortCountSymbols(String input) {
        if (input.length() >= 5) {
            return true;
        }
        return false;
    }

    public static boolean passwortContainsNumber(String input) {
        Pattern pattern = Pattern.compile(("\\d+"));
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return true;
        }
        return false;
    }


}