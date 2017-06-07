package tamagotchi;

public class Tamagotchi 
{
    protected LifeState lifeState;
    protected State state;
    protected boolean hungry;
    protected int hunger;
    protected int speeliness;
    protected String name;
            
    public Tamagotchi(String Tname)
    {
        
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
        return speeliness;
    }

    public void setSpeeliness(int speeliness) {
        this.speeliness = speeliness;
    }

    public String getName() {
        return name;
    }
}