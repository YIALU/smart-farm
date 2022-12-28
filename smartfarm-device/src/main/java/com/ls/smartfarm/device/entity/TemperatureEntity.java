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
 * @date 2022-12-12 14:27:19
 */
@Data
@TableName("farm_temperature")
public class TemperatureEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 硬件ID
	 */
	private Integer deviceId;
	/**
	 * 温度
	 */
	private Float data;
	/**
	 * 存库日期
	 */
	private Date createTime;

}
