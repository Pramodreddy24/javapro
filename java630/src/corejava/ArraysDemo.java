package corejava;

public class ArraysDemo {
	int[]marks=new int[6];
	int[]marks1= {100,95,80,74,32,88};
	public void setData() {
		marks[0]=10;
		marks[1]=20;
	}
public void readData() {
	System.out.println(marks1[5]);
	for(int i=0;i<marks1.length;++i){
		
	System.out.println(marks1[i]);}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArraysDemo arraysDemo=new ArraysDemo();
arraysDemo.readData();
	}

}
