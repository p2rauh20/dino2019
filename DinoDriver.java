
/**
 * Write a description of class DinoDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver
{
   public static void main(String[] args)
   {
       Dinosaur d1 = new Trex();
       Dinosaur d2 = new Stego();
       Dinosaur d3 = new Trike();
       d1.setHealth(100);
       d2.setHealth(100);
       d3.setHealth(100);
       int winCount =0;
       for(int i=0; i<100; i++)
       {
           if(d1.attack(d2))
           {
               winCount++;
            }
           d1.ageUp();
           System.out.println(d1.toString()+"        ---------       "+d2.toString());
       }
       System.out.println(winCount+" out of 100 attacks");
   }
}
