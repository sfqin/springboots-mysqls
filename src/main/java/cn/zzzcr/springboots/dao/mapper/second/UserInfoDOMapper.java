package cn.zzzcr.springboots.dao.mapper.second;

import cn.zzzcr.springboots.dao.model.second.UserInfoDO;

public interface UserInfoDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfoDO record);

    int insertSelective(UserInfoDO record);

    UserInfoDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfoDO record);

    int updateByPrimaryKey(UserInfoDO record);
}