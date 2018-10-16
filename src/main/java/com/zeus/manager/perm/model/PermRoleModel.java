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
public class PermRoleModel implements Serializable {
	private static final long serialVersionUID = 1L;

	//columns START
	private java.lang.Integer id;//"id"

	private java.lang.String title;//"角色名称"

	private java.lang.String intro;//"描述"

	private java.lang.Integer status;//"状态:0-使用 1-未使用"

	private java.util.Date ctime;//"创建时间"

	private java.util.Date utime;//"utime"

	//columns END
		
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.Integer getId() {
		return this.id;
	}
		
	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	public java.lang.String getTitle() {
		return this.title;
	}
		
	public void setIntro(java.lang.String intro) {
		this.intro = intro;
	}

	public java.lang.String getIntro() {
		return this.intro;
	}
		
	public void setStatus(java.lang.Integer status) {
		this.status = status;
	}

	public java.lang.Integer getStatus() {
		return this.status;
	}
		
	public void setCtime(java.util.Date ctime) {
		this.ctime = ctime;
	}

	public java.util.Date getCtime() {
		return this.ctime;
	}
		
	public void setUtime(java.util.Date utime) {
		this.utime = utime;
	}

	public java.util.Date getUtime() {
		return this.utime;
	}

	public Map<String, Object> getParam() {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("", "");
		return param;
	}
}

