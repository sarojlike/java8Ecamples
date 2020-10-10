package com.dzone.methodreffrence;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	
	public static void main(String[] args) {
		
		final List<Integer> list = Arrays.asList(3,1, 2, 4, 5, 6, 7,9,8, 10);
		
		Comparator comparator =new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				 return a.compareTo(b);
			}
		};
		
		Collections.sort(list,comparator);
		
		System.out.println(list);
		
	}

}
