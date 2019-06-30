package spring;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SpringDao springDao =(SpringDao) context.getBean("springDao");
		
		List<Map<String,Object>> data = springDao.getDataClassic();
		System.out.println(data);
		
		List<Map<String,Object>> data1 = springDao.getDataFromUday();
		System.out.println(data1);
		
		((AbstractApplicationContext)context).close();
	}

}
