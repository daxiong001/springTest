package org;

import config.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sghl.service.UserService;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")//xml文件测试
@ContextConfiguration(classes = {SpringConfiguration.class})
public class SpringJunitTest {

    @Autowired
    private UserService userService;

    @Autowired
    private DataSource dataSource;

    @Test
    public void test() throws SQLException {
        dataSource.getConnection();
        userService.save();
    }
}
