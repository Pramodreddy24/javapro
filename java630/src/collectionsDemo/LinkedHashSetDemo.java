package collectionsDemo;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {


	
		LinkedHashSet<Integer> arrayList=new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> arrayList1=new LinkedHashSet<Integer>();
	public void addData()
	{
		arrayList.add(10);
		arrayList.add(40);
		arrayList.add(20);
		
		arrayList.add(20);
		arrayList1.add(30);

	}
	
	public void forEach()
	{
		for(Integer lcv:arrayList)
			System.out.println(lcv);
	}
	public void deleteData() {
		arrayList.remove(0);
	}
	public void moreMethods()
	{
		System.out.println(arrayList.containsAll(arrayList1));
		arrayList.addAll(arrayList1);
	System.out.println(arrayList.containsAll(arrayList1));
	arrayList.removeAll(arrayList1);
	System.out.println(arrayList.containsAll(arrayList1));
	}
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			LinkedHashSetDemo arrayListDemo=new LinkedHashSetDemo();
			arrayListDemo.addData();
			arrayListDemo.forEach();
	/*System.out.println("------------");
	arrayListDemo.deleteData();
	arrayListDemo.forEach();
	arrayListDemo.moreMethods();
		}
*/
	}

	

	





	}


