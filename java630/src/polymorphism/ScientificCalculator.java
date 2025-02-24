package polymorphism;

public class ScientificCalculator extends Calculator{
public void add()
{
	System.out.println(30+40);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScientificCalculator sc=new ScientificCalculator();
		sc.add();
		Calculator calc=new ScientificCalculator();
		calc.add();
	}
	

}
