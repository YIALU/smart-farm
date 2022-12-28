package com.ls.smartfarm.smartfarm

-device.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 大棚管理
 * 
 * @author ls
 * @email 2210987889@qq.com
 * @date 2022-12-12 14:27:20
 */
@Data
@TableName("farm_greenhouse")
public class GreenhouseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private Integer userId;

}
