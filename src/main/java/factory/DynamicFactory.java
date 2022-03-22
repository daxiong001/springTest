package factory;

import sghl.dao.UserDao;
import sghl.dao.impl.UserDaoImpl;

public class DynamicFactory {

    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
