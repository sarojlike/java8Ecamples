package defaultDemo2;

@FunctionalInterface
public interface MyInterface {

	public void firstInterface();
	//public void firstInterface2();
	
	default void showView() {
		System.out.println("showing the view");
	}
	
	 static void showView2(){
			System.out.println("showing the view2");
		}
}
