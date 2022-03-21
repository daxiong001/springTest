package com.tutorialspoint;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        /*XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        HelloWorld obj = (HelloWorld) factory.getBean("hellWorld");
        obj.getMessage();*/

        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/Beans.xml");
//        HelloWorld obj = (HelloWorld) context.getBean("hellWorld");
//        obj.getMessage();

//        TextEditor te = (TextEditor) context.getBean("textEditor");
//        te.spellCheck();

//        Student student = (Student) context.getBean("student");
//        System.out.println(student.getName());
//        System.out.println(student.getAge());
        ApplicationContext context1 =
                new ClassPathXmlApplicationContext("Beans.xml");
        StudentDAOImpl studentJDBCTemplate =
                (StudentDAOImpl)context1.getBean("StudentDAOImpl");
        System.out.println("------Records Creation--------" );
        studentJDBCTemplate.create("Zara", 11);
        studentJDBCTemplate.create("Nuha", 2);
        studentJDBCTemplate.create("Ayan", 15);
        System.out.println("------Listing Multiple Records--------" );
        List<Student> students = studentJDBCTemplate.listStudents();
        for (Student record : students) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getAge());
        }
        System.out.println("----Updating Record with ID = 2 -----" );
        studentJDBCTemplate.update(2, 20);
        System.out.println("----Listing Record with ID = 2 -----" );
        Student student = studentJDBCTemplate.getStudent(2);
        System.out.print("ID : " + student.getId() );
        System.out.print(", Name : " + student.getName() );
        System.out.println(", Age : " + student.getAge());
    }
}
