package com.pTuts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {
		
	//Load the resource
	    Resource resource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	    StudentBean student=(StudentBean)factory.getBean("studentbean");  
    	    System.out.println(student.getName());
		
		
		
		
		

	}

}
