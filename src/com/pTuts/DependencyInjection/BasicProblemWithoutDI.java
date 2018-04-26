package com.pTuts.DependencyInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pTuts.StudentBean;

public class BasicProblemWithoutDI {

	
	public static void main(String... agrs)
	{
		
		// without dependency injection 
		
		 Resource resource=new ClassPathResource("applicationContext.xml");  
		  BeanFactory factory=new XmlBeanFactory(resource);  
		  
		  
		  
//		  Employee employee1=(Employee)factory.getBean("employee1");  
//		 System.out.println(employee1.getName());
//		 Employee employee2=(Employee)factory.getBean("employee2");  
//		 System.out.println(employee1.getName());
		

		
	}
	
}
