
/**
 * Write a description of class Trex here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trex extends Dinosaur
{
    public Trex()
    {
        super("Trex");
    }
    
    
    
    public boolean attack(Dinosaur def)
    {
    if(def.getHealth() > 0)
    {
        if(def.getType().equals("Trex"))
        {
            if(Math.random() > 0.5)
            {
                this.update(true, def);
                return true;
            }
            else
            {
                this.update(false, def);
                
                return false;
            }
        }
        else if(Math.random() > 0.30)
        {
            this.update(true, def);
            
            return true;
        }
        else
        {
            this.update(false, def);
            
            return false;
        }
    }
    return false;
   }
}


 