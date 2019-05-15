

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import mybatis.dao.SingerDAO;
import mybatis.dao.TransactionDao;
import mybatis.domain.Singer;

public class Main {

	public static void main(String[] args) {
		
		//SpringBeanConfiguration 파일을 이용하는 경우 context
		
		GenericXmlApplicationContext context =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
	
		
		//어노테이션으로 만들어진 설정 파일 불러 오기 
		/*
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(RootConfig.class);
		*/
		 TransactionDao dao = context.getBean(TransactionDao.class);
		 dao.insert();
		
		
		context.close();
	}

}
