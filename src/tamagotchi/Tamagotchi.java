package tamagotchi;

public class Tamagotchi 
{
    protected LifeState lifeState;
    protected State state;
    protected boolean hungry;
    protected int hunger;
    protected int sleepyness;
    protected String name;
    protected BufferedImage normalState1;
    
    public Tamagotchi(String Tname)
    {
      LifeState lifestate = LifeState.ALIVE;
      State state = State.AWAKE;
      boolean hungry = false;
      int hunger = 100;
      int sleepyness = 0;
      String name = Tname;
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

    public int getSpeeliness() {
        return sleepyness;
    }

    public void setSpeeliness(int speeliness) {
        this.sleepyness = speeliness;
    }

    public String getName() {
        return name;
    }
    
}