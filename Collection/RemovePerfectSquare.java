package Collection;

import java.util.*;
import java.lang.Math;

public class RemovePerfectSquare {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		HashSet<Double> Hs = new HashSet<Double>();
		for(int i=0;i<n;i++)
		{
			Hs.add(s.nextDouble());
		}
		System.out.println("numbers : "+Hs);
		Hs.remove(10.0d);
		System.out.println("After remove(10) : "+Hs);
		Iterator<Double>  I=Hs.iterator();
		ArrayList<Integer> hs = new ArrayList<Integer>();
		for(int i=0;i<Hs.size();i++)
		{
			double a =(Math.sqrt(I.next()));
			int b = a;
		}
		System.out.println(hs);
		Set<Double> Sym = new HashSet<Double>(Hs);
		Sym.removeAll(hs);
		
		System.out.println("After removeAll(perfectSquares) : "+Sym);
		
	}

}
