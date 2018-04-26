package com.pTuts.problemWithDependencyLookup;

public class BasicProblemWithoutDI {

	
	public static void main(String... agrs)
	{
		
		// without dependency injection 
		Address address1 = new Address("123", "456");
		Address address2 = new Address("123", "456");
		Address address3 = new Address("123", "456");
		//.............//
		
		
		//SOME RANDOM CODE
		
		
		//..................//
		
		
		
		
		
		//SOME RANDOM CODE
		
		
		
		
		
		
		
		Employee employee1= new Employee("25", "priyansh", address1);
		
		
		
		//SOME RANDOM CODE
		
		
		
		
		Employee employee2= new Employee("25", "priyansh", address2);
		Employee employee3= new Employee("25", "priyansh", address3);
		
		
		//SOME RANDOM CODE
		
		
		
		Employee employee4= new Employee("25", "priyansh", address1);	
		
	}
	
}
