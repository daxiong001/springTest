package factory;

import sghl.dao.UserDao;
import sghl.dao.impl.UserDaoImpl;

public class StaticFactory {

    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
