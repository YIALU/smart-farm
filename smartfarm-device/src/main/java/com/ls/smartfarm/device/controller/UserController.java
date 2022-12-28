package com.ls.smartfarm.device.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


import com.ls.smartfarm.common.utils.PageUtils;
import com.ls.smartfarm.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ls.smartfarm.device.entity.UserEntity;
import com.ls.smartfarm.device.service.UserService;

/**
 * 
 *
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:19
 */
@Slf4j
@RestController
@RequestMapping("device/user")
public class UserController {
    @Autowired
    private UserService userService;


    /**
     * 查询用户拥有的所有设备
     */
    @GetMapping("/userDeviceList")
    public R userDeviceList(@RequestParam Integer uid){
        log.info(uid.toString());
        return userService.selectUserAllDevice(uid);

    }


    /**
     * 登录
     */
    @PostMapping("/loginWithPwd")
    public R loginWithPwd(@RequestBody HashMap<String, Object> map){

        log.info(map.toString());

        String phone = (String) map.get("phone");
        String password = (String) map.get("password");


        return userService.login(phone, password);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("smartfarm-device:user:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("smartfarm-device:user:info")
    public R info(@PathVariable("id") Integer id){
		UserEntity user = userService.getById(id);

        return R.ok().put("user", user);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("smartfarm-device:user:save")
    public R save(@RequestBody UserEntity user){
		userService.save(user);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("smartfarm-device:user:update")
    public R update(@RequestBody UserEntity user){
		userService.updateById(user);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("smartfarm-device:user:delete")
    public R delete(@RequestBody Integer[] ids){
		userService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
