package com.ffk.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;



import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ffk.dao.ExampleBean;
import com.ffk.dao.JDBCDataSource;
import com.ffk.dao.UserDao;
import com.ffk.entity.User;
import com.ffk.service.UserService;
import com.sun.xml.internal.ws.api.server.SDDocument;

public class TestCase {
	
//	@Test
//	public void testInitContext(){
//		String conf = "applicationContext.xml";
//		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
//		Calendar call = ac.getBean("calendarObj1" , Calendar.class);
//		System.out.println("call=" + call);
//		
//		Calendar cal2 = ac.getBean("claendarObj2", Calendar.class);
//		System.out.println("cal2:"+cal2);
//		
//		
//		Date date = ac.getBean("dateObj", Date.class);
//		System.out.println("date:"+date);
//	}
//	
//	@Test
//	public void testExampleBean(){
//		String conf = "applicationContext.xml";
//		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
//		ExampleBean bean1 = ac.getBean("exampleBean", ExampleBean.class);
//		ExampleBean bean2 = ac.getBean("exampleBean", ExampleBean.class);
//		System.out.println(bean1 == bean2);
//	}
//	

	@Test
	public void testMyUserDao(){
		String conf = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		UserService userService = ac.getBean("userService",UserService.class);
		User tom = userService.login("Tom","123");
		System.out.println(tom);
	}
}
