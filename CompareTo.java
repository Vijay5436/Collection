package Comparable;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CompareTo
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of employee");
int n=s.nextInt();
Set<Employee> emp=new TreeSet<Employee>();
Employee e[]=new Employee[n];
for(int i=0;i<n;i++)
{
e[i]=new Employee();
e[i].setName(); 
e[i].setEmpid();
emp.add(e[i]);
}
for(int i=0;i<n;i++) 
{
System.out.println(	e[i].getName());
System.out.println(e[i].getEmpid());
}
}
}
 class Employee implements Comparable<Employee>
 {
Scanner s=new Scanner(System.in); 
private String name;
private long empid;
public void setName()
{
System.out.println("Enter the name");
this.name=s.next();
}
public void setEmpid()
{
System.out.println("Enter the id");
this.empid=s.nextLong();	 
}
public String getName()
{
return name;
}
public long getEmpid()
{
return empid;
}

public int compareTo(Employee o) {
     if(empid>o.getEmpid())
    	 
     {
    	return 1; 
     }
     else if(empid<o.getEmpid())
     {
    	 return -1;
    	 
     }
     else
     {
    	 return 0;
     }
}
 }