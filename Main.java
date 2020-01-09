package main2;
import java.util.*;
public class Main {
	
	public static void main(String args[])
	{
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		Contact firstContact = new Contact("tim", "181888424");
		Contact secondContact = new Contact("john","7558808990");
		contacts.add(firstContact);
		contacts.add(secondContact);
		
		for(int i=0; i<contacts.size();i++)
		{
			System.out.println(contacts.get(i).getName());
			System.out.println(contacts.get(i).getphoneNumber());
		}
		
		
		
	}

}
class Contact 
{
	private String name;
	private String phoneNumber;
	public Contact(String name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber=phoneNumber;
		
	}
	public String getName()
	{
		return(name);
	}
	public String getphoneNumber() {
		return(phoneNumber);
	}

}