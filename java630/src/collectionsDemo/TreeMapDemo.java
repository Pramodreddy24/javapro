package collectionsDemo;
	
	
	import java.util.Map;
import java.util.TreeMap;

	public class TreeMapDemo {


			TreeMap<Integer,String>map=new TreeMap<Integer,String>();
			public void addData()
		{
			map.put(1, "java");
			map.put(2, "python");
			map.put(4, "Ruby");
			map.put(3, "C sharp");
			map.put(3, "C sharp1");
			//map.put(null,null);
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
		TreeMapDemo TreeMapDemo=new TreeMapDemo();
		TreeMapDemo.addData();
		TreeMapDemo.readData();
			}

		
		

	

	}


