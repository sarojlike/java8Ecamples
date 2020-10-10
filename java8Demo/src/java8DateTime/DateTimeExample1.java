package java8DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeExample1 {

	public static void main(String[] args) {

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");

		LocalDate date = LocalDate.now();
		// String format2 = date.format(format);
		// System.out.println("the current date is "+format2);

		// LocalTime time = LocalTime.now();
		// System.out.println("the current time is "+ time);

		LocalDateTime current = LocalDateTime.now();
		// System.out.println("current date and time : "+ current);

		String formatedDateTime = current.format(format);
		System.out.println("in foramatted manner " + formatedDateTime);

		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int minute = current.getMinute();
		int seconds = current.getSecond();
		System.out.println("Month : " + month + " day : " + day + " minute :" + minute + " seconds : " + seconds);

		LocalDate date2 = LocalDate.of(1947, 8, 15);
		int dayOfMonth = date2.getDayOfMonth();
		DayOfWeek dayOfWeek = date2.getDayOfWeek();
		System.out.println("the repulic day :" + date2);
		System.out.println("the dayOfWeek :" + dayOfWeek);

		LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);

		System.out.println("specfic date with " + "current time : " + specificDate);

	}

}
