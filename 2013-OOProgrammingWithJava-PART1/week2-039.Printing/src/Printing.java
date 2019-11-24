public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        int count = 0;
        while (count<amount){
            System.out.print("*");
            count +=1;
        }
        System.out.println("");
        
        // call this command amount times        
    }

    public static void printSquare(int sideSize) {
        // 39.2
        
        int row = 0;
        while (row<sideSize){
            printStars(sideSize);
            row +=1;
        }                        
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int row = 0;
        while (row<height){
            printStars(width);
            row +=1;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int length=1;
        while (length<=size){
             printStars(length);
             length+=1;
        }
       
       
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct
        
        
        printStars(5);        
        printStars(3);        
        printStars(9);
        
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        
        System.out.println("\n---");
        printRectangle(5, 6);
        
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

}


    public static void printWhitespaces(int amount) {
        // 40.1
        int count = amount-1;
        while (count>0){
            System.out.print("a");
            count -= 1;
        }
        
    }

    public static void printTriangle(int size) {
        // 40.2
        int length=1;
        int space=size;
        while (length<=size){
             printWhitespaces(space);
             printStars(length);
             length+=1;
             space -=1;
        }