package com.springcoreautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//here yaha per byName wala used huwa hai
        System.out.println( "Hello World!" );
         ApplicationContext context=new ClassPathXmlApplicationContext("byname.xml");
            Emp emp =context.getBean("emp1",Emp.class);
               // Emp emp=(Emp)context.getBean("emp1");
                System.out.println(emp);
    }
}
