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
public class PermUserModel implements Serializable {
	private static final long serialVersionUID = 1L;

	//columns START
	private java.lang.Integer userId;//"userId"

	private java.lang.Integer userCode;//"用户编号"

	private java.lang.String userName;//"用户名称"

	private java.lang.String password;//"登录密码"

	private java.lang.String status;//"状态，0:表示无效，1：表示有效"

	private java.lang.String roleId;//"当前用户有哪些角色，保存角色Id集合,2:代表普通供应商用户，1：代表管理员用户"

	private java.lang.String description;//"description"

	private java.lang.String userType;//"userType"

	private java.lang.String nickName;//"用户昵称"

	private java.lang.String mobilePhone;//"手机号码"

	private java.lang.String email;//"邮箱"

	private java.lang.String md5Pwd;//"pwd md5 加密"

	private java.util.Date ctime;//"创建时间"

	private java.util.Date utime;//"utime"

	//columns END
		
	public void setUserId(java.lang.Integer userId) {
		this.userId = userId;
	}

	public java.lang.Integer getUserId() {
		return this.userId;
	}
		
	public void setUserCode(java.lang.Integer userCode) {
		this.userCode = userCode;
	}

	public java.lang.Integer getUserCode() {
		return this.userCode;
	}
		
	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}

	public java.lang.String getUserName() {
		return this.userName;
	}
		
	public void setPassword(java.lang.String password) {
		this.password = password;
	}

	public java.lang.String getPassword() {
		return this.password;
	}
		
	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getStatus() {
		return this.status;
	}
		
	public void setRoleId(java.lang.String roleId) {
		this.roleId = roleId;
	}

	public java.lang.String getRoleId() {
		return this.roleId;
	}
		
	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getDescription() {
		return this.description;
	}
		
	public void setUserType(java.lang.String userType) {
		this.userType = userType;
	}

	public java.lang.String getUserType() {
		return this.userType;
	}
		
	public void setNickName(java.lang.String nickName) {
		this.nickName = nickName;
	}

	public java.lang.String getNickName() {
		return this.nickName;
	}
		
	public void setMobilePhone(java.lang.String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public java.lang.String getMobilePhone() {
		return this.mobilePhone;
	}
		
	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getEmail() {
		return this.email;
	}
		
	public void setMd5Pwd(java.lang.String md5Pwd) {
		this.md5Pwd = md5Pwd;
	}

	public java.lang.String getMd5Pwd() {
		return this.md5Pwd;
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

