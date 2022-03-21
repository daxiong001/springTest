package service.impl;

import dao.UserDao;
import service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;



    /**
     * set注入dao对象
     */
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 构造注入dao对象
     */



    @Override
    public void save() {
        userDao.save();
    }
}
