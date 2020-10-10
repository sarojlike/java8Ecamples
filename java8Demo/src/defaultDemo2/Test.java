package defaultDemo2;

import defaultDemo.DefautMethodDemoWithDimondProblem;
import defaultDemo.testInterface1;

public class Test extends DefautMethodDemoWithDimondProblem implements testInterface1 {
	
	public static void showView2() {
		System.out.println("static inside class");
	}
	
	public static void main(String[] args) {
		new Test().showView();
		testInterface1.showView2();
		testInterface1 var =new Test();
		//var.showView2();
		//new Test().showView2();
		DefautMethodDemoWithDimondProblem.showViewStatic();
		
	}

	@Override
	public void testAgain() {
		
		
	}

}
