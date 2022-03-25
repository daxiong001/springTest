package sghl.example;

import com.alibaba.druid.pool.DruidDataSource;
import config.SpringConfiguration;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sghl.dao.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.transform.Source;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")//xml文件测试
@ContextConfiguration(classes = {SpringConfiguration.class})
public class SingleTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test(){
        int row = jdbcTemplate.update("insert into account value (?,?)", "lisi", 5000);
        System.out.println(row);
    }
}
