package springjdbc.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.SpringDaoImpl;
import com.spring.jdbc.dao.StudentDao;


@Configuration
// @ComponentScan(basePackages = "springjdbc.spring.jdbc")
public class Javaconfig {
		
		@Bean(name= {"ds"})
		public DataSource getDatasource() {
			DriverManagerDataSource data_source = new DriverManagerDataSource();
			data_source.setDriverClassName("com.mysql.cj.jdbc.Driver");
			data_source.setUrl("jdbc:mysql://localhost:3306/springjdbc");
			data_source.setUsername("root");
			data_source.setPassword("rps@12345");
			
			return data_source;
		}

		@Bean(name= {"jdbcTemplate"})
		public JdbcTemplate getTemplate() {
			JdbcTemplate jdbcTemplate = new JdbcTemplate();
			
			jdbcTemplate.setDataSource(getDatasource());
			
			return jdbcTemplate;
		}
		
		@Bean(name= {"studentDao"})
		public StudentDao getStudentDao() {
			StudentDao studentDao = new SpringDaoImpl();
			
			((SpringDaoImpl) studentDao).setJdbcTemplate(getTemplate());
			
			return studentDao;
		}
}