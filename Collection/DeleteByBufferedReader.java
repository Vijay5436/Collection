package Collection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class DeleteByBufferedReader {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		TreeMap<String,Integer> map = new TreeMap<String,Integer>();
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			String s=br.readLine();
			int k=Integer.parseInt(br.readLine());
			map.put(s,k);
		}
		System.out.println(map);
		
	}

}

