
import java.util.*;
public class Main {
    public static void main(String[] args) 
    {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    public static int smallest(int[] array)
    {
        int s = Integer.MAX_VALUE;
        for (int x:array)
        {
            if (x<s)
            {
                s=x;
            }
        }
        return s;
        
    }
    public static int indexOfTheSmallest(int[] array)
    {
        int s = Integer.MAX_VALUE;
        int index=0;
        for (int i=0; i<array.length; i+=1)
        {
            if (array[i]<s)
            {
                s=array[i];
                index=i;
            }
        }
        return index;
        
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int start)
    {
        int s = Integer.MAX_VALUE;
        int index=0;
        for (int i=start; i<array.length; i+=1)
        {
            if (array[i]<s)
            {
                s=array[i];
                index=i;
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2) 
    {
        int temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    public static void sort(int[] array) 
    {
        System.out.println( Arrays.toString(array));
        for (int i=0;i<array.length;i+=1)
        {
            int x = indexOfTheSmallestStartingFrom(array, i);
            swap(array,i,x);
            System.out.println( Arrays.toString(array));
        }
        
        
    }

}