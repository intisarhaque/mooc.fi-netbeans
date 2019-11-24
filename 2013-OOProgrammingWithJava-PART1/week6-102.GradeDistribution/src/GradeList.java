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
public class GradeList {
    private Score[] list;
    private int accepted;
    private int declined;
    
    public GradeList()
    {
        this.list=new Score[6];
        this.accepted=0;
        this.declined=0;
    }
    public void addtoList(String[] titles)
    {
        for (int i=0; i<6; i+=1)
        {
            list[i] = new Score(titles[i]);
        }
        
        
    }
    public void grades(int points)
    {
        if (points>=0&&points<61)
        {
            if (0 <= points && points <=29) {
                list[0].scoreadd();    
                declined+=1;
            
            }
            if (30 <= points){
                if (points <=34){
                    list[1].scoreadd();
                    accepted+=1;
                }
            }
            if (35 <= points){
                if (points <=39){
                    list[2].scoreadd();
                    accepted+=1;
                }
            }
            if (40 <= points){
                if (points <=44){
                    list[3].scoreadd();
                    accepted+=1;
                }
            }
            if (45 <= points){
                if (points <=49){
                    list[4].scoreadd();
                    accepted+=1;
                }
            }
            if (50 <= points){
                if (points <=60){
                    list[5].scoreadd();
                    accepted+=1;
                }
            }
            
        }
        
        
        
    }
    public void ask(Scanner reader)
    {
        System.out.println("Type exam score, -1 completes:");
        int points = 0;
        while (points != -1)
        {
            points = Integer.parseInt(reader.nextLine());
            grades(points);
        }
    }
    public void printGrades()
    {
        System.out.println("Grade distribution");
        for (Score s:list)
        {
            System.out.print(s.getName() + ": ");
            Stars(s.howmany());
            System.out.println("");            
        }        
        //System.out.println(accepted + " " + declined);
        System.out.println("Acceptance percentage: " + printAcceptance());
    }
    public void Stars(int x)
    {
        for (int i=0;i<x;i+=1)
        {
            System.out.print("*");
        }
    }
    public double printAcceptance()
    {
        double z = (double)this.accepted/(this.accepted+this.declined)*100;
        if (this.accepted==0)
        {
            return 0;
        }
        else if (this.accepted>0 && this.declined==0)
        {
            return 100;
        }
        else 
        {
            return z;
        }
        
        
    }
    
    
    
}
