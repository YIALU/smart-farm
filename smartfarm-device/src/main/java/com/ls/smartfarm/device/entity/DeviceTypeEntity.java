package com.ls.smartfarm.device.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 设备类型
 * 
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-25 11:23:59
 */
@Data
@TableName("farm_device_type")
public class DeviceTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 设备类型
	 */
	private String type;

}
