package sghl.example;

import sghl.dao.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingleTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao us1 = (UserDao) context.getBean("UserDao");

        System.out.println(us1);

    }
}
