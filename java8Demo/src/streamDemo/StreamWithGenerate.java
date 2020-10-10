package streamDemo;

import java.util.function.Supplier;
import java.util.stream.Stream;

class MyClass{
	public static int myMetod() {
		return 0;
	}
}
public class StreamWithGenerate {

	

	
public static void main(String[] args) { 

	        int limitTerms = 5; 
	        
	        Supplier<Integer> supplier= MyClass::myMetod;
			Stream.generate(supplier) 
            .limit(limitTerms)
            .forEach(System.out::println);
	        
	    } 
} 


