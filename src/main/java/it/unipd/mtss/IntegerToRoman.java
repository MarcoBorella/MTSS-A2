////////////////////////////////////////////////////////////////////
// Marco Borella 1204685
// Riccardo Lotto 1204687
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

  public static String convert(int number) throws IllegalArgumentException {
    String s = "L'intero deve essere compreso tra 0 e 3";
    if(number < 0 || number > 3) {
        throw new IllegalArgumentException(s);
    }

    String roman = "";

    while(number >= 1){
        roman = roman + "I";
        number = number - 1;
    }

    return roman;
  }
}