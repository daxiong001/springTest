package sghl.dao.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import sghl.dao.UserDao;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

//    private List<String> strList;
//    private Map<String, User> userMap;
//    private Properties properties;
//
//    public void setStrList(List<String> strList) {
//        this.strList = strList;
//    }
//
//    public void setUserMap(Map<String, User> userMap) {
//        this.userMap = userMap;
//    }
//
//    public void setProperties(Properties properties) {
//        this.properties = properties;
//    }

    @Value("zhangsan")
    private String userName;
    @Value("34")
    private int age;



    //    public UserDaoImpl(){
//        System.out.println("无参构造方法");
//    }

    @Override
    public void save() {
        System.out.println(userName+"====="+age);
//        System.out.println(strList);
//        System.out.println(userMap);
//        System.out.println(properties);
        System.out.println("创建对象");
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化方法");
    }

    @PreDestroy
    public void destory(){
        System.out.println("初始化方法");
    }

}
