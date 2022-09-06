import org.codurance.RomanNumeralGenerator;
import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralGeneratorShould {

    @Test
    public void
    generate_a_roman_numeral_for_a_given_arabic_number() {
        assertThat(RomanNumeralGenerator.romanNumeralFor(1), is("I"));
        assertThat(RomanNumeralGenerator.romanNumeralFor(2), is("II"));
        assertThat(RomanNumeralGenerator.romanNumeralFor(3), is("III"));
        assertThat(RomanNumeralGenerator.romanNumeralFor(4), is("IV"));
        assertThat(RomanNumeralGenerator.romanNumeralFor(5), is("V"));
        assertThat(RomanNumeralGenerator.romanNumeralFor(7), is("VII"));
        assertThat(RomanNumeralGenerator.romanNumeralFor(9), is("IX"));
        assertThat(RomanNumeralGenerator.romanNumeralFor(10), is("X"));
        assertThat(RomanNumeralGenerator.romanNumeralFor(18), is("XVIII"));
        assertThat(RomanNumeralGenerator.romanNumeralFor(30), is("XXX"));
        assertThat(RomanNumeralGenerator.romanNumeralFor(40), is("XL"));
        assertThat(RomanNumeralGenerator.romanNumeralFor(50), is("L"));

        assertThat(RomanNumeralGenerator.romanNumeralFor(2687), is("MMDCLXXXVII"));

    }

}