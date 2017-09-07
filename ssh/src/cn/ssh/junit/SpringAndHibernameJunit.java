package cn.ssh.junit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ssh.pojo.Student;
import cn.ssh.service.StudentService;

public class SpringAndHibernameJunit {
	
	@Test
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/application.xml");
		StudentService bean = ac.getBean(StudentService.class);
		Student student = new Student();
		student.setSid(1);
		student.setSname("张三");
		student.setSage(18);
		bean.add(student );
	}

}
