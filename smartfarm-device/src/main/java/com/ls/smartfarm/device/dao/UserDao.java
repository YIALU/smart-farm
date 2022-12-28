package com.ls.smartfarm.device.dao;

import com.ls.smartfarm.device.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * 
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:19
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

    int deleteByPrimaryKey(Integer id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);

    int checkUsername(String name);

    int checkEmail(String email);

    int checkPhone(String email);

    int selectRole(int userId);

    int selectStatus(int userId);

    UserEntity selectLogin(@Param("phone")String phone, @Param("password") String password);

    List<UserEntity> selectList();

    List<UserEntity> search(String str);

    int getNewUserCountByWeek(int type);

}
