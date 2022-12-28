package com.ls.smartfarm.device.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ls.smartfarm.common.utils.PageUtils;
import com.ls.smartfarm.device.entity.GreenhouseDeviceEntity;
import java.util.Map;

/**
 * 将大棚与设备关联
 *
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:20
 */
public interface GreenhouseDeviceService extends IService<GreenhouseDeviceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

