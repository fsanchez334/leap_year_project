/**
*
* This class represents a calendar year. It contains 
* a method that determines if the year is a leap year.
* 
*/

public class Year{
    
private boolean LeapYear;
private int year;
  
    public Year(int y){      
      year = y;
    }

    public boolean isLeapYear()
    {
         if(year % 4 == 0 && year % 100 !=0)
         { 
           return LeapYear=true;
         } 
           else
           {
             return LeapYear=false;
           }
    
   }  
}
