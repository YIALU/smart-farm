package com.ls.smartfarm.device.dao;

import com.ls.smartfarm.device.entity.HumidityEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * 
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:20
 */
@Mapper
public interface HumidityDao extends BaseMapper<HumidityEntity> {
    List<HumidityEntity> selectListByDevice(@Param("deviceId")int deviceId, @Param("size")int size);
}
