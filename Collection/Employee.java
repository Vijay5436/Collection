package Collection;

import java.util.Scanner;
import java.util.TreeSet;

public class Employee {
	public static void main(String args[])
	{
		int n,i;
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		TreeSet<Employee1> hashset = new TreeSet<Employee1>();//creating tree hashset object
		Employee1[] emp = new Employee1[n];
		for(i=0;i<n;i++)
		{
			name = sc.next();
			age = sc.nextInt();
			emp[i] = new Employee1();
			emp[i].setAge(age);
			emp[i].setName(name);
			hashset.add(emp[i]);
		}
		for(Employee1 e:hashset)
		{
			System.out.println(e.getName()+" "+e.getAge());
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
