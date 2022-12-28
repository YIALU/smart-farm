package com.ls.smartfarm.device.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("farm_user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户表id
	 */
	@TableId
	private Integer id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 用户密码，MD5加密
	 */
	private String password;
	/**
	 * 
	 */
	private String email;
	/**
	 * 
	 */
	private String phone;
	/**
	 * 
	 */
	private String address;
	/**
	 * 角色0-在线,1-离线,2-禁用
	 */
	private Integer status;
	/**
	 * 找回密码问题
	 */
	private String question;
	/**
	 * 找回密码答案
	 */
	private String answer;
	/**
	 * 角色0-管理员,1-普通用户
	 */
	private Integer role;
	/**
	 * 头像
	 */
	private String avatar;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 最后一次更新时间
	 */
	private Date updateTime;
	/**
	 * 微信名称
	 */
	private String weixin;

}
