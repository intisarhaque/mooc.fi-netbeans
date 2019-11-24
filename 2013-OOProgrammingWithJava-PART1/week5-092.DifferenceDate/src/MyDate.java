public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    /*public int differenceInYears(MyDate compared)
    {
        int days = 0;
        MyDate cloneofThis1 = new MyDate(this.day, this.month, this.year);
        MyDate compared1 = new MyDate(compared.day, compared.month, compared.year);
        while (true)
        {
            
            if (cloneofThis1.year==compared1.year && cloneofThis1.month == compared1.month && cloneofThis1.day== compared1.day)
            {
                
                break;
            }
            else 
            {
                cloneofThis1.advance();
                days +=1;
                
                
            }
            if (days>1000)
            {
                days = 0;
                while (true)
                {
                    if (compared.year==this.year && compared.month == this.month && compared.day== this.day)
                    {
                        break;
                    }
                    else 
                    {

                        compared.advance();
                        
                        days +=1;

                    }
                }
                break;
                
                
            }
        }    
        return days/360;
        
    }*/
    private static final int YEAR_IN_DAYS = 365;
    private static final int BASE_YEAR = 1900; 

    public int differenceInYears(MyDate comparedDate)
        {
            return Math.abs(this.numberOfDays() - comparedDate.numberOfDays()) /YEAR_IN_DAYS;

        }

        public int numberOfDays()
        {
            int noOfDays = day;
            if (month >1)
            {
                noOfDays += 30* (month-1);
            }

            noOfDays += ((year-1-BASE_YEAR) * YEAR_IN_DAYS);

            return noOfDays;
        }
    
    
    
    
   
    public void advance()
    {
        if (this.day<30)
        {
            this.day+=1;
        }
        else 
        {
            if (this.month<12)
            {
               this.month +=1;
               this.day=1;
            }
            else
            {
                this.year+=1;
                this.month=1;
                this.day=1;
            }
                
        }
        
    }

}

