package in.nareshit.ragu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.nareshit.ragu.impl.IModel;
import in.nareshit.ragu.impl.ModelClass;
import in.nareshit.ragu.impl.ModelImpl1;
import in.nareshit.ragu.impl.ModelImpl2;

@Configuration
public class IModelConfig {

	@Bean
	public IModel iModel() {
		//ModelImpl1 modelImpl1=new ModelImpl1();
		ModelImpl2 modelImpl2=new ModelImpl2();
		return modelImpl2;
	}
	@Bean
	public ModelClass modelClass() {
		ModelClass modelClass=new ModelClass();
		modelClass.setIModel(iModel());
		return modelClass;
	}
}
