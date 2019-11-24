public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int count = 0;
        while (count<amount){
            System.out.print("*");
            count +=1;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int count = 0;
        while (count<amount){
            System.out.print(" ");
            count +=1;
        }
        
    }

    public static void printTriangle(int size) {
        // 40.2
        int length=1;
        int space=size-1;
        while (length<=size){
             printWhitespaces(space);
             printStars(length);
             length+=1;
             space -=1;
        }
        
        
            
    }
                   
    public static void xmasTree(int height) {
        // 40.3
        
        int length=1;
        int space=height-1;
        while (length<=(height*2)){
             printWhitespaces(space);
             printStars(length);
             length+=2;
             space -=1;
        }
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);
    }
    
    
    
    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(4);
        System.out.println("---");
        //xmasTree(4);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(5);
        //printWhitespaces(4);
        printStars(1);
        printWhitespaces(1);
        
    }
}
