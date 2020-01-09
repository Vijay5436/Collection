package main2;

import java.util.*;

public class MarkList {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<Integer> mark = new ArrayList<Integer>();
		for(int i=0;i<n;i++) 
		{
			mark.add(s.nextInt());
			
		}
		System.out.println(mark);
		Collections.sort(mark);
		System.out.println(mark);
		
	}
	

}
