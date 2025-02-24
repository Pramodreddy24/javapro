package inheritence;

public class Benz extends Car{

		public void transmissionmode() {
			System.out.println("Benz has only automatic");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Benz audi=new Benz();
			audi.transmissionmode();
			audi.move();
			audi.horn();
		}
}
