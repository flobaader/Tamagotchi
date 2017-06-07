package tamagotchi;

import java.util.*;
import java.util.Timer.*;
import java.util.TimerTask;
import java.lang.Object.*;

public class Tamagotchi 
{
    protected LifeState lifeState;
    protected State state;
    protected boolean hungry;
    protected int hunger;
    protected int sleepyness;
    protected String name;
    protected BufferedImage normalState1;
    protected int money;
    
    public Tamagotchi(String Tname)
    {
      
      LifeState lifestate = LifeState.ALIVE;
      State state = State.AWAKE;
      boolean hungry = false;
      int hunger = 100;
      int sleepyness = 0;
      String name = Tname;
      time();
      sleepTime();
    }

    public LifeState getLifeState() {
        return lifeState;
    }

    public void setLifeState(LifeState lifeState) {
        this.lifeState = lifeState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getSleepyness() {
        return sleepyness;
    }

    public void setSleepyness(int sleepyness) {
        this.sleepyness = sleepyness;
    }

    public String getName() {
        return name;
    }
    
        public int getMoney() {
        return money;
    }


    public void setMoney(int money) {
        this.money = money;
    }
    
    public void eat (int Fvalue)
    {
        if (hunger + Fvalue >= 100)
        {
            hunger = 100;
        }
        else 
        {
            hunger = hunger + Fvalue;
        }  
       action = Action.EATING;
       change();
    }      
            
    public void time()
    { 
        Timer timer = new Timer();
        
        timer.scheduleAtFixedRate(new TimerTask()
            {
                @Override
                public void run()
                {
                hunger = hunger - 1;
                }
        }, 1000, 1000);
      
    }
    

      public void sleepTime()
    { 
        if (state == State.AWAKE)
        {
        Timer sleepTimer = new Timer();
        
        sleepTimer.scheduleAtFixedRate(new TimerTask()
            {
                @Override
                public void run()
                {
                sleepyness = sleepyness + 1;
                }
            }, 1, 5000);
        }
        else 
        {
            Timer sleepTimer = new Timer();
        
        sleepTimer.scheduleAtFixedRate(new TimerTask()
            {
                @Override
                public void run()
                {
                sleepyness = sleepyness - 1;
                }
            }, 1, 5000);
        }
        if (sleepyness == 100)
        {
            LifeState state = LifeState.DEAD;
        }
        
    }    



}