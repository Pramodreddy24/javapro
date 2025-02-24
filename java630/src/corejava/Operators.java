package corejava;

public class Operators {
	int a=12,b=32;
	public void arithematicOperators()
	{
		int c=a+b;
		System.out.println("addition operator value is"+c);
		 c=a-b;
		System.out.println("substraction operator value is"+c);
		 c=a*b;
		System.out.println("multiplication operator value is"+c);
		 c=a/b;
		System.out.println("division operator value is"+c);
		 c=a%b;
		System.out.println("modulus operator value is"+c);
		 ++a;
		System.out.println("increment operator value is"+a);
		--b;
		System.out.println("decrement operator value is"+b);
	}
	public void assignmentOperators() {
	

		System.out.println(a);
		++a;
		System.out.println(a);
		a+=10;
		System.out.println(a);
		a=a+10;
		System.out.println(a);
		a-=10;
		System.out.println(a);
		a*=10;
		System.out.println(a);

		
	}
	public void relationalOperators()
	{
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
	}
	public void logicalOperators() {
		boolean val=true;
		val=a>b &&a>15;
		System.out.println(val);
		val=a>b &&a>15;
		System.out.println(val);
		val=a>b &&a<15;
		System.out.println(val);
		val=a>b &&a>15;
		System.out.println(val);
		
		val=a<b ||a>b;
		System.out.println(val);
		System.out.println(!val);
	}
	public void conditionalOperator() {
		int c=a>b?100:50;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Operators operators=new Operators();
     //operators.arithematicOperators();
   // operators.assignmentOperators();
    // operators.relationalOperators();
    // operators.logicalOperators();
     operators.conditionalOperator();
     
	}

}
