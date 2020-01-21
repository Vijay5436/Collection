package Collection;

import java.util.*;

public class CollectionHashSetExample 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		ArrayList <Integer> l1 = new ArrayList<Integer>();//creating array list
		int n =s.nextInt();
		for(int i=0;i<n;i++)//Taking values from User 
		{
			l1.add(s.nextInt());
		}
		
		HashSet Hs = new HashSet();
		Hs.addAll(l1);//adding elements to Hashset
		System.out.println("Shuffled Order : "+Hs);
		LinkedHashSet<Integer> Ls = new LinkedHashSet<Integer>();
		Ls.addAll(l1);//adding elements to LinkedHashSet
		System.out.println("Order in input form : "+Ls);
		TreeSet Ts = new TreeSet();
		Ts.addAll(l1);//adding elements to TreeSet
		
		System.out.println("Ascending Order : "+Ts);
	}

}
