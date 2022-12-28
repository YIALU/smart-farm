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

import com.ls.smartfarm.device.entity.UserDeviceEntity;
import com.ls.smartfarm.device.service.UserDeviceService;




/**
 * 用户设备关联表
 *
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:19
 */
@RestController
@RequestMapping("device/userdevice")
public class UserDeviceController {
    @Autowired
    private UserDeviceService userDeviceService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("smartfarm-device:userdevice:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userDeviceService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("smartfarm-device:userdevice:info")
    public R info(@PathVariable("id") Integer id){
		UserDeviceEntity userDevice = userDeviceService.getById(id);

        return R.ok().put("userDevice", userDevice);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("smartfarm-device:userdevice:save")
    public R save(@RequestBody UserDeviceEntity userDevice){
		userDeviceService.save(userDevice);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("smartfarm-device:userdevice:update")
    public R update(@RequestBody UserDeviceEntity userDevice){
		userDeviceService.updateById(userDevice);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("smartfarm-device:userdevice:delete")
    public R delete(@RequestBody Integer[] ids){
		userDeviceService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
