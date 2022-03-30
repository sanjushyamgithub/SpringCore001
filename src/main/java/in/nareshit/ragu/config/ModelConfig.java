package in.nareshit.ragu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.nareshit.ragu.bean.Model;
import in.nareshit.ragu.bean.Mproduct;

@Configuration
public class ModelConfig {

	@Bean
	public Model model() {
		Model model= new Model();
		model.setMid(1);
		return model;
	}
	@Bean
	public Mproduct mproduct() {
		Mproduct mproduct=new Mproduct();
		mproduct.setPid(7);
		mproduct.setModel(model());
		
		return mproduct;
	}
}
