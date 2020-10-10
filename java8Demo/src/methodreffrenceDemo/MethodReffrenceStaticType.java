package methodreffrenceDemo;

interface Sayable{  
    void say();  
}  
public class MethodReffrenceStaticType {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = MethodReffrenceStaticType::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}  