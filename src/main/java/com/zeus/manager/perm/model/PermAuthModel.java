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
public class PermAuthModel implements Serializable {
	private static final long serialVersionUID = 1L;

	//columns START
	private java.lang.Integer id;//"id"

	private java.lang.String title;//"权限名称name/前端"

	private java.lang.String mask;//"权限码，中间以逗号分隔"

	private java.lang.Integer parentId;//"两级权限，父权限ID"

	private java.lang.String url;//"权限链接/前端"

	private java.lang.String location;//"权限链接/后端"

	private java.lang.Integer type;//"类型   0：目录   1：菜单   2：按钮"

	private java.lang.Integer system;//"所属系统"

	private java.lang.Integer sort;//"排序"

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
		
	public void setMask(java.lang.String mask) {
		this.mask = mask;
	}

	public java.lang.String getMask() {
		return this.mask;
	}
		
	public void setParentId(java.lang.Integer parentId) {
		this.parentId = parentId;
	}

	public java.lang.Integer getParentId() {
		return this.parentId;
	}
		
	public void setUrl(java.lang.String url) {
		this.url = url;
	}

	public java.lang.String getUrl() {
		return this.url;
	}
		
	public void setLocation(java.lang.String location) {
		this.location = location;
	}

	public java.lang.String getLocation() {
		return this.location;
	}
		
	public void setType(java.lang.Integer type) {
		this.type = type;
	}

	public java.lang.Integer getType() {
		return this.type;
	}
		
	public void setSystem(java.lang.Integer system) {
		this.system = system;
	}

	public java.lang.Integer getSystem() {
		return this.system;
	}
		
	public void setSort(java.lang.Integer sort) {
		this.sort = sort;
	}

	public java.lang.Integer getSort() {
		return this.sort;
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

