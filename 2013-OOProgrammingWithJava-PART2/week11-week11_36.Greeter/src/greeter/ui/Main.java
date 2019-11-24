package greeter.ui;
import java.awt.FlowLayout;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Main extends JFrame{
    public static void main(String[] args) {
      
        //SwingUtilities.invokeLater(new UserInterface());
        UserInterface ui = new UserInterface();
        SwingUtilities.invokeLater(ui);
        
    }
}
