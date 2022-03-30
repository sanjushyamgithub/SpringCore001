package in.nareshit.ragu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.nareshit.ragu.bean.Product;

@Configuration
public class AppConfig {

	@Bean
	public Product productObject() {
		Product product=new Product();
		product.setId(1);
		product.setName("Ganesh Ji");
		return product;
	}
}
