/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author Intisar
 */
public class PersonalBoard extends GameOfLifeBoard{
    

    public PersonalBoard(int width, int height)
    {
        super(width,height);        
    }
    @Override
    public void manageCell(int x, int y, int livingNeighbours) 
    {
        livingNeighbours = getNumberOfLivingNeighbours(x,y);
        if (isAlive(x,y))
        {
            if (livingNeighbours<2)
            {
                turnToDead(x,y);
            }
            else if(livingNeighbours>3)
            {
                turnToDead(x,y);
            }
        }
        else
        {
            if (livingNeighbours==3)
            {
                turnToLiving(x,y);
            }
        }
        
    }
    @Override
    public void initiateRandomCells(double d) {
        int x = super.getWidth();
        int y = super.getHeight();
        
        for (int count1 = 0; count1<x;count1+=1)
        {
            for (int count2 = 0; count2<y; count2+=1)
            {
                Random random = new Random();
                double prob = random.nextDouble();
                if (prob<=d)
                {
                    turnToLiving(count1, count2);
                }
            }                    
        }        
    }

    @Override
    public boolean isAlive(int x, int y) {
        if (x>=0 && y>=0 && x<super.getWidth() && y<super.getHeight())
        {
            if (getBoard()[x][y] == true)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    @Override
    public void turnToLiving(int x, int y) {
        
        if (x>=0 && y>=0 && x<super.getWidth() && y<super.getHeight())      
        {
            getBoard()[x][y] = true;
        }
    }

    @Override
    public void turnToDead(int x, int y) {
        if (x>=0 && y>=0 && x<super.getWidth() && y<super.getHeight())  
        {
            getBoard()[x][y] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int count=0;
        if (x==getWidth()-1&&y==getHeight()-1)
        {
            return 0;
        }
        if (x==0)
        {
            if (y==0)
            {
                if(getBoard()[x+1][y])
                {
                    count+=1;
                }
                if(getBoard()[x][y+1])
                {
                    count+=1;
                }
                if(getBoard()[x+1][y+1])
                {
                    count+=1;
                }
            }
            else if(y==super.getHeight()-1)
            {
                if(getBoard()[x+1][y])
                {
                    count+=1;
                }
                if(getBoard()[x][y-1])
                {
                    count+=1;
                }
                if(getBoard()[x+1][y-1])
                {
                    count+=1;
                }
            }
            else
            {
                if(getBoard()[x+1][y])
                {
                    count+=1;
                }                
                if(getBoard()[x][y+1])
                {
                    count+=1;
                }
                if(getBoard()[x][y-1])
                {
                    count+=1;
                }
                if(getBoard()[x][y+1])
                {
                    count+=1;
                }
                if(getBoard()[x][y-1])
                {
                    count+=1;
                }
            }
        }
        else if (y==0)
        {
            if (x==super.getWidth()-1)
            {
                if (getBoard()[x][y+1])
                {
                    count+=1;
                }
                if (getBoard()[x-1][y])
                {
                    count+=1;
                }
                if (getBoard()[x-1][y+1])
                {
                    count+=1;
                }
            }
            else
            {
                if (getBoard()[x-1][y])
                {
                    count+=1;
                }
                if (getBoard()[x+1][y])
                {
                    count+=1;
                }
                if (getBoard()[x-1][y+1])
                {
                    count+=1;
                }
                if (getBoard()[x+1][y+1])
                {
                    count+=1;
                }
                if (getBoard()[x][y+1])
                {
                    count+=1;
                }
                
            }           
        }
        else if(x==getWidth()-1)
        {
            if (y==getHeight()-1)
            {
                if (getBoard()[x][y-1])
                {
                    count+=1;
                }
                if (getBoard()[x-1][y-1])
                {
                    count+=1;
                }
                if (getBoard()[x][y-1])
                {
                    count+=1;
                }
            }
            else
            {
                if (getBoard()[x][y+1])
                {
                    count+=1;
                }
                if (getBoard()[x-1][y+1])
                {
                    count+=1;
                }
                if (getBoard()[x-1][y])
                {
                    count+=1;
                }
                if (getBoard()[x-1][y-1])
                {
                    count+=1;
                }
                if (getBoard()[x][y-1])
                {
                    count+=1;
                }
            }
        }
        else if (y==getHeight()-1)
        {
            if (getBoard()[x+1][y])
            {
                count+=1;
            }
            if (getBoard()[x+1][y-1])
            {
                count+=1;
            }
            if (getBoard()[x-1][y-1])
            {
                count+=1;
            }
            if (getBoard()[x][y-1])
            {
                count+=1;
            }
            if (getBoard()[x-1][y])
            {
                count+=1;
            }
        }
        else 
        {
            if (getBoard()[x][y+1])
            {
                count+=1;
            }
            if (getBoard()[x+1][y+1])
            {
                count+=1;
            }
            if (getBoard()[x+1][y])
            {
                count+=1;
            }
            if (getBoard()[x+1][y-1])
            {
                count+=1;
            }
            if (getBoard()[x][y-1])
            {
                count+=1;
            }
            if (getBoard()[x-1][y-1])
            {
                count+=1;
            }
            if (getBoard()[x-1][y])
            {
                count+=1;
            }
            if (getBoard()[x-1][y+1])
            {
                count+=1;
            }
        }
        return count;
    }

    
    
}
