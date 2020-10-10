package java8DateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Java8TimeZone {
	
	public static void main(String[] args) {
		
		
		    
		    ZonedDateTime currentZone = ZonedDateTime.now();  
		    System.out.println("the current zone is "+ currentZone.getZone());  
		  
		    
		
		 ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		 ZoneId america =ZoneId.of("America/Chicago");
		 
		 ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(america);
		 
		 System.out.println("tokyo time zone is " + tokyoZone);
		
		DateTimeFormatter format =
		DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
		
		String formatedDateTime = tokyoZone.format(format);
		System.out.println("formatted chicago time zone "+ formatedDateTime); 
		
		    
		    
		
	}
	
}
