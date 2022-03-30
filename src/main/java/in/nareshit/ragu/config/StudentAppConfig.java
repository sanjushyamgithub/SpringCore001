package in.nareshit.ragu.config;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.nareshit.ragu.bean.Student;

@Configuration
public class StudentAppConfig {

	@Bean
	public Student studentObject() {
		Student student=new Student();
		student.setData(studentNames());
		student.setModels(set());
		student.setModes(map());
		student.setContext(properties());
		return student;
	}
	
	public List<String> studentNames(){
		List<String> names=new LinkedList<>();
		names.add("Ganesh Ji");
		names.add("Shyam");
		return names;
		
	}
	public Set<String> set(){
		Set<String> set=new LinkedHashSet<>();
		set.add("Ramesh");
		set.add("Ramesh");
		set.add("Sachin");
		set.add("MS.Dhoni");
		set.add("Virat");
		return set;
	}
	public Map<Integer, String> map(){
		Map<Integer, String> map=new LinkedHashMap<>();
		map.put(1, "Sports");
		map.put(2, "Books");
		return map;
	}
	public Properties properties() {
		Properties properties=new Properties();
		properties.put("Driver-class", "com.mysql.cj.jdbc.driver");
		properties.put("url", "jdbc:mysql://localhost:3306/testDb");
		properties.put("user", "root");
		properties.put("password", "sanjushyam");
		return properties;
	}
}
