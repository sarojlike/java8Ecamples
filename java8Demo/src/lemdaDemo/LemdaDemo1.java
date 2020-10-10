package lemdaDemo;

@FunctionalInterface
interface MessageInterface{
     
    public void sayHello();
     
}


@FunctionalInterface
interface Messageinterface2{
    public void sayHello(String personname);
}

@FunctionalInterface
interface Messageinterface3{
    public void sayHello(String personname1,String personname2);
}


@FunctionalInterface
interface Messageinterface4 {
 
    public String sayHello(String personname1, String personname2);
}
 

@FunctionalInterface
interface Messageinterface5 {
 
    public String sayHello(String personname1, String personname2);
}


public class LemdaDemo1 {
	public LemdaDemo1() {
		System.out.println("inside constructor");
	}
	public static void main(String[] args) {
		MessageInterface message = ()-> System.out.println("Hello world by lambda ");
		message.sayHello();
		
		Messageinterface2 messageinterface2=(p1)->{
			System.out.println("Hello world by lambda to "+p1);
			System.out.println("Hello world by lambda again "+p1);
		};
		messageinterface2.sayHello("saroj");
	}
	 

}
