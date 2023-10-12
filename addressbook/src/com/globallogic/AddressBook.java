package com.globallogic;

import java.util.ArrayList;
import java.util.List;

import com.globallogic.Exceptions.NameException;

public class AddressBook {
	List<Contact> list=new ArrayList<Contact>();
	public static void main(String[] args) 
	{
      
		AddressBook add=new AddressBook();
		
		
		PhoneNumber phone1=new PhoneNumber("Work","9748171444");
		PhoneNumber phone2=new PhoneNumber("Home","9848171444");
		List<PhoneNumber> list1=new ArrayList<>();
		list1.add(phone1);
		list1.add(phone2);
		Address address1=new Address("Work","Bangalore");
		Address address2=new Address("Residential","Kolkata");
		List<Address> list2= new ArrayList<>();
		list2.add(address1);
		list2.add(address2);
		Contact contact1=new Contact("Rajiv","Globallogic",list1,list2);
		
		
		
		PhoneNumber phone11=new PhoneNumber("Work","9748171444");
		PhoneNumber phone12=new PhoneNumber("Home","9848171444");
		List<PhoneNumber> list11=new ArrayList<>();
		list11.add(phone11);
		list11.add(phone12);
		Address address11=new Address("Work","Bangalore");
		Address address12=new Address("Residential","Kolkata");
		List<Address> list12= new ArrayList<>();
		list12.add(address11);
		list12.add(address12);
		
		Contact contact2=new Contact("Rajan","GlobalSmack",list11,list12);
		
		try {
		add.addContact(contact1);
		 add.addContact(contact2);
		}
		catch(NameException e)
		{
			System.out.println(e.getMsg());
		}
		
		
//		System.out.println(add.searchByName("raJi"));
		//System.out.println("=================================");
		System.out.println(add.searchByOrganisation("global"));
		
		
		
//		System.out.println("before deletion");
//		System.out.println("=================================");
//		add.show();
//		add.deleteContact("Rajan");
//		System.out.println("after deletion");
//		System.out.println("=================================");
//		add.show();
		
		
		
		//UPDATE 
		PhoneNumber updatePhone1=new PhoneNumber("Work","9748171445");
		PhoneNumber updatePhone2=new PhoneNumber("Home","9848171446");
		List<PhoneNumber> updateList1=new ArrayList<>();
		updateList1.add(updatePhone1);
		updateList1.add(updatePhone2);
		Address updateAddress1=new Address("Work","Bangalore");
		Address updateAddress2=new Address("Residential","Delhi");
		List<Address> updateList2= new ArrayList<>();
		updateList2.add(updateAddress1);
		updateList2.add(updateAddress2);
		Contact updateContact=new Contact("rajaN","Samsung",updateList1,updateList2);
		
//		System.out.println("=============================before update============================");
//		add.show();
//		try {
//		add.updateContact("Rajan", updateContact);
//		}
//		catch(NameException e)
//		{
//			System.out.println(e.getMsg());
//		}
//		System.out.println("=============================after update============================");
//		add.show();
		
	}
	
	
	
	public  void addContact(Contact contact )
	{
		for(Contact con:list)
		{
			if(con.getName().equalsIgnoreCase(contact.getName()))
				throw new NameException("Contact already exists with this name: "+contact.getName());
		}
				
		
		 list.add(contact);
	}
	
	
	
	public List<Contact> searchByName(String name)
	{
		List<Contact> li=new ArrayList<>();
		for(Contact con:list)
		{
			if((con.getName().toLowerCase()).startsWith(name.toLowerCase()))
				li.add(con);
		}
		return li;
	}
	
	
	
	public List<Contact> searchByOrganisation(String org)
	{
		List<Contact> li=new ArrayList<>();
		for(Contact con:list)
		{
			if((con.getOrganisation().toLowerCase()).startsWith(org.toLowerCase()))
				li.add(con);
		}
		return li;
	}
	
	
	
	public void deleteContact(String name)
	{
		for(Contact con:list)
		{
			if(con.getName().equals(name))
			{
				list.remove(con);
				System.out.println("Deleted");
				return;
			}
		}
		System.out.println("No matching name present!!!!!!!");//Instead make exception and throw
	}
	
	
	
	public void updateContact(String name, Contact contact)
	{  
		for(Contact conn:list)
		{
			if(conn.getName().equalsIgnoreCase(contact.getName()))
				throw new  NameException("Contact with this name already exist, cannot allow duplicate names");
			
		}
		for(Contact con:list)
		{
			if(con.getName().equalsIgnoreCase(name))
			{
				con.setName(contact.getName());
				con.setOrganisation(contact.getOrganisation());
				
//				for(PhoneNumber ph:con.getPhoneNumbers())
//				{
//					ph.setLabel();
//				}
				for(int i=0;i<con.getPhoneNumbers().size();i++)
				{
					con.getPhoneNumbers().get(i).setLabel(contact.getPhoneNumbers().get(i).getLabel());
					con.getPhoneNumbers().get(i).setPhoneNumber(contact.getPhoneNumbers().get(i).getPhoneNumber());
					
				}
				for(int i=0;i<con.getAddresses().size();i++)
				{
					con.getAddresses().get(i).setLabel(contact.getAddresses().get(i).getLabel());
					con.getAddresses().get(i).setAddress(contact.getAddresses().get(i).getAddress());
				}
				return;
					
			}
		}
		System.out.println("no matching contact found with given name");//throw exception here instead
	}
	
	
	
	
	public void show()
	{
		System.out.println(list);
	}
	

}
