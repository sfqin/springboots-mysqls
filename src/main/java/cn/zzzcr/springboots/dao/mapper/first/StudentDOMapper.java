package cn.zzzcr.springboots.dao.mapper.first;

import cn.zzzcr.springboots.dao.model.first.StudentDO;

public interface StudentDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentDO record);

    int insertSelective(StudentDO record);

    StudentDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentDO record);

    int updateByPrimaryKey(StudentDO record);
}