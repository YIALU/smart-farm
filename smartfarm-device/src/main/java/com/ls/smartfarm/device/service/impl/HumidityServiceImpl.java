package com.ls.smartfarm.smartfarm

-device.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ls.smartfarm.device.common.utils.PageUtils;
import com.ls.smartfarm.device.common.utils.Query;

import com.ls.smartfarm.smartfarm-device.dao.HumidityDao;
import com.ls.smartfarm.smartfarm-device.entity.HumidityEntity;
import com.ls.smartfarm.smartfarm-device.service.HumidityService;


@Service("humidityService")
public class HumidityServiceImpl extends ServiceImpl<HumidityDao, HumidityEntity> implements HumidityService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HumidityEntity> page = this.page(
                new Query<HumidityEntity>().getPage(params),
                new QueryWrapper<HumidityEntity>()
        );

        return new PageUtils(page);
    }

}