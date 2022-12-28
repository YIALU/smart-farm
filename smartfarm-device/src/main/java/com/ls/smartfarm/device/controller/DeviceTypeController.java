package com.ls.smartfarm.device.controller;

import java.util.Arrays;
import java.util.Map;

import com.ls.smartfarm.common.utils.PageUtils;
import com.ls.smartfarm.common.utils.R;
import com.ls.smartfarm.device.entity.DeviceTypeEntity;
import com.ls.smartfarm.device.service.DeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





/**
 * 设备类型
 *
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-25 11:23:59
 */
@RestController
@RequestMapping("/devicetype")
public class DeviceTypeController {
    @Autowired
    private DeviceTypeService deviceTypeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions(":devicetype:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = deviceTypeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions(":devicetype:info")
    public R info(@PathVariable("id") Integer id){
		DeviceTypeEntity deviceType = deviceTypeService.getById(id);

        return R.ok().put("deviceType", deviceType);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions(":devicetype:save")
    public R save(@RequestBody DeviceTypeEntity deviceType){
		deviceTypeService.save(deviceType);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions(":devicetype:update")
    public R update(@RequestBody DeviceTypeEntity deviceType){
		deviceTypeService.updateById(deviceType);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions(":devicetype:delete")
    public R delete(@RequestBody Integer[] ids){
		deviceTypeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
