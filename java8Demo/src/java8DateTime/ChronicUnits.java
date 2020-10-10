package java8DateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronicUnits {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now(); 
        System.out.println("current date is :" +date); 
      
        // adding 2 years to the current date 
        LocalDate year = date.plus(2, ChronoUnit.DECADES); 
        System.out.println("next to next year is " +year);
        
	}
}
