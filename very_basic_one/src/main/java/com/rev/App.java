package com.rev;
import Model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Congig.StudentConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
        Student s=(Student)context.getBean(Student.class);
        s.setId(0);
        s.setName("Sandeep");
        s.setScl_name("Montessori");
        System.out.println( "Hello World!" +s);
    }
}
