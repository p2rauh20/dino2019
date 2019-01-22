
/**
 * Write a description of class DinoDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver2
{
        static Dinosaur[] pop = new Dinosaur[100];
        static int deadCount = 0;
        static int winCount = 0;
        static int rndCount = 0;
        static int deadAfter = 0;
        static int deadBefore =0;
    public static void Main(String[] args)
    {
        

        for(int i = 0; i<33; i++)
        { 
            pop[i] = new Trex();
        }
        
        for(int i = 33; i<66 ; i++)
        {
            pop[i] = new Stego();
            
        }
        
        for(int i = 66; i<pop.length ; i++)
        {
            pop[i] = new Trike();
        }
        int round = 0;
        do{
         runRound();
         round++;
        }while(livingDinos(pop) >= 2);
}
    
        
        
    public static int livingDinos( Dinosaur[] p)
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
    public static Dinosaur getDefender(Dinosaur[] p, Dinosaur attacker)
    {
        Dinosaur def = attacker;
        
        do
        {
            int rand = (int)(Math.random()*p.length);
            def = p[rand];
            
        }while( def == attacker || def.getisAlive()==false);
        
        
        return def;
    }
    
            public static void runRound()
        {           
            for(Dinosaur d : pop)
            {
                //for(int i =0; i < (int)(Math.random()*36); i++)
                //{
                if(d != null)
                {
                       if(d.getisAlive())
                       {
                           if(livingDinos(pop) >= 2)
                           {
                              Dinosaur defend = DinoDriver2.getDefender(pop, d);
                              if(d.attack(defend))
                              {
                                  winCount++;
                              }
                           }
                       }
                       System.out.println(d);
                    }
                }
            
            deadBefore = deadAfter;
            for(Dinosaur d: pop)
            {
                if(!d.getisAlive())
                {
                    deadAfter++;
                }
            }
            System.out.println("Dead before: " + deadBefore);
            System.out.println("Dead Now: " + deadAfter);
        }
    
}
