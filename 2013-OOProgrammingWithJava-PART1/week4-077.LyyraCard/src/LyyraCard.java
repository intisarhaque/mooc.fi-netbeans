/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Intisar
 */
public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
        // write code here
    }
    
    public void payEconomical() {
    // write code here
        if (this.balance>=2.5){
            this.balance -= 2.5;
        }
        
    }
    

    public void payGourmet() {
    // write code here
        if (this.balance>=4.0){
            this.balance -= 4.0;
        }
    }
    public void loadMoney(double amount) {
        boolean noNegative = true;
        double check = this.balance;
        if (amount < 0){
            noNegative = false;
        }
        check = check += amount;
        if (noNegative == true){
             if (check>150 ){
            this.balance = 150;
        }else{
            this.balance = check;
        }
        }
       
    // write code here
}
    

    public String toString() {
        return "The card has " + this.balance + " euros";
        // write code here
    }
    
}
