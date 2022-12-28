package com.ls.smartfarm.device.service.impl;

import com.ls.smartfarm.common.utils.PageUtils;
import com.ls.smartfarm.common.utils.Query;
import com.ls.smartfarm.device.dao.DeviceTypeDao;
import com.ls.smartfarm.device.entity.DeviceTypeEntity;
import com.ls.smartfarm.device.service.DeviceTypeService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("deviceTypeService")
public class DeviceTypeServiceImpl extends ServiceImpl<DeviceTypeDao, DeviceTypeEntity> implements DeviceTypeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DeviceTypeEntity> page = this.page(
                new Query<DeviceTypeEntity>().getPage(params),
                new QueryWrapper<DeviceTypeEntity>()
        );

        return new PageUtils(page);
    }

}