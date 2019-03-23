package cn.zzzcr.springboots.dao;

import cn.zzzcr.springboots.dao.model.first.StudentDO;
import cn.zzzcr.springboots.dao.model.second.UserInfoDO;

public interface UserDao {


    StudentDO getStu(int id);

    UserInfoDO getUser(int id);
}
