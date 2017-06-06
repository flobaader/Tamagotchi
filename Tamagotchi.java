public class Tamagotchi
{
    public String name;  
    public int age;    
    public String mood;
    public String fatigue;
    public boolean hunger;
    public int hungerlevel;
    public int toiletlevel;
    public int hygiene;         //Baum
    public int money;
    public int mass;
    public int hp;
    public int level;
      
    public Tamagotchi(String tamagotchiName)
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
    }

    public void eat (Food food)
    {
       if (hunger == true)
       {
           food.giveFood();
        if (hungerlevel + food.value <= 100)
        {
            hungerlevel = hungerlevel + food.value;
        }
        else
        {
            hungerlevel = 100;
        }
       }
    }
}
