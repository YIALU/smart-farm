package com.ls.smartfarm.smartfarm

-device.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ls.smartfarm.device.common.utils.PageUtils;
import com.ls.smartfarm.device.common.utils.Query;

import com.ls.smartfarm.smartfarm-device.dao.UserDeviceDao;
import com.ls.smartfarm.smartfarm-device.entity.UserDeviceEntity;
import com.ls.smartfarm.smartfarm-device.service.UserDeviceService;


@Service("userDeviceService")
public class UserDeviceServiceImpl extends ServiceImpl<UserDeviceDao, UserDeviceEntity> implements UserDeviceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserDeviceEntity> page = this.page(
                new Query<UserDeviceEntity>().getPage(params),
                new QueryWrapper<UserDeviceEntity>()
        );

        return new PageUtils(page);
    }

}