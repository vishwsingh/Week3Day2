package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        People obj = (People) context.getBean("stu");
        obj.show();

        People obj1 = (People) context.getBean("stu1");
        obj1.show();

        Phone obj2 = (Phone) context.getBean("stu2");
      //  System.out.println(obj2.getPh());
        obj2.show();



    }
}