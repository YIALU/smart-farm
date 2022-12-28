package com.ls.smartfarm.smartfarm

-device.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ls.smartfarm.device.common.utils.PageUtils;
import com.ls.smartfarm.device.common.utils.Query;

import com.ls.smartfarm.smartfarm-device.dao.ThresholdDao;
import com.ls.smartfarm.smartfarm-device.entity.ThresholdEntity;
import com.ls.smartfarm.smartfarm-device.service.ThresholdService;


@Service("thresholdService")
public class ThresholdServiceImpl extends ServiceImpl<ThresholdDao, ThresholdEntity> implements ThresholdService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ThresholdEntity> page = this.page(
                new Query<ThresholdEntity>().getPage(params),
                new QueryWrapper<ThresholdEntity>()
        );

        return new PageUtils(page);
    }

}