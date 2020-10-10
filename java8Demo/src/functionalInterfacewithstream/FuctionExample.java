package functionalInterfacewithstream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FuctionExample {
	
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
		
		Function <String,String> convertToUpperCase= String :: toUpperCase;
		Function <String,String> before =s->s.concat(" hello ");
		Function <String,String> result =t->before.apply(t);
		
		
		list.stream().map(convertToUpperCase.compose(result)).forEach(System.out::println);
		
		
	}

}
