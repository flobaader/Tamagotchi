/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi;

/**
 *
 * @author laptop
 */
public class GUI {
    public GUI ()
    {
      Tamagotchi tamagotchi = new Tamagotchi(InputDialog.main("Gebe den Namen des Tamagotchis ein")); 
   
      Apple apple = new Apple();
      Banana banana = new Banana();
      Burger burger = new Burger();
      
      Shop shop = new Shop(tamagotchi, burger, apple, banana);
    }
    
}
