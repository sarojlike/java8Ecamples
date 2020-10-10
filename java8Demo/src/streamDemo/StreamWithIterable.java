package streamDemo;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamWithIterable {
	
	public static void main(String[] args) {
		Iterable<String> iterable = Arrays.asList("a", "b", "c"); 
		Stream<String> stream = StreamSupport.stream(iterable.spliterator(),false); 
		stream.forEach(System.out::println);
	}

}
