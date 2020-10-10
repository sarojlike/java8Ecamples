package streamDemo;
// Java program to create Stream from values 

import java.util.*; 
import java.util.stream.Stream; 

class User{
	private String name;
	private Date dob;
	
	
	public User(String name, Date dob) {
		
		this.name = name;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", dob=" + dob + "]";
	}
	
	
}



public class GFG { 
	public static void main(String[] args) { 
		User user1 = new User("saroj", new Date());
		User user2 = new User("pratik", new Date());
		User user3 = new User("pratik chutiya", new Date());
		Stream<Integer> stream = Stream.of(1,2,3, 4,5, 6,7, 8,9);
		Stream<User> straeam2 = Stream.of(user1,user2,user3);
		
		straeam2.forEach(p -> System.out.print(p)); 
		 
	} 
} 
