package de.neueFische;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {

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