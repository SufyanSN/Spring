package com.spring.orm.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.SpringDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        SpringDao studentDao = context.getBean("studentDao", SpringDao.class);
        
        
        Student student = new Student(1234, "Syed Sufyan Ahmed 06", "India");
        int res = studentDao.insert(student);
        System.out.println(res + "-rows inserted");
        
        
        /*
        int id=3;
        studentDao.getData(id);
        */
        
        /*
        studentDao.getAllData();
        */
        
        /*
        Student student = new Student(7, "Syed Sufyan Ahmed 06", "India");
        studentDao.updateData(student);
        */
        
        /*
        Student student = new Student(7, "Syed Sufyan Ahmed 06", "India");
        studentDao.deleteEntry(student);
        */
    }
}
