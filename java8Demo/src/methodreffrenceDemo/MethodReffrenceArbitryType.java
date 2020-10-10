package methodreffrenceDemo;

interface Sayable3{  
    void say(String str);  
}  
public class MethodReffrenceArbitryType {  
    
    public static void main(String[] args) {  
         
    	Sayable3 sayable = System.out::println;  
        
        sayable.say("hello prem pratik");  
    }  
}  