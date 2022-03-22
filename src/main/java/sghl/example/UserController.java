package sghl.example;

import config.DataSourceConfiguration;
import config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sghl.service.UserService;

import java.sql.Connection;
import java.sql.SQLException;

public class UserController {

    public static void main(String[] args) throws SQLException {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = context.getBean(UserService.class);
        DataSourceConfiguration dataSource = context.getBean(DataSourceConfiguration.class);
        Connection conn = dataSource.getDataSource().getConnection();
        System.out.println(conn);
        userService.save();
//        System.out.println(userService1);
//        System.out.println(userService);
    }
}
