package com.ls.smartfarm.smartfarm

-device.dao;

import com.ls.smartfarm.smartfarm-device.entity.DeviceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:20
 */
@Mapper
public interface DeviceDao extends BaseMapper<DeviceEntity> {
	
}
