package roman.numbers;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumbersGeneratorTest {

    @Test
    public void should_return_the_roman_given_a_decimal() {
        assertEquals("I", RomanNumbersGenerator.toRoman(1));
    }
}