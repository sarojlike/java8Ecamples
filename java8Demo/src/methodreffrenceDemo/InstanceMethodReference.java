package methodreffrenceDemo;

interface Sayable1{  
    void say(int i);  
}  

public class InstanceMethodReference {  
   
	public void saySomething(int i){  
        System.out.println("Hello, this is non-static method.");  
    }  
   
	public static void main(String[] args) {  
       
		InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating object  
        // Referring non-static method using reference  
        Sayable1 sayable = methodReference::saySomething;  
        // Calling interface method  
            sayable.say(10);  
            // Referring non-static method using anonymous object  
            Sayable1 sayable2 = new InstanceMethodReference()::saySomething; // You can use anonymous object also  
            // Calling interface method  
            sayable2.say(20);  
    }

	 
}  