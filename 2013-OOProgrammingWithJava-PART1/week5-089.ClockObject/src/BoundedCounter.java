
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
    }
    
    public void setValue(int setted){
        if (setted<0 || setted>upperLimit){
            
        }else{
            this.value=setted;
        }
        
    }

    public void next() {
        if (value<upperLimit){
            value += 1;
           
        }else{
            if (value==upperLimit){
                value = 0;
            }
        }
    }
    
    public int getValue() {
    // write here code that returns the value
        return this.value;
    }

    public String toString() {
        // write code here
        if (value<10){
            return "0" + value;
        }else{
            return "" + value;
        }
        
    }
}
