package movingfigure;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Figure f;
    public UserInterface(Figure f)
    {
        this.f=f;
    }

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        addListeners();

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        
        DrawingBoard drawingBoard = new DrawingBoard(f);
        container.add(drawingBoard);
        frame.addKeyListener(new KeyboardListener(drawingBoard, f));
    }

    private void addListeners() {
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
