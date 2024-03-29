package com.example.demo.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

@TableName("t_sys_permission_role")//数据库对应表名，关联表
public class RolePermission {
	
	@TableId
	private String id;//@TableId表示主键，与字段名称大小写一致	
	private String sys_role_id;//与字段名称大小写一致
	private String sys_permission_id;//与字段名称大小写一致
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSys_role_id() {
		return sys_role_id;
	}
	public void setSys_role_id(String sys_role_id) {
		this.sys_role_id = sys_role_id;
	}
	public String getSys_permission_id() {
		return sys_permission_id;
	}
	public void setSys_permission_id(String sys_permission_id) {
		this.sys_permission_id = sys_permission_id;
	}
	
}
