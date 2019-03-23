package cn.zzzcr.springboots.dao.impl;

import cn.zzzcr.springboots.dao.UserDao;
import cn.zzzcr.springboots.dao.mapper.first.StudentDOMapper;
import cn.zzzcr.springboots.dao.mapper.second.UserInfoDOMapper;
import cn.zzzcr.springboots.dao.model.first.StudentDO;
import cn.zzzcr.springboots.dao.model.second.UserInfoDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserInfoDOMapper userInfoDOMapper;

    @Autowired
    private StudentDOMapper studentDOMapper;

    @Override
    public StudentDO getStu(int id) {
        return studentDOMapper.selectByPrimaryKey(id);
    }

    @Override
    public UserInfoDO getUser(int id) {
        return userInfoDOMapper.selectByPrimaryKey(id);
    }
}
