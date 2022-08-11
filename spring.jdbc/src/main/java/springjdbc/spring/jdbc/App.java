package springjdbc.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);
        
        /*
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String query = "insert into student(id,name,city) values(?,?,?)";
        
        int result = template.update(query, 124, "Syed Sufyan Ahmed", "India");
        System.out.println(result + " - records inserted");
        */
        
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
        /*
        Student student = new Student();
        student.setId(125);
        student.setName("Syed Sufyan Ahmed");
        student.setCity("India");
        
        int result = studentDao.insert(student);
        System.out.println(result + "-rows inserted");
        */
        
        /*
        Student student = new Student();
        student.setId(125);
        student.setName("Syed Sufyan Ahmed 01");
        student.setCity("Dubai");
        
        int result = studentDao.change(student);
        System.out.println(result + "-rows updated");
        */
       
        /*
        Student student = new Student();
        
        int result = studentDao.delete(125);
        System.out.println(result + "-rows deleted");
        */
        
        Student student = studentDao.getStudent(123);
        System.out.println(student);
        
        System.out.println("\n");
        
        List<Student> students = studentDao.getAllStudents();
        for(Student s : students) {
        	System.out.println(s);
        }
    }
}
