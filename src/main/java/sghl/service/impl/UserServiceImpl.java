package sghl.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import sghl.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import sghl.service.UserService;

import javax.annotation.Resource;


@Service("userService")
//@Scope("prototype")
@Scope("singleton")
public class UserServiceImpl implements UserService {

    @Value("${driverClassName}")
    private String driver;
//    @Autowired
//    @Qualifier("userDao")
//    @Resource(name = "userDao")

    private UserDao userDao;



    /**
     * set注入dao对象
     */
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }


//    public UserServiceImpl() {
//    }
//
//
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 构造注入dao对象
     */



    @Override
    public void save() {
        System.out.println(driver);
        userDao.save();
    }
}
