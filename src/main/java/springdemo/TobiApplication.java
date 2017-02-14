package springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springdemo.user.dao.UserDao;
import springdemo.user.domain.User;

@SpringBootApplication
public class TobiApplication {

	public static void main(String[] args) throws Exception{

		UserDao dao = new UserDao();

		User user = new User();
		user.setId( "whiteship");
		user.setName( "테스터");
		user.setPassword( "married");

		dao.add( user);

		System.out.println( "등록 성공");

		user = dao.get( "whiteship");
        System.out.println( user.getName());
//		SpringApplication.run(TobiApplication.class, args);
	}
}
