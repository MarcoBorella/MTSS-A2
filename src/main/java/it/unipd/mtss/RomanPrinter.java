////////////////////////////////////////////////////////////////////
// Marco Borella 1204685
// Riccardo Lotto 1204687
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;


public class RomanPrinter{

  public static String print(int num) throws IllegalArgumentException{

    return printAsciiArt(IntegerToRoman.convert(num));
  }

  private static String printAsciiArt(String romanNumber)
  throws IllegalArgumentException{
    if(romanNumber=="") {return "";} 
  
    String[] I = {
      " __  ",
      "|  | ",
      "|  | ",
      "|  | ",
      "|  | ",
      "|__| "
    };

    String[] V = {
    "____    ____ ",
    "\\   \\  /   / ",
    " \\   \\/   /  ",
    "  \\      /   ",
    "   \\    /    ",
    "    \\__/     "
    };
    
    String[] X = {
        "___   ___ ",
        "\\  \\ /  / ",
        " \\  V  /  ",
        "  >   <   ",
        " /  .  \\  ",
        "/__/ \\__\\ "
    };

    String[] L = {
        " __       ",
        "|  |      ",
        "|  |      ",
        "|  |      ",
        "|  `----. ",
        "|_______| "
    };

    String[] C = {
      "  ______  ",
      " /      | ",
      "|  ,----' ",
      "|  |      ",
      "|  `----. ",
      " \\______| "
    };

  HashMap<Character, String[]> map = new HashMap<>();
  map.put('I', I);
  map.put('V', V);
  map.put('X', X);
  map.put('L', L);
  map.put('C', C);

  String[] ris = new String[I.length]; 
  for(int i = 0; i<I.length; i++){ris[i] = "";}
  
  for(int iter = 0; iter<romanNumber.length(); iter++){
    for(int h = 0; h<I.length; h++){
      ris[h] = ris[h] + map.get(romanNumber.charAt(iter))[h];
    }
  }
  String delimiter ="\n"; 
  String risultato = String.join(delimiter, ris); 

  return risultato; 

  }
  
};