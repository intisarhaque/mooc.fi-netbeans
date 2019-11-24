
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account mineAccount = new Account("Mine's account", 100);
        
        

        System.out.println("Initial state");
        System.out.println(mineAccount);
        
        mineAccount.deposit(20);
        
        
        System.out.println("Final state");
        System.out.println(mineAccount);
        
    }

}
