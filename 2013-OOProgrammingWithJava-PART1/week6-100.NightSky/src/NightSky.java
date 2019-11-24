/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Intisar
 */
import java.util.*;
import java.util.Random;
public class NightSky {
    private double density;
    private int width;
    private int height;
    //private Random random;
    private int starsInLastPrint;
    
    public NightSky(double density)
    {
        this.density=density;
        this.width=20;
        this.height=10;
        //this.random = new Random();
    }
    public NightSky(double density, int width, int height)
    {
        this.density=density;
        this.width=width;
        this.height=height;
        //this.random = new Random();
    }
    public NightSky(int width, int height)
    {
        this.density=0.1;
        this.width=width;
        this.height=height;
        //this.random = new Random();
    }
    
    public void printLine()
    {
        Random random = new Random();
        for (int i=0; i<this.width; i+=1)
        {
          double probability = random.nextDouble();
          if (probability<=this.density)
          {
              System.out.print("*");
              this.starsInLastPrint +=1;
          }
          else
          {
              System.out.print(" ");
          }
        }
    }
    public void print()
    {
        this.starsInLastPrint=0;
        for (int i=0;i<this.height; i+=1)
        {
            printLine();
            System.out.println("");
        }
    }
    public int starsInLastPrint()
    {
        return this.starsInLastPrint;
    }
    
}
