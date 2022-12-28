package com.ls.smartfarm.smartfarm

-device.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ls.smartfarm.device.common.utils.PageUtils;
import com.ls.smartfarm.device.common.utils.Query;

import com.ls.smartfarm.smartfarm-device.dao.GreenhouseDeviceDao;
import com.ls.smartfarm.smartfarm-device.entity.GreenhouseDeviceEntity;
import com.ls.smartfarm.smartfarm-device.service.GreenhouseDeviceService;


@Service("greenhouseDeviceService")
public class GreenhouseDeviceServiceImpl extends ServiceImpl<GreenhouseDeviceDao, GreenhouseDeviceEntity> implements GreenhouseDeviceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GreenhouseDeviceEntity> page = this.page(
                new Query<GreenhouseDeviceEntity>().getPage(params),
                new QueryWrapper<GreenhouseDeviceEntity>()
        );

        return new PageUtils(page);
    }

}