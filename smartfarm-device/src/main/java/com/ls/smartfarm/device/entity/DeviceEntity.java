package com.ls.smartfarm.smartfarm

-device.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:20
 */
@Data
@TableName("farm_device")
public class DeviceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

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
	private Integer model;
	/**
	 * 认证token
	 */
	private String token;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;
	/**
	 * 经度
	 */
	private Float lng;
	/**
	 * 纬度
	 */
	private Float lat;

}
