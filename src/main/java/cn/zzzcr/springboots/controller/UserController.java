package cn.zzzcr.springboots.controller;

import cn.zzzcr.springboots.dao.UserDao;
import cn.zzzcr.springboots.dao.model.first.StudentDO;
import cn.zzzcr.springboots.dao.model.second.UserInfoDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/rest")
public class UserController {

    @Autowired
    private UserDao userDao;


    @GetMapping("user")
    private Map<String, Object> getUser(int id){
        UserInfoDO user = userDao.getUser(id);
        StudentDO stu = userDao.getStu(id);

        Map<String, Object> result = new HashMap<>();
        result.put("user",user);
        result.put("student",stu);

        return result;
    }

}
