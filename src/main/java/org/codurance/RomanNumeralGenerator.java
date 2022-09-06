package org.codurance;

public class RomanNumeralGenerator {
    public static String romanNumeralFor(int arabicNumber) {

        StringBuilder romanNumeral = new StringBuilder();

        for (RomanToArabic romanToArabic : RomanToArabic.values()) {
            while (arabicNumber >= romanToArabic.arabic) {
                romanNumeral.append(romanToArabic.roman);
                arabicNumber -= romanToArabic.arabic;
            }
        }

        return romanNumeral.toString();
    }

    enum RomanToArabic { // Maps roman numerals to arabic
        THOUSAND("M", 1000),
        NINE_HUNDRED("CM", 900),
        FIVE_HUNDRED("D", 500),
        FOUR_HUNDRED("CD", 400),
        HUNDRED("C", 100),
        NINETY("XC", 90),
        FIFTY("L", 50),
        FORTY("XL", 40), // Can add exceptions to the enum here
        TEN("X", 10),
        NINE("IX", 9),
        FIVE("V", 5),
        FOUR("IV", 4),
        ONE("I", 1);

        private final String roman;
        private final int arabic;

        RomanToArabic(String roman, int arabic) {
            this.roman = roman;
            this.arabic = arabic;
        }
    }
}
