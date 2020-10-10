package streamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFromPattern {
	
		public static void main(String[] args) { 

			String string = "Hello1World2From3GeekeyLearner";
	        Stream<String> stream = Pattern.compile("\\d").splitAsStream(string);
	        System.out.println(stream);
	        List<String> list = stream.collect(Collectors.toList());
	        
	        System.out.println(list);
		} 
	} 



