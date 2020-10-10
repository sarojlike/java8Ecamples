package functionalInterfacewithstream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abhisekh");
		list.add("abhilash");
		list.add("aman");
		list.add("binodh");
		list.add("binodh");
		list.add("binodh");
		list.add("bimal");
		list.add("boka");
		
		
		/*
		 * Predicate<? super String> predicate=s->s.startsWith("a"); 
		 * Predicate<? super String> predicate2=s->s.startsWith("b");
		 */
		Predicate<String> p1=s->s.startsWith("a");
		Predicate<String> p2=s->s.endsWith("h");
		Predicate<String> p3=s->s.length()>4;
		
		/*list
		.stream()
		.filter(p1.or(p2))
		.forEach(System.out::println);*/
		
		/*list
		.stream().filter(p1.and(p3))
		.forEach(System.out::println);*/
		
		/*list
		.stream().filter(p1.negate())
		.forEach(System.out::println);*/
		
		list
		.stream().filter(Predicate.isEqual("abhisekh")).forEach(System.out::println);
	}
}
