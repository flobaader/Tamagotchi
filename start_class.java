public class start_class
{
    private User mainUser;
    private Tamagotchi_symbol symbol;
    private Tamagotchi tamagochi;
    
    public start_class()
    {
        User mainUser = new User();
        Tamagotchi_symbol symbol = new Tamagotchi_symbol();
        Tamagotchi tamagochi = new Tamagotchi(Input_frame.main("Gib den Namen deines Tamagotchis ein!"));
        
        GUI.main();
        Dialog_frame.main("Title", "Text");
    }
}