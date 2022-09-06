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
    }

}