package streamDemo;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFromArray {
	
	public static void main(String[] args) {
		 // Get the array 
        String[] arr = new String[] { "a", "b", "c" };
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(System.out::println);
	}

}
