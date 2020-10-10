package streamDemo;

import java.util.stream.Stream;

public class StreamUsingBuilder {

	// Java program to create Stream from Collections

	public static void main(String[] args) {

		Stream.Builder<String> builder = Stream.builder();
		builder.add("a");
		builder.add("b");
		builder.add("c");
		Stream<String> stream = builder.build();
		stream.forEach(System.out::println);
	}
}
