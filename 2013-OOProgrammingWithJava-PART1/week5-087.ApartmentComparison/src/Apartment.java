
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment)
    {
        if (this.squareMeters>otherApartment.squareMeters)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public int priceDifference(Apartment otherApartment)
    {
        int x = this.squareMeters*this.pricePerSquareMeter;
        int y = otherApartment.squareMeters*otherApartment.pricePerSquareMeter;
        int z = Math.abs(x-y);
        return z;
        
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment)
    {
        int x = this.squareMeters*this.pricePerSquareMeter;
        int y = otherApartment.squareMeters*this.pricePerSquareMeter;
        if (x>y)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
