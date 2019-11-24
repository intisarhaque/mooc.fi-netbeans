public class Reformatory {
    private int totalmeasuredweight;
    
    public Reformatory()
    {
        this.totalmeasuredweight=0;
    }
         
    public int weight(Person person) 
    {
        // return the weight of the person
        this.totalmeasuredweight+=1;
        return person.getWeight();
    }
    public void feed(Person person)
    {
        int x = person.getWeight() + 1;
        person.setWeight(x);
    }
    public int totalWeightsMeasured() 
    {
       return this.totalmeasuredweight; 
    }
    

}
