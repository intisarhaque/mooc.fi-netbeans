import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        this.length=length;
        // Initialize the variable
    }

    public String createPassword() {
        // write code that returns a randomized password
        String Password = "";
        for (int i =0; i<this.length; i+=1){
            int z = this.random.nextInt(26);
            System.out.print(z + "  ");
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(z); 
            Password = Password + symbol;
        }
        return Password;
    }
}
