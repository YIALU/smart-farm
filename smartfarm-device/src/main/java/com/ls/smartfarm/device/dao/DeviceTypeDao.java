package com.ls.smartfarm.device.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ls.smartfarm.device.entity.DeviceTypeEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 设备类型
 * 
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-25 11:23:59
 */
@Mapper
public interface DeviceTypeDao extends BaseMapper<DeviceTypeEntity> {
	
}
