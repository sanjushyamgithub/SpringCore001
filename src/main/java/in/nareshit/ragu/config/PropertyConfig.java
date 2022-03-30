package in.nareshit.ragu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import in.nareshit.ragu.bean.DBConnection;

@Configuration
@PropertySource({"/in/nareshit/ragu/bean/MyProp.properties"})
public class PropertyConfig {

	@Autowired
	Environment environment;
	
	@Bean
	public DBConnection dbConnection() {
	
		DBConnection dbConnection=new DBConnection();
		dbConnection.setDriverClass(environment.getProperty("DriverClass"));
		dbConnection.setUrl(environment.getProperty("url"));
		dbConnection.setUserName(environment.getProperty("userName"));
		dbConnection.setPassword(environment.getProperty("password"));
		return dbConnection;
	}
}
