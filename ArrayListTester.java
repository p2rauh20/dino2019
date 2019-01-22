
/**
 * Write a description of class ArrayListTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListTester
{
   public static void main(String[] args)
   {
       System.out.print("How many words: ");
       Scanner scan = new Scanner(System.in);
       Scanner scan2 = new Scanner(System.in);
       int numWords = scan.nextInt();
       System.out.println(numWords);
      
       ArrayList<String> words = new ArrayList<String>();
       
       
       words.add("Fat");
       words.add("Chuuby");
       words.add(0,"Ugly");
       words.remove("Fat");
       System.out.println(words);
   }
}
