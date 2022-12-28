package com.ls.smartfarm.device.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ls.smartfarm.common.utils.PageUtils;
import com.ls.smartfarm.common.utils.R;
import com.ls.smartfarm.device.entity.UserEntity;
import java.util.Map;

/**
 * 
 *
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:19
 */
public interface UserService extends IService<UserEntity> {

    PageUtils queryPage(Map<String, Object> params);

    R login(String phone, String password);

    R selectUserAllDevice(Integer uid);
}

