package inheritence;
public class Audi extends Car{
	public String color="metalic";
	public void transmissionmode() {
		System.out.println("Audi has both manual automatic");
	
	System.out.println(super.color);
	System.out.println(this.color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi audi=new Audi();
		audi.transmissionmode();
		audi.move();
		audi.horn();
	}

}
