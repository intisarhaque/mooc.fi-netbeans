/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Intisar
 */
public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    
    public Person(String nameAtStart){
        this.age=0;
        this.name=nameAtStart;
        this.weight = 0;
        this.height = 0;
    }
    
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex(){
        double heightDividedByHundred = this.height / 100.0;
        return this.weight / ( heightDividedByHundred * heightDividedByHundred );
    }
        
       
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
    
    public void becomeOlder() {
        this.age = this.age + 1;
    }
    
    public boolean isAdult(){
        if ( this.age < 18 ) {
            return false;
        }

        return true;
    }
    
    public String getName() {
                return this.name;
            }

    public static void main(String[] args) {
            Person pekka = new Person("pekka");
            Person brian = new Person("brian");
            Person martin = new Person("martin");
            
            System.out.println(pekka);
            System.out.println(brian);
            System.out.println(martin);
            
            int count = 0;
            while (count <30){
                pekka.becomeOlder();
                count +=1;
            }
            
            
            if (pekka.isAdult()){
                System.out.println(pekka.getName() + " is old ");
                
            }
            else{
                System.out.println(pekka.getName() + " is young ");
                
            }
            
            pekka.setHeight(180);
            pekka.setWeight(86);
            System.out.println(pekka.getName() + " BMI of " + String.format( "%.2f", pekka.bodyMassIndex()));
        // TODO code application logic here
            
            
            
            
    }
    
}
