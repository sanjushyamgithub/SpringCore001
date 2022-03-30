package in.nareshit.ragu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.nareshit.ragu.bean.A;
import in.nareshit.ragu.bean.B;
import in.nareshit.ragu.bean.C;

@Configuration
public class MultipleHasRelationConfig {

	@Bean
	public C cObj() {
		C c=new C();
		c.setId(10);
		return c;
	}
	
	@Bean
	public B bObj() {
		B b=new B();
		b.setCObj(cObj());
		return b;
	}
	@Bean
	public A aObj() {
		A a=new A();
		a.setBObj(bObj());
		return a;
	}
}
