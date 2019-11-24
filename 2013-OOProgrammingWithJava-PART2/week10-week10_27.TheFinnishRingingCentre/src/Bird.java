
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }
    public String latinName()
    {
        return this.latinName;
    }
    public int ringingYear()
    {
        return this.ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    public boolean equals (Object object)
    {
        if (object ==null)
        {
            return false;
        }
        if (this.getClass() != object.getClass())
        {
            return false;
        }
        Bird compared = (Bird) object;
        if (this.latinName.equals(compared.latinName()))
        {
            if (this.ringingYear==compared.ringingYear())
            {
                return true;
            }
            else return false;
        }
        else
        {
            return false;
        }
    }
    public int hashCode()
    {
        if (this.latinName==null)
        {
            return 1;
        }
        else
        {
            int z = this.latinName.length() + this.ringingYear;
            return z;
        }
        
    }
    
}


