package Collection;

import java.util.*;

public class CollectionHashSetExample1 {
	public static void main(String args[])
	{
		Set<Integer> a = new HashSet<Integer>();
		a.add(new Integer(1));
		a.add(new Integer(3));
		a.add(new Integer(4));
		a.add(new Integer(6));
		a.add(new Integer(19));
		System.out.println(a);
		Set<Integer> b = new HashSet<Integer>();
		b.add(new Integer(7));
		b.add(new Integer(8));
		b.add(new Integer(11));
		b.add(new Integer(3));
		b.add(new Integer(1));
		System.out.println(b);
		Set<Integer> Union = new HashSet<Integer>(a);
		Union.addAll(b);
		System.out.println("Union of two sets ; "+Union);
		Set<Integer> Intersectin = new HashSet<Integer>(a);
		
		Intersectin.retainAll(b);
		System.out.println("Intersectin of two sets ; "+Intersectin);
		
		Set<Integer> Sym = new HashSet<Integer>(a);
		Sym.removeAll(b);
		
		System.out.println("Symmetric Differance of two sets ; "+Sym);
		Sym.removeAll(a);
		
		System.out.println(Sym);
		Sym.clear();
		System.out.println(Sym);
	}

}
