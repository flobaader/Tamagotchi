import javax.swing.JDialog; 
import javax.swing.JLabel;
 
public class Dialog_frame
{
    public static void main(String title, String lable)
    {
        JDialog mainJDialog = new JDialog();
        
        mainJDialog.setTitle(title);
 
        // (W,H)
        mainJDialog.setSize(600,200);
        
        // Dialog wird auf modal gesetzt
        mainJDialog.setModal(true);
        
        // Hinzufügen einer Komponente, 
        // in diesem Fall ein JLabel
        mainJDialog.add(new JLabel(lable));
        
        mainJDialog.setVisible(true);
    }
}