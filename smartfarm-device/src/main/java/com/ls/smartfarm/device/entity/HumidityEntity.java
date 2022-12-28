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
@TableName("farm_humidity")
public class HumidityEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 设备表主键
	 */
	private Integer deviceId;
	/**
	 * 湿度
	 */
	private Float data;
	/**
	 * 存库日期
	 */
	private Date createTime;

}
