package com.ls.smartfarm.smartfarm

-device.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ls.smartfarm.smartfarm-device.entity.DeviceEntity;
import com.ls.smartfarm.smartfarm-device.service.DeviceService;
import com.ls.smartfarm.device.common.utils.PageUtils;
import com.ls.smartfarm.device.common.utils.R;



/**
 * 
 *
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:20
 */
@RestController
@RequestMapping("smartfarm-device/device")
public class DeviceController {
    @Autowired
    private DeviceService deviceService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("smartfarm-device:device:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = deviceService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("smartfarm-device:device:info")
    public R info(@PathVariable("id") Integer id){
		DeviceEntity device = deviceService.getById(id);

        return R.ok().put("device", device);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("smartfarm-device:device:save")
    public R save(@RequestBody DeviceEntity device){
		deviceService.save(device);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("smartfarm-device:device:update")
    public R update(@RequestBody DeviceEntity device){
		deviceService.updateById(device);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("smartfarm-device:device:delete")
    public R delete(@RequestBody Integer[] ids){
		deviceService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
