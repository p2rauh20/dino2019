
/**
 * Write a description of class DinoDriver3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;


public class DinoDriver3
{
    static int deadCount = 0;
    public static void main(String[] args)
    {
        int pop;
        ArrayList<Dinosaur> myPop = new ArrayList<Dinosaur>();
        System.out.println("How many Dinos in Population");
        Scanner scan = new Scanner(System.in);
        int popSize = scan.nextInt();
       
        for(int i=0; i < popSize; i++)
        {
            double randy = Math.random();
            if(randy<0.33)
            {
                myPop.add(new Trex());
            }
            if(randy>0.33 && randy<0.66)
            {
                myPop.add(new Trike());
            }
            if (randy>0.66)
            {
                myPop.add(new Stego());
            }
        }
        
        for(Dinosaur d : myPop)
        {
            int rand = (int)(Math.random()*33);
            for(int i = 0; i<rand; i++)
            {
                d.ageUp();
            }
            System.out.println(d);
        }
        
        }
        
        public static int livingDinos( ArrayList<Dinosaur> p)
    {
        int living = 0;
        for(Dinosaur d : p)
        {
            if (d.getisAlive() == true)
            {
                living++;
            }
        }
        
        return living;
    }
    
        public static void runRound(ArrayList<Dinosaur> p)
        {           
            for(Dinosaur d : p)
            {
                //for(int i =0; i < (int)(Math.random()*36); i++)
                //{
                if(d != null)
                {
                       if(d.getisAlive())
                       {
                           if(livingDinos(p) >= 2)
                           {
                              Dinosaur defend = p.get(DinoDriver3.getDefender(p, d));
                              d.attack(defend);
                           }
                       }
                       System.out.println(d);
                    }
                }
            }
        
    public static int getLivingDinos(ArrayList<Dinosaur> p)
    {
        int living = 0;
        for(Dinosaur d : p)
        {
            if(d.getisAlive())
            {
                living ++;
            }
        }
        return living;
    }
    
    public static int getDefender( ArrayList<Dinosaur> p, Dinosaur attacker  )
    {
        Dinosaur def;// = null;
        int rand = -1; 


        do // def is the attacking dino 
        {
            rand = (int)(Math.random()*p.size());
            def = p.get(rand);
        }while( def == attacker || !def.getisAlive() );

        return rand;
    }
    
    }

    

