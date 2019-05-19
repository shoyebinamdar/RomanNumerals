import org.junit.Test;

import static org.junit.Assert.*;

// TODO correct expected and actual parameter order in assert
public class NumberTest {

    @Test
    public void convertOneToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(1);
        assertEquals("I", roman);
    }

    @Test
    public void convertTwoToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(2);
        assertEquals("II", roman);
    }

    @Test
    public void convertThreeToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(3);
        assertEquals("III", roman);
    }

    @Test
    public void convertFiveToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(5);
        assertEquals("V", roman);
    }

    @Test
    public void convertFourToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(4);
        assertEquals("IV", roman);
    }

    @Test
    public void convertSixToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(6);
        assertEquals("VI", roman);
    }

    @Test
    public void convertSevenToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(7);
        assertEquals("VII", roman);
    }

    @Test
    public void convertEightToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(8);
        assertEquals("VIII", roman);
    }

    @Test
    public void convertTenToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(10);
        assertEquals("X", roman);
    }

    @Test
    public void convertNineToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(9);
        assertEquals("IX", roman);
    }

    @Test
    public void convertElevenToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(11);
        assertEquals("XI", roman);
    }

    @Test
    public void convertTwelveToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(12);
        assertEquals("XII", roman);
    }

    @Test
    public void convertThirteenToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(13);
        assertEquals("XIII", roman);
    }

    @Test
    public void convertFourteenToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(14);
        assertEquals("XIV", roman);
    }

    @Test
    public void convertFifteenToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(15);
        assertEquals("XV", roman);
    }

    @Test
    public void convertSixteenToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(16);
        assertEquals("XVI", roman);
    }

    @Test
    public void convertSeventeenToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(17);
        assertEquals("XVII", roman);
    }

    @Test
    public void convertEighteenToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(18);
        assertEquals("XVIII", roman);
    }

    @Test
    public void convertNineteenToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(19);
        assertEquals("XIX", roman);
    }

    @Test
    public void convertTwentyToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(20);
        assertEquals("XX", roman);
    }

    @Test
    public void convertTwentyOneToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(21);
        assertEquals("XXI", roman);
    }

    @Test
    public void convertTwentyTwoToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(22);
        assertEquals("XXII", roman);
    }

    @Test
    public void convertTwentyThreeToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(23);
        assertEquals("XXIII", roman);
    }

    @Test
    public void convertTwentyFourToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(24);
        assertEquals("XXIV", roman);
    }

    @Test
    public void convertTwentyFiveToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(25);
        assertEquals("XXV", roman);
    }

    @Test
    public void convertTwentySixToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(26);
        assertEquals("XXVI", roman);
    }

    @Test
    public void convertTwentySevenToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(27);
        assertEquals("XXVII", roman);
    }

    @Test
    public void convertTwentyEightToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(28);
        assertEquals("XXVIII", roman);
    }

    @Test
    public void convertTwentyNineToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(29);
        assertEquals("XXIX", roman);
    }

    @Test
    public void convertThirtyToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(30);
        assertEquals("XXX", roman);
    }

    @Test
    public void convertThirtyOneToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(31);
        assertEquals("XXXI", roman);
    }

    @Test
    public void convertThirtyFourToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(34);
        assertEquals("XXXIV", roman);
    }

    @Test
    public void convertThirtyFiveToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(35);
        assertEquals("XXXV", roman);
    }

    @Test
    public void convertThirtySixToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(36);
        assertEquals("XXXVI", roman);
    }

    @Test
    public void convertThirtyEightToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(38);
        assertEquals("XXXVIII", roman);
    }

    @Test
    public void convertThirtyNineToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(39);
        assertEquals("XXXIX", roman);
    }

    @Test
    public void convertFortyToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(40);
        assertEquals("XL", roman);
    }

    @Test
    public void convertFortyOneToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(41);
        assertEquals("XLI", roman);
    }

    @Test
    public void convertFortyThreeToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(43);
        assertEquals("XLIII", roman);
    }

    @Test
    public void convertFortyFourToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(44);
        assertEquals("XLIV", roman);
    }

    @Test
    public void convertFortyFiveToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(45);
        assertEquals("XLV", roman);
    }

    @Test
    public void convertFortySevenToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(47);
        assertEquals("XLVII", roman);
    }

    @Test
    public void convertFortyNineToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(49);
        assertEquals("XLIX", roman);
    }

    @Test
    public void convertFiftyToRoman() {
        Number n = new Number();
        String roman = n.convertToRoman(50);
        assertEquals("L", roman);
    }
}