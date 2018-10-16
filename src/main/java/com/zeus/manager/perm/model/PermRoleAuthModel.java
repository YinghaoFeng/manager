/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.zeus.manager.perm.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author  fengyinghao
 * @version 1.0
 * @since 1.0
 */
public class PermRoleAuthModel implements Serializable {
	private static final long serialVersionUID = 1L;

	//columns START
	private java.lang.Integer id;//"id"

	private java.lang.Integer roleId;//"角色id"

	private java.lang.Integer authId;//"权限id"

	//columns END
		
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.Integer getId() {
		return this.id;
	}
		
	public void setRoleId(java.lang.Integer roleId) {
		this.roleId = roleId;
	}

	public java.lang.Integer getRoleId() {
		return this.roleId;
	}
		
	public void setAuthId(java.lang.Integer authId) {
		this.authId = authId;
	}

	public java.lang.Integer getAuthId() {
		return this.authId;
	}

	public Map<String, Object> getParam() {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("", "");
		return param;
	}
}

