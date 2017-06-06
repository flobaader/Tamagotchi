public class Tamagotchi
{
    public String name;  
    public int age;    
    public String mood;
    public String fatigue;
    public boolean hunger;
    public int hungerlevel;
    public int toiletlevel;
    public int hygiene;
    public int money;
    public int mass;
    public int hp;
    public int level;
    public Sound sound;
    
    public Tamagotchi(String tamagotchiName, Sound Tsound)
    {
          tamagotchiName = name;
          age = 0;
          hunger = false;
          toiletlevel = 0;
          hygiene = 100;
          money = 0;
          mass = 1;
          hp = 100;
          level = 1;
          Tsound = sound;
          
    }

    public eat ()
    {
       if (hunger == true)
       {
           Food.givefood();
        if (hungerlevel + value <=100)
        {
            hungerlevel = hungerlevel + value;
        }
        else
        {
            hungerlevel = 100;
        }
       }
    }

