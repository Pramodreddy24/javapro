package corejava;

public class DataTypes {
byte byteVar=101;
short shortVar=10;
int intVar=201;
//2 power -32 to 2 power 32
// 2 power -64 to 2 power 64
long longVar=63637;
//precision of 6
float floatVar=10.4556F;
//precision might be 15
double doubleVar=10.7766777777;
char charVar='x';
boolean booleanVar=true;

String name="java";

//to create method in java
public void myMethod()
{
	System.out.println(byteVar);
	System.out.println(shortVar);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 DataTypes dataTypes=new DataTypes();//creating object syntax
 //dot operator is used to access the given variables
 System.out.println(dataTypes.name);
 dataTypes.myMethod();
 
 
	}

}
