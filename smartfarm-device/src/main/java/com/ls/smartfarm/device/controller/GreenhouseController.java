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

import com.ls.smartfarm.smartfarm-device.entity.GreenhouseEntity;
import com.ls.smartfarm.smartfarm-device.service.GreenhouseService;
import com.ls.smartfarm.device.common.utils.PageUtils;
import com.ls.smartfarm.device.common.utils.R;



/**
 * 大棚管理
 *
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:20
 */
@RestController
@RequestMapping("smartfarm-device/greenhouse")
public class GreenhouseController {
    @Autowired
    private GreenhouseService greenhouseService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("smartfarm-device:greenhouse:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = greenhouseService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("smartfarm-device:greenhouse:info")
    public R info(@PathVariable("id") Long id){
		GreenhouseEntity greenhouse = greenhouseService.getById(id);

        return R.ok().put("greenhouse", greenhouse);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("smartfarm-device:greenhouse:save")
    public R save(@RequestBody GreenhouseEntity greenhouse){
		greenhouseService.save(greenhouse);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("smartfarm-device:greenhouse:update")
    public R update(@RequestBody GreenhouseEntity greenhouse){
		greenhouseService.updateById(greenhouse);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("smartfarm-device:greenhouse:delete")
    public R delete(@RequestBody Long[] ids){
		greenhouseService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
