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

    @Test(expected = IllegalArgumentException.class)
        public void testInputNonValido() {
            IntegerToRoman.convert(1001);
    }                     
}