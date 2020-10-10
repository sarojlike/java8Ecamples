package defaultDemo;

public interface testInterface1 {
	default void showView() {
		System.out.println("showing the view");
	}
	
	 static void showView2(){
		System.out.println("showing the view2");
	}
	
	public void testAgain();
}
