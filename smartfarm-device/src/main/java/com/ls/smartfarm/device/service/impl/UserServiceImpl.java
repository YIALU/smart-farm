package com.ls.smartfarm.smartfarm

-device.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ls.smartfarm.device.common.utils.PageUtils;
import com.ls.smartfarm.device.common.utils.Query;

import com.ls.smartfarm.smartfarm-device.dao.UserDao;
import com.ls.smartfarm.smartfarm-device.entity.UserEntity;
import com.ls.smartfarm.smartfarm-device.service.UserService;


@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserEntity> page = this.page(
                new Query<UserEntity>().getPage(params),
                new QueryWrapper<UserEntity>()
        );

        return new PageUtils(page);
    }

}