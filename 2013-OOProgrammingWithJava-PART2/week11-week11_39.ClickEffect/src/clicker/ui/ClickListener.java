/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;
import clicker.applicationlogic.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author Intisar
 */
public class ClickListener implements ActionListener {
    private JLabel label;
    private Calculator calc;
    
    public ClickListener(Calculator calculator, JLabel text)
    {   
        this.calc=calculator;
        this.label=text;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calc.increase();  
        String x = Integer.toString(calc.giveValue());        
        label.setText(x);
    }
    
}
