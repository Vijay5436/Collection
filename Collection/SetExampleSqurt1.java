package Collection;
import java.util.*;
public class SetExampleSqurt1 {

public static void main(String args[])
{
Scanner s=new Scanner(System.in);
HashSet<Integer>a=new HashSet<Integer>();
HashSet<Integer> b=new HashSet<Integer>();
//System.out.println("Is PopularCities set Empty ? : "+l1.isEmpty());
int n=s.nextInt();
for(int i=0;i<n;i++)
{
a.add(s.nextInt());
}
System.out.println("Number : "+a);
a.remove(10);
System.out.println("After Remove : "+a);
for(int x:a)
{
double sr = Math.sqrt(x);
if(sr - Math.floor(sr) == 0)
{
b.add(x);
}
}
a.removeAll(b);
System.out.println("After removeAll perfect squares: "+a);
a.clear();
System.out.println("After Clear() : "+a);
        }
}

