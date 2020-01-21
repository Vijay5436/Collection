package Collection;

import java.util.*;

public class CollectionHashSetExample2 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		HashSet<String> Hs = new HashSet<String>();
		System.out.println("Is popularCities set emty? : "+Hs.isEmpty());
		int n = s.nextInt();
		for( int i=0;i<n;i++)
		{
			Hs.add(s.next());
		}
		System.out.println("Number of cities in the HashSet "+Hs.size());
		if(Hs.contains("Paris"))
		{
			System.out.println("Paris is in the popular cities set.");
		}
		
	}

}
