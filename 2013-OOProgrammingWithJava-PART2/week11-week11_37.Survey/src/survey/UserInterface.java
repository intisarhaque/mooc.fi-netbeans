package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(300, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
        // Create your app here
    }
    
    private void createComponents(Container container) {           
        BoxLayout layout = new BoxLayout(container, BoxLayout.X_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Are you?"));

        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(yes);
        buttonGroup.add(no);

        container.add(yes);
        container.add(no);
        
        container.add(new JLabel("Why?"));
        ButtonGroup buttonGroup2 = new ButtonGroup();
        JRadioButton noreason = new JRadioButton("No reason.");
        JRadioButton fun = new JRadioButton("Because it is fun!");
        buttonGroup2.add(noreason);
        buttonGroup2.add(fun);
        JButton done = new JButton("Done!");
        container.add(noreason);
        container.add(fun);
        container.add(done);
        
                
        
    }


    public JFrame getFrame() {
        return frame;
    }
}
