package com.ls.smartfarm.smartfarm

-device.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ls.smartfarm.device.common.utils.PageUtils;
import com.ls.smartfarm.device.common.utils.Query;

import com.ls.smartfarm.smartfarm-device.dao.TemperatureDao;
import com.ls.smartfarm.smartfarm-device.entity.TemperatureEntity;
import com.ls.smartfarm.smartfarm-device.service.TemperatureService;


@Service("temperatureService")
public class TemperatureServiceImpl extends ServiceImpl<TemperatureDao, TemperatureEntity> implements TemperatureService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TemperatureEntity> page = this.page(
                new Query<TemperatureEntity>().getPage(params),
                new QueryWrapper<TemperatureEntity>()
        );

        return new PageUtils(page);
    }

}