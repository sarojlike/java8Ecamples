package java8DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemproralAdjusterExample {
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.now(); 
        System.out.println("the current date is "+date); 
  
        // to get the first day of next month 
        LocalDate dayOfNextMonth =date.with(TemporalAdjusters.firstDayOfNextMonth()); 
      
        System.out.println("firstDayOfNextMonth : " +dayOfNextMonth );
        
        LocalDate nextSaturday =  date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY)); 
          
        System.out.println("next satuday from now is "+ nextSaturday); 
        
        
        LocalDate lastDay =  
                date.with(TemporalAdjusters.lastDayOfMonth()); 
        
      System.out.println("lastDayOfMonth : " +  
                          lastDay);
        
	}

}
