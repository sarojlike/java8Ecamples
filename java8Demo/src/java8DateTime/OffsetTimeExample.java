package java8DateTime;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class OffsetTimeExample {
	
	public static void main(String[] args) {
		
	    // Current date time with an offset
	      OffsetDateTime dateTime = OffsetDateTime.now();
	      System.out.println(dateTime);

	      // Current date time from specified clock with an offset
	      OffsetDateTime dateTime2 = OffsetDateTime.now(Clock.systemDefaultZone());
	      System.out.println(dateTime2);

	      // Current date time from specified time-zone with an offset
	      OffsetDateTime dateTime3 = OffsetDateTime.now(ZoneId.systemDefault());
	      System.out.println(dateTime3);

	      // Specific date time from LocalDateTime with an offset
	      OffsetDateTime dateTime4 = OffsetDateTime.of(LocalDateTime.of(2017, 05, 12, 05, 45),
	            ZoneOffset.ofHoursMinutes(-5, 00));
	      System.out.println(dateTime4);
	      
	      
	      OffsetDateTime chcagotime = OffsetDateTime.of(LocalDateTime.now(),ZoneOffset.ofHoursMinutes(-5,00));
	      
	      System.out.println("chcagotime "+chcagotime);
	      
		
	}
	
}
