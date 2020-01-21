package Collection;

import java.util.Scanner;
import java.util.*;
import java.util.Map.Entry;

public class EmployeeMapExample1 {
	public static void main(String args[])
	{
		int n,i;
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		HashMap<Integer ,Employee1> hashmap = new HashMap<Integer ,Employee1>();//creating tree hashset object
		Employee1[] emp = new Employee1[n];
		for(i=0;i<n;i++)
		{
			name = sc.next();
			age = sc.nextInt();
			emp[i] = new Employee1();
			emp[i].setAge(age);
			emp[i].setName(name);
			hashmap.put(i,emp[i]);
		}
		for(Entry<Integer , Employee1> entry : hashmap.entrySet())
		{
			System.out.println(entry.getKey()+" "+Employee1.getName()));
			sc.close();
		}
	}

}



 class Employee1 implements Comparable<Employee1>
 {
	 private String name;
	 private int age;
	 public String getName()
	 {
		 return name;
		 
	 }
	 public void setName(String name)
	 {
		 this.name = name;
		 
	 }
	 public int getAge()
	 {
		 return age;
	 }
	 public void setAge(int age)
	 {
		 this.age = age;
	 }
	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		//if(age>o.getAge())
		{
			return 1;
		}
	}
}
 abstract class xy
 {
	 abstract sum(int x,int y)
	 {}
 }
 
