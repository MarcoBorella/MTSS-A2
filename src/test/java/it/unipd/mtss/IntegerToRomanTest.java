////////////////////////////////////////////////////////////////////
// Marco Borella 1204685
// Riccardo Lotto 1204687
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.*;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testNumber0(){
        String result = IntegerToRoman.convert(0);
        assertEquals(result, "");
    }

    @Test
    public void testNumber1(){
        String result = IntegerToRoman.convert(1);
        assertEquals(result, "I");
    }

    @Test
    public void testNumber2(){
        String result = IntegerToRoman.convert(2);
        assertEquals(result, "II");
    }

    @Test
    public void testNumber3(){
        String result = IntegerToRoman.convert(3);
        assertEquals(result, "III");
    }

    @Test
    public void testNumber4(){
        String result = IntegerToRoman.convert(4);
        assertEquals(result, "IV");
    }

    @Test
    public void testNumber5(){
        String result = IntegerToRoman.convert(5);
        assertEquals(result, "V");
    }

    @Test
    public void testNumber6(){
        String result = IntegerToRoman.convert(6);
        assertEquals(result, "VI");
    }

    @Test
    public void testNumber8(){
        String result = IntegerToRoman.convert(8);
        assertEquals(result, "VIII");
    }

    @Test
    public void testNumber9(){
        String result = IntegerToRoman.convert(9);
        assertEquals(result, "IX");
    }

    @Test
    public void testNumber10(){
        String result = IntegerToRoman.convert(10);
        assertEquals(result, "X");
    }

    @Test
    public void testNumber13(){
        String result = IntegerToRoman.convert(13);
        assertEquals(result, "XIII");
    }

    @Test
    public void testNumber18(){
        String result = IntegerToRoman.convert(18);
        assertEquals(result, "XVIII");
    }

    @Test
    public void testNumber19(){
        String result = IntegerToRoman.convert(19);
        assertEquals(result, "XIX");
    }

    @Test
    public void testNumber20(){
        String result = IntegerToRoman.convert(20);
        assertEquals(result, "XX");
    }

    @Test
    public void testNumber37(){
        String result = IntegerToRoman.convert(37);
        assertEquals(result, "XXXVII");
    }

    @Test
    public void testNumber44(){
        String result = IntegerToRoman.convert(44);
        assertEquals(result, "XLIV");
    }

    @Test
    public void testNumber49(){
        String result = IntegerToRoman.convert(49);
        assertEquals(result, "XLIX");
    }

    @Test
    public void testNumber50(){
        String result = IntegerToRoman.convert(50);
        assertEquals(result, "L");
    }

    @Test
    public void testNumber69(){
        String result = IntegerToRoman.convert(69);
        assertEquals(result, "LXIX");
    }

    @Test
    public void testNumber86(){
        String result = IntegerToRoman.convert(86);
        assertEquals(result, "LXXXVI");
    }

    @Test
    public void testNumber99(){
        String result = IntegerToRoman.convert(99);
        assertEquals(result, "XCIX");
    }

    @Test
    public void testNumber344(){
        String result = IntegerToRoman.convert(378);
        assertEquals(result, "CCCLXXVIII");
    }

    @Test
    public void testNumber499(){
        String result = IntegerToRoman.convert(499);
        assertEquals(result, "CDXCIX");
    }

    @Test(expected = IllegalArgumentException.class)
        public void testInputNonValido() {
            IntegerToRoman.convert(1001);
    }  

    @Test
    public void testNumber999(){
        String result = IntegerToRoman.convert(999);
        assertEquals(result, "CMXCIX");
    }
}