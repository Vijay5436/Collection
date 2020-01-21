package Collection;

import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map.Entry;

public class MapContainsExample1 {
	public static void main(String args[])
	{
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Amit");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		System.out.println(map);
		System.out.println("Rahul is present : "+map.containsValue("Rahul"));
		System.out.println("map containbs the key 6 : "+map.containsKey(6));
		
		if(map.containsKey(5))
		{
			System.out.println("map contains the key 5");
		}
		if(map.containsValue("Amit"))
		{
			System.out.println("map contains Amit");
		}
	}

	

}
