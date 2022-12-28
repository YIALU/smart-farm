package com.ls.smartfarm.device.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ls.smartfarm.common.utils.PageUtils;
import com.ls.smartfarm.device.entity.DeviceTypeEntity;
import java.util.Map;

/**
 * 设备类型
 *
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-25 11:23:59
 */
public interface DeviceTypeService extends IService<DeviceTypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

