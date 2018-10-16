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
public class PermUserGroupModel implements Serializable {
	private static final long serialVersionUID = 1L;

	//columns START
	private java.lang.Integer id;//"主键ID"

	private java.lang.String name;//"模板名称"

	private java.lang.Integer type;//"模板数据类型：1、部门；2、分类；3、品牌；"

	private java.lang.String authIds;//"权限id集合"

	private java.lang.String intro;//"描述"

	private java.lang.Boolean status;//"状态:0、使用，1、未使用"

	private java.lang.String operater;//"创建人"

	private java.lang.String lastOperater;//"最后操作人"

	private java.util.Date ctime;//"创建时间"

	private java.util.Date utime;//"utime"

	//columns END
		
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.Integer getId() {
		return this.id;
	}
		
	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getName() {
		return this.name;
	}
		
	public void setType(java.lang.Integer type) {
		this.type = type;
	}

	public java.lang.Integer getType() {
		return this.type;
	}
		
	public void setAuthIds(java.lang.String authIds) {
		this.authIds = authIds;
	}

	public java.lang.String getAuthIds() {
		return this.authIds;
	}
		
	public void setIntro(java.lang.String intro) {
		this.intro = intro;
	}

	public java.lang.String getIntro() {
		return this.intro;
	}
		
	public void setStatus(java.lang.Boolean status) {
		this.status = status;
	}

	public java.lang.Boolean getStatus() {
		return this.status;
	}
		
	public void setOperater(java.lang.String operater) {
		this.operater = operater;
	}

	public java.lang.String getOperater() {
		return this.operater;
	}
		
	public void setLastOperater(java.lang.String lastOperater) {
		this.lastOperater = lastOperater;
	}

	public java.lang.String getLastOperater() {
		return this.lastOperater;
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

