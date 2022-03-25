package sghl.controller;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping(value = "/quick",method = RequestMethod.GET)
    public String save(){
        System.out.println("sghl.controller save running.....");
        return "success";
    }

    //回写字符串
    @RequestMapping(value = "/quick1")
    @ResponseBody//告知spring-mvc框架 不进行视图跳转，直接进行数据响应
    public String save1(){
        System.out.println("sghl.controller save running.....");
        return "it heima";
    }

    //回写json
    @RequestMapping("/quick2")
    @ResponseBody
    public String save2() throws JsonProcessingException {
        User user = new User();
        user.setName("dai");
        user.setAddr("湖南");
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(user);
    }

    //返回对象或集合
    @RequestMapping("/quick3")
    @ResponseBody
    public User save3(){
        User user = new User();
        user.setName("dai");
        user.setAddr("122");
        return user;
    }
}
