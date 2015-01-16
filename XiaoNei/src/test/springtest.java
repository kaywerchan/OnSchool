package test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springtest {
	private ApplicationContext ac;
	private SessionFactory sessionFactory;
	
	@Test
	public void test1(){
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		sessionFactory = (SessionFactory) ac.getBean("sessionFactory");
		System.out.println(sessionFactory);
	}

}
