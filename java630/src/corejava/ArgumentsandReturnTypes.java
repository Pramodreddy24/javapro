package corejava;

public class ArgumentsandReturnTypes {
	int a=20, b=20;
	public void add(int a ,int b) {
		System .out.println(a+b);
	}
	public int sum(int a,int b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgumentsandReturnTypes argumentsandReturnTypes=new ArgumentsandReturnTypes();
argumentsandReturnTypes.add(42,56);
argumentsandReturnTypes.add(98,980);

int sumVar=argumentsandReturnTypes.sum(2,6);
System.out.println(sumVar);
	}

}
