
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    public Money plus(Money added)
    {
        int x = this.euros + added.euros;
        int y = this.cents + added.cents;
        if (y>100)
        {
            x +=1;
            y -=100;
        }
        Money a = new Money (x, y);
        return a;
    }
    public boolean less(Money compared)
    {
        if (this.euros==compared.euros)
        {
            if (this.cents>compared.cents)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        if (this.euros>compared.euros)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public Money minus(Money decremented)
    {
        int x = this.euros-decremented.euros;
        int y = this.cents-decremented.cents;
        if (x<0)
        {
            Money a = new Money (0,0);
            return a;
        }
        if (y<0)
        {
            x-=1;
            if (x<0)
        {
            Money a = new Money (0,0);
            return a;
        }
            y = 100+y;
        }
        Money a = new Money (x, y);
        return a;
        
        
    }

}
