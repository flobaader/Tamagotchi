
package tamagotchi;


public class Shop 
{
    public Tamagotchi shopTamagotchi;
    public Apple shopApple;
    public Banana shopBanana;
    public Burger shopBurger;
   
    public Shop(Tamagotchi tamagotchi,Burger burger, Apple apple, Banana banana)
    {
        shopTamagotchi = tamagotchi;
        apple = shopApple;
        banana = shopBanana;
        burger = shopBurger;
    }
    
    public void giveApple()
    {
       shopTamagotchi.eat (shopApple.getValue());
       shopTamagotchi.setMoney(shopTamagotchi.getMoney() - shopApple.getMoneyValue());
    }
    
    public void giveBanana()
    {
       shopTamagotchi.eat (shopBanana.getValue());
       shopTamagotchi.setMoney(shopTamagotchi.getMoney() - shopBanana.getMoneyValue());
    }
    
    public void giveBurger()
    {
       shopTamagotchi.eat (shopBurger.getValue());
       shopTamagotchi.setMoney(shopTamagotchi.getMoney() - shopBurger.getMoneyValue());
    }
}

