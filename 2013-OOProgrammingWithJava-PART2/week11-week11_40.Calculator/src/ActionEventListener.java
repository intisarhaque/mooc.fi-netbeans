/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Intisar
 */



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ActionEventListener implements ActionListener {
    private String action;
    private JTextField display;
    private JTextField text;
    private JButton zed;
    public ActionEventListener(JTextField textAreaTop,JTextField textAreaMid, JButton zed)
    {
        this.display=textAreaTop;
        this.text=textAreaMid;
        this.zed=zed;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("+"))
        {
            
            try
            {
                int x = Integer.parseInt(display.getText());
                int y = Integer.parseInt(text.getText());
                int z = x+y;
                if (display.isEnabled())
                {
                    display.setText(Integer.toString(z));
                    text.setText("");
                    zed.setEnabled(true);

                }
                else
                {
                    display.setEnabled(true);
                    display.setText(Integer.toString(z));
                    text.setText("");
                    zed.setEnabled(true);


                }
            }
            catch (NumberFormatException ewg)
            {
                text.setText("");
            }
            text.setText("");
        }
        else if (e.getActionCommand().equals("-"))
        {
            
            try
            {
                int x = Integer.parseInt(display.getText());         
                int y = Integer.parseInt(text.getText());            
                int z = x-y;
                if (display.isEnabled())
                {
                    display.setText(Integer.toString(z));
                    text.setText("");
                    zed.setEnabled(true);

                }
                else
                {
                    display.setEnabled(true);
                    display.setText(Integer.toString(z));
                    text.setText("");
                    zed.setEnabled(true);
                }
            }
            catch(NumberFormatException ewg)
            {
                text.setText("");
            }
            text.setText("");
                
            
            
        }
        else
        {
            if (!display.getText().equals("0"))
            {                
                zed.setEnabled(false);
                display.setText("0");
            }
        }
    }
    
}
