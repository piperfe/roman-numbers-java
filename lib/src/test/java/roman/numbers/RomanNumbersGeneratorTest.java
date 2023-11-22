package roman.numbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumbersGeneratorTest {

    @Test
    public void should_return_the_roman_given_a_decimal() {
        assertEquals("I", RomanNumbersGenerator.toRoman(1));
        assertEquals("II", RomanNumbersGenerator.toRoman(2));
        assertEquals("III", RomanNumbersGenerator.toRoman(3));
        assertEquals("V", RomanNumbersGenerator.toRoman(5));
        assertEquals("VI", RomanNumbersGenerator.toRoman(6));
        assertEquals("VIII", RomanNumbersGenerator.toRoman(8));
        assertEquals("X", RomanNumbersGenerator.toRoman(10));
        assertEquals("XI", RomanNumbersGenerator.toRoman(11));
        assertEquals("XVIII", RomanNumbersGenerator.toRoman(18));
        assertEquals("XXX", RomanNumbersGenerator.toRoman(30));
        assertEquals("XXXVIII", RomanNumbersGenerator.toRoman(38));
        assertEquals("IV", RomanNumbersGenerator.toRoman(4));
        assertEquals("XIV", RomanNumbersGenerator.toRoman(14));
        assertEquals("MMDCLXXXVII", RomanNumbersGenerator.toRoman(2687));
        assertEquals("MMMCDXCIX", RomanNumbersGenerator.toRoman(3499));
    }
}