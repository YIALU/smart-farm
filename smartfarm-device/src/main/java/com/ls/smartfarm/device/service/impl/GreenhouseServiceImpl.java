package com.ls.smartfarm.device.service.impl;

import com.ls.smartfarm.common.utils.PageUtils;
import com.ls.smartfarm.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ls.smartfarm.device.dao.GreenhouseDao;
import com.ls.smartfarm.device.entity.GreenhouseEntity;
import com.ls.smartfarm.device.service.GreenhouseService;


@Service("greenhouseService")
public class GreenhouseServiceImpl extends ServiceImpl<GreenhouseDao, GreenhouseEntity> implements GreenhouseService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GreenhouseEntity> page = this.page(
                new Query<GreenhouseEntity>().getPage(params),
                new QueryWrapper<GreenhouseEntity>()
        );

        return new PageUtils(page);
    }

}