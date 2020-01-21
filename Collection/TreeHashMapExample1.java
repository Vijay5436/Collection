package Collection;
import java.util.*;
import java.util.Map.Entry;
public class TreeHashMapExample1 
{
	public static void main(String args[])
	{
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(1, "Amit");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		System.out.println(map);
		
		for(Entry<Integer, String> entry : map.entrySet()) {
			  Integer key = entry.getKey();
			  String value = entry.getValue();

			  System.out.println(key + " " + value);
		}
	}

}
