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
@TableName("farm_threshold")
public class ThresholdEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 设备主键

	 */
	private Integer deviceId;
	/**
	 * 0 : temperature
1 : humidity

	 */
	private Integer type;
	/**
	 * 不同用户可以设置不同的报警值
	 */
	private Integer userId;
	/**
	 * 最大值
	 */
	private Float maxValue;
	/**
	 * 最小值
	 */
	private Float minValue;
	/**
	 * 是在最小值和最大值时报警,
还是说不在这个范围的时候报警.
0: 区间报警
1: 非区间报警
	 */
	private Integer flag;

}
