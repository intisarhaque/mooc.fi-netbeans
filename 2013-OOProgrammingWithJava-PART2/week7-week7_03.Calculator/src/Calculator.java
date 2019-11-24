/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Intisar
 */
public class Calculator {
    private int howmany = 0;
    private Reader reader = new Reader();
    private int[] values = new int[2];
    
    
    
    public void start() {
        
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                howmany+=1;
            } else if (command.equals("difference")) {
                difference();
                howmany+=1;
            } else if (command.equals("product")) {
                product();
                howmany+=1;
            }
        }

        statistics();
    }
    
    private void sum()
    {
        /*System.out.println("value1: ");
        int x = reader.readInteger();
        System.out.println("value2: ");
        int y = reader.readInteger();*/
        list();
        System.out.println("sum of the values " + (values[0]+values[1]));
        
    }
    
    private void difference()
    {
        list();
        System.out.println("difference of the values " + (values[0]-values[1]));
        
    }
    
    private void product()
    {
        list();
        System.out.println("product of the values " + (values[0]*values[1]));
        
    }
    
    private void statistics()
    {
        System.out.println("Calculations done "+howmany);
    }
    
    private void list()
    {
        for (int i=0;i<2;i+=1)
        {
            System.out.println("value"+(i+1));
            values[i] = reader.readInteger();
        }
    }
}
