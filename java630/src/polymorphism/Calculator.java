
	package polymorphism;

public class Calculator 
{
	int a=10;
	public void add()
	{
	System.out.println(10+20);
}
	public void add(int a,int b)
	{
	System.out.println(a+b);
	}
	public void add(float a,int b)
	{
	System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Calculator calculator =new Calculator();
	calculator.add();
	calculator.add(56F,87);
	calculator.add(2,3);

	}
}



