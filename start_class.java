public class start_class
{
    private User mainUser;
    private Tamagotchi_symbol symbol;
    private Tamagotchi tamagotchi;
    private Food[] food;
    
    public start_class()
    {
        mainUser = new User();
        symbol = new Tamagotchi_symbol();
        tamagotchi = new Tamagotchi(Input_frame.main("Gib den Namen deines Tamagotchis ein!"));
        
        GUI.main();
        Dialog_frame.main("Title", "Text");
 
        food = new Food[4];
        
        food [0] = new Food(10, "Apfel");
        food [1] = new Food(20, "Banane");
        food [2] = new Food(50, "Burger");
        food [3] = new Food(100,"Schnitzel");  
    }
}