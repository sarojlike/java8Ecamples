package functionalInterfacewithstream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

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
		
		Consumer<String> c1= System.out::println;
		
		list.stream().forEach(c1);
		
		
	}
	
}
