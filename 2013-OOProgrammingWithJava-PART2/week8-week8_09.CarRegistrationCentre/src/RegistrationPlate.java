
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }
    
    public String getregCode()
    {
        return this.regCode;
    }
    public String getcountry()
    {
        return this.country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

   public boolean equals(Object check2)
   {
       if (check2 == null) {
            return false;
        }

        if (getClass() != check2.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) check2;

        if (this.regCode != compared.getregCode()) {
            return false;
        }

        if (this.country == null || !this.country.equals(compared.getcountry())) {
            return false;
        }
        return true;
       
   }
   
    public int hashCode() {
        if (this.regCode == null) {
            return 13;
        }

        return this.country.hashCode() + this.regCode.hashCode();
    }
    
   

   

}