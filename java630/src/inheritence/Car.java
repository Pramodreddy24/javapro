package inheritence;

public class Car {
	public String color="monolithic";
	public void  move()
	{
		System.out.println("car helps to move ");
		
	}
	public void horn()
	{
		System.out.println("car can horn"); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.move();
		car.horn();

	}

}
