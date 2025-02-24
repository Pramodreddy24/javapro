package corejava;

public class Variablewscope {
	int classVarInstanceVar=10;
	static int StatVar=100;
	
	public void LocalDemo() {
		int LocalVar=25;
		System.out.println(LocalVar);
		
	}
	public void add() {
		++classVarInstanceVar;
		System.out.println(classVarInstanceVar);
		++StatVar;
		System.out.println(StatVar);
	}

 
	
			public static void main(String[] args) {
				// TODO Auto-generated method stub
			System.out.println(Variablewscope.StatVar);
				Variablewscope variablewscope1=new Variablewscope();
				variablewscope1.add();
				variablewscope1.add();
				Variablewscope variablewscope2=new Variablewscope();
				variablewscope2.add();
			}
			}
			