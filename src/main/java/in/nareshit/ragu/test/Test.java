package in.nareshit.ragu.test;

import java.nio.channels.AcceptPendingException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.nareshit.ragu.bean.A;
import in.nareshit.ragu.bean.DBConnection;
import in.nareshit.ragu.bean.Model;
import in.nareshit.ragu.bean.Mproduct;
import in.nareshit.ragu.bean.Product;
import in.nareshit.ragu.bean.Student;
import in.nareshit.ragu.config.AppConfig;
import in.nareshit.ragu.config.IModelConfig;
import in.nareshit.ragu.config.ModelConfig;
import in.nareshit.ragu.config.MultipleHasRelationConfig;
import in.nareshit.ragu.config.PropertyConfig;
import in.nareshit.ragu.config.StudentAppConfig;
import in.nareshit.ragu.impl.ModelClass;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * ApplicationContext ac=new
		 * AnnotationConfigApplicationContext(AppConfig.class); Product
		 * product=(Product) ac.getBean("productObject");
		 * System.out.println(product.toString());
		 */
		
		/*ApplicationContext ac=new AnnotationConfigApplicationContext(StudentAppConfig.class);
		
		Object bean = ac.getBean("studentObject");
		Student student=(Student)bean;
		System.out.println(student);
		*/
		
		//ApplicationContext ac=new AnnotationConfigApplicationContext(ModelConfig.class);
		
		/*
		Model model=(Model) ac.getBean("model");
		model.setMid(1);
		Mproduct mproduct=(Mproduct) ac.getBean("mproduct");
		mproduct.setPid(7);
		mproduct.setModel(model);
		
		System.out.println(mproduct);
		*/
		
		
		
		/*
		 * Mproduct mproduct=(Mproduct) ac.getBean("mproduct");
		 * System.out.println(mproduct);
		 */
		
		/*
		 * ApplicationContext ac=new
		 * AnnotationConfigApplicationContext(MultipleHasRelationConfig.class); A a=(A)
		 * ac.getBean("aObj"); System.out.println(a);
		 */
		
		/*
		 * ApplicationContext ac=new
		 * AnnotationConfigApplicationContext(IModelConfig.class); ModelClass
		 * modelClass=(ModelClass) ac.getBean("modelClass");
		 * System.out.println(modelClass.getIModel().m());
		 */
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(PropertyConfig.class);
		DBConnection dbConnection=(DBConnection) ac.getBean("dbConnection");
		System.out.println(dbConnection);
		
	}
}
