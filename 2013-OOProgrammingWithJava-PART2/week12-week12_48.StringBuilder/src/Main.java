
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder string = new StringBuilder("{ ");
        for (int i=0; i<t.length; i+=1)
         {
             if (i%4==0)
             {
                 if(i==(t.length-1))
                 {
                     string.append("\n");
                     string.append(" " + t[i]);
                 }
                 else
                 {
                     string.append("\n");
                     string.append(" ").append(t[i]).append(", ");
                 }
                 
             }
             else if(i==(t.length-1))
             {
                 string.append(t[i]);
                 
             }
             else
             {
                 string.append(t[i]).append(", ");
                 
             }
         }
        
        string.append("\n}");
        return string.toString();
        
        
    }
}
