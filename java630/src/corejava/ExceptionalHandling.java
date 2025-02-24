package corejava;

public class ExceptionalHandling {
	public void demoException() {
		try {
		int a =10/10;
		String demo=null;
		demo.toCharArray();
		}
		catch(ArithmeticException ar) 
		{
			System.out.println("exception handled");
		
	
	}
	       catch(ClassCastException sq) {
	
		System.out.println("ClassCast exception sql");
	}
	catch(Exception e)
	{
	System.out.println("root");
}
	finally {
		System.out.println("i will always excute");
	}
		System.out.println("after exception");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ExceptionalHandling exceptionHandling=new ExceptionalHandling();
exceptionHandling.demoException();
}
}