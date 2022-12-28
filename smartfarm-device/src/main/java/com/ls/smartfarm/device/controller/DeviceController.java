package com.ls.smartfarm.device.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Map;
import com.ls.smartfarm.common.utils.PageUtils;
import com.ls.smartfarm.common.utils.R;
import com.ls.smartfarm.device.Vo.DeviceInfoVo;
import com.ls.smartfarm.device.entity.DeviceEntity;
import com.ls.smartfarm.device.service.DeviceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 
 *
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:20
 */
@Slf4j
@RestController
@RequestMapping("device/device")
public class DeviceController {
    @Autowired
    private DeviceService deviceService;

    @GetMapping("/data")
    public R data(@RequestParam Map<String, Object> params){

        Integer did =  Integer.parseInt((String) params.get("did"));
        String type = (String) params.get("type");
        Integer size = Integer.parseInt((String) params.get("size"));

        log.info(type.toString(), did);

        return deviceService.getdevicedata(type,did,size);
    }



    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("smartfarm-device:device:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = deviceService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("smartfarm-device:device:info")
    public R info(@PathVariable("id") Integer id){
		DeviceEntity device = deviceService.getById(id);

        DeviceInfoVo deviceVo = new DeviceInfoVo();
        BeanUtils.copyProperties(device,deviceVo);


        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String data = formatter.format(device.getCreateTime());

        deviceVo.setCreateTime(data);

        return R.ok().put("device", deviceVo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("smartfarm-device:device:save")
    public R save(@RequestBody DeviceEntity device){
		deviceService.save(device);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("smartfarm-device:device:update")
    public R update(@RequestBody DeviceEntity device){
		deviceService.updateById(device);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("smartfarm-device:device:delete")
    public R delete(@RequestBody Integer[] ids){
		deviceService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
