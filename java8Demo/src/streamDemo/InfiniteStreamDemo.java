package streamDemo;

import java.util.stream.Stream;

class HelloDemo{
	public String sayName(String s) {
		return s;
	}
}

public class InfiniteStreamDemo {

		public static void main(String[] args) { 

			int seedValue = 1; 
			int limitTerms = 5; 

			 Stream.iterate("pratik",new HelloDemo()::sayName) 
				 .limit(limitTerms) 
			.forEach(System.out::println);
			
		} 
		
		
	} 



