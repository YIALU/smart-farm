package com.ls.smartfarm.device.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.ls.smartfarm.common.utils.PageUtils;
import com.ls.smartfarm.common.utils.R;
import com.ls.smartfarm.device.entity.DeviceEntity;


import java.util.Map;

/**
 * 
 *
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:20
 */
public interface DeviceService extends IService<DeviceEntity> {

    PageUtils queryPage(Map<String, Object> params);

    R getdevicedata(String type, Integer did, Integer s);
}

