package de.neueFische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void passwortContainsMoreThan5Symbols() {
        //given
        String input = "Abcdefg";

        //when
        boolean actual = Main.passwortCountSymbols(input);

        //then
        assertTrue(actual);
    }

    @Test
    void passwortContainsLessThan5Symbols() {
        //given
        String input = "Ab";

        //when
        boolean actual = Main.passwortCountSymbols(input);

        //then
        assertFalse(actual);
    }

    @Test
    void passwortContains5Symbols() {
        //given
        String input = "Abcde";

        //when
        boolean actual = Main.passwortCountSymbols(input);

        //then
        assertTrue(actual);
    }

    @Test
    void passwortContainsMoreThan1Number() {
        //given
        String input = "abc35";

        //when
        boolean actual = Main.passwortContainsNumber(input);

        //then
        assertTrue(actual);
    }

    @Test
    void passwortDoesntContainsNumber() {
        //given
        String input = "abcefsdsf";

        //when
        boolean actual = Main.passwortContainsNumber(input);

        //then
        assertFalse(actual);
    }

    @Test
    void passwortContainsOneLowerCase() {
        //given
        String input = "aEFASDFSEF8";

        //when
        boolean actual = Main.passwortContainsLowerCase(input);

        //then
        assertTrue(input);
    }
    void passwortDoesntContainsLowerCases() {
        //given
        String input = "SDFASDFSEF8";

        //when
        boolean actual = Main.passwortContainsLowerCase(input);

        //then
        assertFalse(input);
    }
}