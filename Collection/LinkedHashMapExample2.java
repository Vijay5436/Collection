package Collection;

import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapExample2 
{	
	public static void main(String args[])
  {
	LinkedHashMap<String ,Integer> map = new LinkedHashMap<String ,Integer>();
	map.put("One" ,1);
	map.put("Two" ,2);
	map.put("Three" ,3);
	map.put("Four" ,4);
	System.out.println(map);
	
	for(Entry<String, Integer> entry : map.entrySet()) {
		  String key = entry.getKey();
		  Integer value = entry.getValue();

		  System.out.println(key + " " + value);
	}
	
}
	

}
