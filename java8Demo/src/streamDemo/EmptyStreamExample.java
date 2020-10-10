package streamDemo;

import java.util.Iterator;
import java.util.stream.Stream;

public class EmptyStreamExample {

	public static void main(String[] args) {
		Stream<String> streamOfArray 
        = Stream.empty(); 

    
    Iterator<String> it 
        = streamOfArray.iterator(); 

    // Iterate stream object 
    while (it.hasNext()) { 
        System.out.print(it.next() + " "); 
    } 
	}
	
}
