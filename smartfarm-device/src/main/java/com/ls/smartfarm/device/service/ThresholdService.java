package com.ls.smartfarm.smartfarm

-device.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ls.smartfarm.device.common.utils.PageUtils;
import com.ls.smartfarm.smartfarm-device.entity.ThresholdEntity;

import java.util.Map;

/**
 * 
 *
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:19
 */
public interface ThresholdService extends IService<ThresholdEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

