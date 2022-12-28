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

import com.ls.smartfarm.device.entity.GreenhouseDeviceEntity;
import com.ls.smartfarm.device.service.GreenhouseDeviceService;




/**
 * 将大棚与设备关联
 *
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:20
 */
@RestController
@RequestMapping("device/greenhousedevice")
public class GreenhouseDeviceController {
    @Autowired
    private GreenhouseDeviceService greenhouseDeviceService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("smartfarm-device:greenhousedevice:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = greenhouseDeviceService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("smartfarm-device:greenhousedevice:info")
    public R info(@PathVariable("id") Long id){
		GreenhouseDeviceEntity greenhouseDevice = greenhouseDeviceService.getById(id);

        return R.ok().put("greenhouseDevice", greenhouseDevice);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("smartfarm-device:greenhousedevice:save")
    public R save(@RequestBody GreenhouseDeviceEntity greenhouseDevice){
		greenhouseDeviceService.save(greenhouseDevice);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("smartfarm-device:greenhousedevice:update")
    public R update(@RequestBody GreenhouseDeviceEntity greenhouseDevice){
		greenhouseDeviceService.updateById(greenhouseDevice);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("smartfarm-device:greenhousedevice:delete")
    public R delete(@RequestBody Long[] ids){
		greenhouseDeviceService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
