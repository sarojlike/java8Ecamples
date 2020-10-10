package methodreffrenceDemo;

interface SayableDemo{
	public String sayHello(String s);
}

class SayHelloImpl{
	public String sayHelloAgain(String s) {
		return "Hello "+s;
	}
}

public class MthodReffrenceOfParticularObject {
	public static void main(String[] args) {
		
		SayHelloImpl sayHelloImpl = new SayHelloImpl();
		SayableDemo d=sayHelloImpl::sayHelloAgain;
		System.out.println(d.sayHello("saroj"));
	}
	
}
