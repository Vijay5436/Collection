package main2;
import java.util.*;
public class LinkedListExample2 {
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		List <String>obj = new LinkedList<String>();
		for(int i=0;i<n;i++)
		{
			obj.add(s.next());
		}
		ArrayList<String> dp =new ArrayList<String>();
		
		int m= s.nextInt();
		for(int i=0;i<m;i++)
		{
			dp.add(s.next());
		}
		System.out.println("Actual LinkedList: "+obj);
		obj.addAll(dp);
		System.out.println("After copy: "+obj);
	}

}
