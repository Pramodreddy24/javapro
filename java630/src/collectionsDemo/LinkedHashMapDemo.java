package collectionsDemo;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {


		LinkedHashMap<Integer,String>map=new LinkedHashMap<Integer,String>();
		public void addData()
	{
		map.put(1, "java");
		map.put(2, "python");
		map.put(4, "Ruby");
		map.put(3, "C sharp");
		map.put(3, "C sharp1");
		map.put(null,null);
	}
		public void readData()
		{
		for (Map.Entry<Integer,String>mp : map.entrySet())
		{
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		System.out.println(map.get(1));
		System.out.println(map.containsKey(4));
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	LinkedHashMapDemo linkedhashMapDemo=new LinkedHashMapDemo();
	linkedhashMapDemo.addData();
	linkedhashMapDemo.readData();
		}

	
	

}
