package com.ls.smartfarm.device.Vo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author ls
 * @create 2022-12-14-23:30
 */
@Data
public class DeviceInfoVo {
    /**
     * 设备id
     */
    @TableId
    private Integer id;
    /**
     * 硬件ID
     */
    private String did;
    /**
     * 设备型号
     */
    private String model;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private String createTime;
    /**
     *
     */
    private String updateTime;
    /**
     *是否开启
     */
    private Integer isRun;

}
