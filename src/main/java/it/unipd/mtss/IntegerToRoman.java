////////////////////////////////////////////////////////////////////
// Marco Borella 1204685
// Riccardo Lotto 1204687
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) throws IllegalArgumentException {
        String s = "L'intero deve essere compreso tra 0 e 1000";
        if(number < 0 || number > 1000) {
            throw new IllegalArgumentException(s);
        }

        String roman = "";

        String[] numeriRomani =
         {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] numeriArabi =
        {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int i=0;

        while (number > 0) {
            while (number >= numeriArabi[i]) {
                
                roman += numeriRomani[i];
                number -= numeriArabi[i];
            }
            i++;
        }

        return roman;
    }
}