
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        JTextField textAreaTop = new JTextField("0");
        textAreaTop.setEnabled(false);
        JTextField textAreaMid = new JTextField("0");        
        JPanel bottomPanel = new JPanel(new GridLayout(1,3));
        JButton plus = new JButton("+");
        bottomPanel.add(plus);
        JButton minus = new JButton("-");
        bottomPanel.add(minus);
        JButton zed = new JButton("z");
        zed.setEnabled(false);
        bottomPanel.add(zed);
        container.add(textAreaTop);
        container.add(textAreaMid);
        container.add(bottomPanel);   
        ActionEventListener botton;
        botton = new ActionEventListener(textAreaTop, textAreaMid, zed);
        plus.addActionListener(botton);
        minus.addActionListener(botton);
        zed.addActionListener(botton);
        
        
        
    }
    

    public JFrame getFrame() {
        return frame;
    }
}