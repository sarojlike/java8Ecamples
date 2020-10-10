package com.dzone.methodreffrence;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ParticularInstanceMethodReference {
	
	 public static void main(String args[]) {
	        final List<Integer> list = Arrays.asList(3,1, 2, 4, 5, 6, 7,9,8, 10);
	        final MyComparator myComparator = new MyComparator();
	        // Method reference
	        Collections.sort(list, myComparator::compareme);
	        // Lambda expression
	        Collections.sort(list, (a,b) -> myComparator.compareme(a,b));
	        System.out.println(list);
	    }
	    private static class MyComparator {
	        public int compareme(final Integer a, final Integer b) {
	            return b.compareTo(a);
	        }
	    }
	

}
