package corejava;

public class DecisionMakingStatements {
	int a=1;
	public void ifStatement()
	{
		if(a==1)
		System.out.println("composite number");
		else if(a%2==0)
		{
		System.out.println("even number");
	}
	
	else
		{
			System.out.println("odd number");
		}
}
public void switchDemo() {
	switch(a)
	{
	case 1:System.out.println("jan");
	break;
	case 2:System.out.println("feb");
	break;
	case 3:System.out.println("mar");
	break;
	default:System.out.println("invalid");
	
	
	}
}
	public void switchDemoDifferentDataType() {
	String name="feb";
	{
		switch(name)
		{
			case "jan":System.out.println("1st month");
			break;
			case "feb":System.out.println("2nd month");
			break;
			case "mar":System.out.println("3rd month");
			break;
			case "apr":System.out.println("4th month");
			break;
			case "may":System.out.println("5th month");
			break;
			case "jun":System.out.println("6th month");
			break;
			default:System.out.println("invalid month");

		}}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecisionMakingStatements decesionMakingStatements=new DecisionMakingStatements();
		//decesionMakingStatements.ifStatement();
		decesionMakingStatements.switchDemoDifferentDataType();
		

	}

}
