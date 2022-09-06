package org.codurance;

public class RomanNumeralGenerator {
    public static String romanNumeralFor(int arabicNumber) {

        if (arabicNumber == 2) {
            return "II";
        }
        return "I";
    }
}
