////////////////////////////////////////////////////////////////////
// Marco Borella 1204685
// Riccardo Lotto 1204687
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

  public static String convert(int number) throws IllegalArgumentException {
    String s = "L'intero deve essere compreso tra 0 e 10";
    if(number < 0 || number > 10) {
        throw new IllegalArgumentException(s);
    }

    String roman = "";

    while (number >= 10) {
      roman = roman + "X";
      number = number - 10;
    }
    while (number >= 9) {
      roman = roman + "IX";
      number = number - 9;
    }
    while (number >= 5) {
      roman += "V";
      number = number - 5;
    }
    while (number >= 4) {
        roman += "IV";
        number = number - 4;
    }  
    while(number >= 1){
        roman = roman + "I";
        number = number - 1;
    }

    return roman;
  }
}