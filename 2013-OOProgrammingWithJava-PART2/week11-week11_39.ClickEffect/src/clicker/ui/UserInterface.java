package clicker.ui;
import clicker.applicationlogic.*;
import java.awt.Container;
import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;

    public UserInterface(Calculator calculator)
    {
        this.calculator=calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        //BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        //container.setLayout(layout);
        JLabel l = new JLabel("0");
        JButton x = new JButton("Click!");
        ClickListener c = new ClickListener(calculator,l);
        x.addActionListener(c);
        container.add(l, BorderLayout.NORTH);
        container.add(x, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
