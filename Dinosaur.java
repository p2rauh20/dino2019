
/**
 * Abstract class Dinosaur - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Dinosaur
{
    // instance variables - replace the example below with your own
    private String type;
    private int age;
    private String gender;
    private int wins;
    private int battleCount;
    private int health; 
    private String name;
    private boolean isAlive;
    
    
    /**
     * Dinosaur constructer -- // There is no constructor because it varies per dinosaur and 
     * cannot be set as solomente uno.
     * 
     * 
     * 
     * Attack is abstract because each dino will have a different way to attack.
     */
    public Dinosaur(String t)
        {
        this.type = t;
        this.age = 0;
        this.wins = 0;
        this.battleCount = 0;
        this.health = 10;
        if(Math.random() < 0.5)
            {
            this.gender = "female";
            }
            else
            {
                this.gender = "male";
            }
            
        }
        
    public void setisAlive(boolean a)
    {
        this.isAlive = a;
    }
    public boolean getisAlive()
    {
        return this.isAlive;
    }
    
    
    public void checkHealth()
    {
        if(this.health <= 0)
        {
            if(this.isAlive == true)//health is 0, but isAlive is true = just died
            {
                System.out.print(this.toString()+ "just died:");
            }
            
            this.isAlive = false;
            this.health = 0;
        }
        else if(this.health>100)
        {
            this.health =100;
        }
        
    }
    public abstract boolean attack(Dinosaur def);
    public void ageUp()
    {
        this.age++;
        if(this.age > 5)
        {
            if(this.health >= 100)
            {
                this.health = 100;
            }
            this.health = this.health + 5;
            
        }
        this.checkHealth();
        
    }
    //*******************************************************************************************   
        public String getType()
        {
        return type;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    
    //*******************************************************************************************
    public int getAge() 
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    
    //******************************************************************************************
    public int getBattleCount() 
    {
        return battleCount;
    }
    public void setBattleCount(int battleCount) 
    {
        this.battleCount = battleCount;
    }

    public int getHealth() 
    {
        return health;
    }

    public void setHealth(int health) 
    {
        this.health = health;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
    
    public int getWins()
    {
        return wins;
    }
    
    public void setWins(int Wins)
    {
        this.wins = wins;
    }
    
    public void update(boolean winner, Dinosaur def)
    {
        this.battleCount++;  
        def.setBattleCount(def.getBattleCount () +1);
        if (winner == true) // if(winner)
        {
            this.wins++;
            def.setHealth(def.getHealth() -20);
            def.checkHealth();
        }
        else
        {
            def.setWins(def.getWins()+1);
            this.setHealth(this.getHealth() -20);
            this.checkHealth();
        }
    }
    
    public String toString()
    {    
        String temp = "";
        temp = "The " + this.type+ " is "+ this.age+ " years old   HEALTH: "+ this.health + "   Gender:" + this.gender; 
        return temp;
        
    }

}
