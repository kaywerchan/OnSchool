package test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaonei.service.UserService;

public class UserServiceTest {
	private ApplicationContext ac;
	private UserService userService;
	
	@Before
	public void before(){
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		userService = (UserService) ac.getBean("userService");
	}
	@Test
	public void test1(){
		long testPhone = 12345678910L;
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2(){
		try {
			System.out.println(userService.getUser("kk", "123456"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test3(){
		long testPhone = 12345678910L;
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
