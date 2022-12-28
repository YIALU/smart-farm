package com.ls.smartfarm.device.service.impl;

import com.ls.smartfarm.common.utils.PageUtils;
import com.ls.smartfarm.common.utils.Query;
import com.ls.smartfarm.common.utils.R;
import com.ls.smartfarm.device.dao.DeviceDao;
import com.ls.smartfarm.device.dao.HumidityDao;
import com.ls.smartfarm.device.dao.TemperatureDao;
import com.ls.smartfarm.device.entity.DeviceEntity;
import com.ls.smartfarm.device.entity.TemperatureEntity;
import com.ls.smartfarm.device.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("deviceService")
public class DeviceServiceImpl extends ServiceImpl<DeviceDao, DeviceEntity> implements DeviceService {

    @Autowired
    TemperatureDao temperatureDao;

    @Autowired
    HumidityDao humidityDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DeviceEntity> page = this.page(
                new Query<DeviceEntity>().getPage(params),
                new QueryWrapper<DeviceEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public R getdevicedata(String type, Integer did, Integer size) {


        switch (type) {
            case "温度传感器":
                List<Float> data = processingTempData(temperatureDao.selectListByDevice(did, size));
                return R.ok().put("data", data);
            case "湿度传感器":
                return R.ok().put("data", humidityDao.selectListByDevice(did, size));
            default:
                return R.error("查询失败");
        }
    }


    private List<Float> processingTempData(List<TemperatureEntity> datas){
        List<Float> collect = datas.stream().map(data ->
            data.getData()
        ).collect(Collectors.toList());
        return collect;
    }

}