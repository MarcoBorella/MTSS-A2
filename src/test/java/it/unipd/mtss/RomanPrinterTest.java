////////////////////////////////////////////////////////////////////
// Marco Borella 1204685
// Riccardo Lotto 1204687
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

 public class RomanPrinterTest 
{

    @Test(expected = IllegalArgumentException.class)
    public void testoInputNegativo_conmockito(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(()->IntegerToRoman.convert(-1)).thenThrow(IllegalArgumentException.class);
            RomanPrinter.print(-1);}}
    
    @Test
    public void testPrintNumero0_conmockito(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(()->IntegerToRoman.convert(0)).thenReturn(""); 
            assertEquals("", RomanPrinter.print(0));
    }}
    @Test
    public void testPrintNumero3_conmockito(){

        String pattern =
                 " __   __   __  \n" +
                 "|  | |  | |  | \n" +
                 "|  | |  | |  | \n" +
                 "|  | |  | |  | \n" +
                 "|  | |  | |  | \n" +
                 "|__| |__| |__| ";
                      
    try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
        utilities.when(()->IntegerToRoman.convert(3)).thenReturn("III"); 
        assertEquals(pattern, RomanPrinter.print(3));

    }}

    @Test
    public void testPrintNumero4_conmockito(){

        String pattern = " __  ____    ____ \n" +
             "|  | \\   \\  /   / \n" +
             "|  |  \\   \\/   /  \n" +
             "|  |   \\      /   \n" +
             "|  |    \\    /    \n" +
             "|__|     \\__/     ";


    try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
        utilities.when(()->IntegerToRoman.convert(4)).thenReturn("IV"); 
        assertEquals(pattern, RomanPrinter.print(4));

    }}

    @Test
    public void testPrintNumero9_conmockito(){

        String pattern = "___   ___ ____    ____  __   __   __  \n" +
             "\\  \\ /  / \\   \\  /   / |  | |  | |  | \n" +
             " \\  V  /   \\   \\/   /  |  | |  | |  | \n" +
             "  >   <     \\      /   |  | |  | |  | \n" +
             " /  .  \\     \\    /    |  | |  | |  | \n" +
             "/__/ \\__\\     \\__/     |__| |__| |__| ";


    try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
        utilities.when(()->IntegerToRoman.convert(18)).thenReturn("XVIII"); 
        assertEquals(pattern, RomanPrinter.print(18));

    }}

    @Test
    public void testPrintNumero49_conmockito(){

        String pattern = "___   ___  __       __  ___   ___ \n" +
             "\\  \\ /  / |  |     |  | \\  \\ /  / \n" +
             " \\  V  /  |  |     |  |  \\  V  /  \n" +
             "  >   <   |  |     |  |   >   <   \n" +
             " /  .  \\  |  `----.|  |  /  .  \\  \n" +
             "/__/ \\__\\ |_______||__| /__/ \\__\\ ";




    try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
        utilities.when(()->IntegerToRoman.convert(49)).thenReturn("XLIX"); 
        assertEquals(pattern, RomanPrinter.print(49));

    }}

    @Test
    public void testPrintNumero38_conmockito(){

        String pattern =
         "___   ___ ___   ___ ___   ___ ____    ____  __   __   __  \n" +
        "\\  \\ /  / \\  \\ /  / \\  \\ /  / \\   \\  /   / |  | |  | |  | \n" +
        " \\  V  /   \\  V  /   \\  V  /   \\   \\/   /  |  | |  | |  | \n" +
        "  >   <     >   <     >   <     \\      /   |  | |  | |  | \n" +
        " /  .  \\   /  .  \\   /  .  \\     \\    /    |  | |  | |  | \n" +
        "/__/ \\__\\ /__/ \\__\\ /__/ \\__\\     \\__/     |__| |__| |__| ";




    try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
        utilities.when(()->IntegerToRoman.convert(38)).thenReturn("XXXVIII"); 
        assertEquals(pattern, RomanPrinter.print(38));

    }}
    
}