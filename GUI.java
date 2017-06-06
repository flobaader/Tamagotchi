import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class GUI
{   
    public static void main()
    {   
        //creating new object 'mainFrame' from class 'JFrame'
        JFrame mainFrame = new JFrame("mainFrame");
        
        //setting size of mainFrame (in pixels)
        mainFrame.setSize(400,700);
        
        mainFrame.add(new JLabel("Example Label"));
        
        Border bo = new LineBorder(Color.black);
        
        // Erstellung einer Menüleiste
        JMenuBar bar = new JMenuBar();
        
        // Wir setzen unsere Umrandung für unsere JMenuBar
        bar.setBorder(bo);
        
        // Erzeugung eines Objektes der Klasse JMenu
        JMenu menu0 = new JMenu("Inventart");
        JMenu menu1 = new JMenu("Shop");
        JMenu menu2 = new JMenu("Minispiele");
        JMenu menu3 = new JMenu("Bedürfnisse");
        
        // Menü wird der Menüleiste hinzugefügt
        bar.add(menu0);
        bar.add(menu1);
        bar.add(menu2);
        bar.add(menu3);
        
        // Menüleiste wird für die mainFrame gesetzt
        mainFrame.setJMenuBar(bar);
        
        //setting visibility to true (bool)
        mainFrame.setVisible(true);
    }
}