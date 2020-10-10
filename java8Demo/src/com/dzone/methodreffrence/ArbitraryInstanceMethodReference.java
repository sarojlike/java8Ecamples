package com.dzone.methodreffrence;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


class Person {
	
    private String name;
   
    public Person(final String name) {
        this.name = name;
    }
    public void printName() {
        System.out.println(name);
    }
}


public class ArbitraryInstanceMethodReference {
	
	
	public static void main(String args[]) {
        final List<Person> people = Arrays.asList(new Person("dan"), new Person("laura"));
        Consumer<? super Person> action=Person::printName;
		// Method reference
        people.forEach(action);
        people.forEach(Person::printName);
        // Lambda expression
        people.forEach(person -> person.printName());
        // normal
        for (final Person person : people) {
            person.printName();
        }
    }
     
}
