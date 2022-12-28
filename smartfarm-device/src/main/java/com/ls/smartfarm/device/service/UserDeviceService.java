package com.ls.smartfarm.smartfarm

-device.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ls.smartfarm.device.common.utils.PageUtils;
import com.ls.smartfarm.smartfarm-device.entity.UserDeviceEntity;

import java.util.Map;

/**
 * 用户设备关联表
 *
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:19
 */
public interface UserDeviceService extends IService<UserDeviceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

