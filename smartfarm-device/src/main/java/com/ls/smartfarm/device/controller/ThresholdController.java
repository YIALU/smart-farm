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

import com.ls.smartfarm.smartfarm-device.entity.ThresholdEntity;
import com.ls.smartfarm.smartfarm-device.service.ThresholdService;
import com.ls.smartfarm.device.common.utils.PageUtils;
import com.ls.smartfarm.device.common.utils.R;



/**
 * 
 *
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:19
 */
@RestController
@RequestMapping("smartfarm-device/threshold")
public class ThresholdController {
    @Autowired
    private ThresholdService thresholdService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("smartfarm-device:threshold:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = thresholdService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("smartfarm-device:threshold:info")
    public R info(@PathVariable("id") Long id){
		ThresholdEntity threshold = thresholdService.getById(id);

        return R.ok().put("threshold", threshold);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("smartfarm-device:threshold:save")
    public R save(@RequestBody ThresholdEntity threshold){
		thresholdService.save(threshold);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("smartfarm-device:threshold:update")
    public R update(@RequestBody ThresholdEntity threshold){
		thresholdService.updateById(threshold);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("smartfarm-device:threshold:delete")
    public R delete(@RequestBody Long[] ids){
		thresholdService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
