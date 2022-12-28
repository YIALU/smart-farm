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

import com.ls.smartfarm.device.entity.HumidityEntity;
import com.ls.smartfarm.device.service.HumidityService;




/**
 * 
 *
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:20
 */
@RestController
@RequestMapping("device/humidity")
public class HumidityController {
    @Autowired
    private HumidityService humidityService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("smartfarm-device:humidity:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = humidityService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("smartfarm-device:humidity:info")
    public R info(@PathVariable("id") Long id){
		HumidityEntity humidity = humidityService.getById(id);

        return R.ok().put("humidity", humidity);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("smartfarm-device:humidity:save")
    public R save(@RequestBody HumidityEntity humidity){
		humidityService.save(humidity);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("smartfarm-device:humidity:update")
    public R update(@RequestBody HumidityEntity humidity){
		humidityService.updateById(humidity);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("smartfarm-device:humidity:delete")
    public R delete(@RequestBody Long[] ids){
		humidityService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
