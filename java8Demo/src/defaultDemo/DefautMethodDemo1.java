package defaultDemo;

interface  Display{
	default void showView() {
		System.out.println("showing the view");
	}
	
	//protected void sayHello();
}


public class DefautMethodDemo1 implements Display{
	
	public void showView() {
		System.out.println("testing ");
	}
	
	public static void main(String[] args) {
		DefautMethodDemo1 defautMethodDemo1 = new DefautMethodDemo1();
		defautMethodDemo1.showView();
	}

}
