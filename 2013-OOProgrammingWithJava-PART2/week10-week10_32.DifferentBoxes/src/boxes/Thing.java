package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight)throws IllegalArgumentException {
        
        if (weight<0)
        {
            throw new IllegalArgumentException();
        }
        this.name=name;
        this.weight=weight;
        
    }

    @Override
    public int hashCode() {
        return this.name.length();
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this.getClass()==obj.getClass())
        {
            Thing x = (Thing) obj;
            if (this.name.equals(x.name))
            {
                return true;
            }
            else return false;
        }
        else return false;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

}
