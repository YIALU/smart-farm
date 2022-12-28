package com.ls.smartfarm.device.dao;

import com.ls.smartfarm.device.entity.GreenhouseDeviceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 将大棚与设备关联
 * 
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:20
 */
@Mapper
public interface GreenhouseDeviceDao extends BaseMapper<GreenhouseDeviceEntity> {
	
}
