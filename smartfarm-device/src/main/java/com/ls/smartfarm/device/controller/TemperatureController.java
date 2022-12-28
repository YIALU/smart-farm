package com.ls.smartfarm.device.controller;

import java.util.Arrays;
import java.util.Map;


import com.ls.smartfarm.common.utils.PageUtils;
import com.ls.smartfarm.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ls.smartfarm.device.entity.TemperatureEntity;
import com.ls.smartfarm.device.service.TemperatureService;




/**
 * 
 *
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:19
 */
@RestController
@RequestMapping("device/temperature")
public class TemperatureController {
    @Autowired
    private TemperatureService temperatureService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("smartfarm-device:temperature:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = temperatureService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("smartfarm-device:temperature:info")
    public R info(@PathVariable("id") Long id){
		TemperatureEntity temperature = temperatureService.getById(id);

        return R.ok().put("temperature", temperature);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("smartfarm-device:temperature:save")
    public R save(@RequestBody TemperatureEntity temperature){
		temperatureService.save(temperature);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("smartfarm-device:temperature:update")
    public R update(@RequestBody TemperatureEntity temperature){
		temperatureService.updateById(temperature);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("smartfarm-device:temperature:delete")
    public R delete(@RequestBody Long[] ids){
		temperatureService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
