package main2;
import java.util.*;
public class LinkedListExample1 {
	public static void main(String args[])
	{ List obj = new LinkedList();
	obj.add("Competition");
	obj.add("Be positive");
	obj.add("Happy Day");
	Iterator  i=obj.iterator();
	while(i.hasNext())
	{
	
 System.out.println(i.next());
	}
	}
}
