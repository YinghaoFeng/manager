/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.zeus.manager.perm.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zeus.manager.perm.model.PermRoleUserModel;
import java.util.*;
import com.zeus.manager.perm.dao.*;
import com.zeus.manager.perm.service.*;

/**
 * @author  fengyinghao
 * @version 1.0
 * @since 1.0
 */

@Service("permRoleUserService")
public class PermRoleUserServiceImpl implements IPermRoleUserService{
	@Autowired
	private IPermRoleUserDao permRoleUserDao;

	public int insert(PermRoleUserModel permRoleUser) {
		if(permRoleUser == null) {
			return 0;
		}
		return permRoleUserDao.insert(permRoleUser);
	}
	
	public int update(PermRoleUserModel permRoleUser) {
		if(permRoleUser == null) {
			return 0;
		}
		return permRoleUserDao.update(permRoleUser);
	}
	
	public PermRoleUserModel getById(Integer id) {
		if(id == null) {
			return null;
		}
		return permRoleUserDao.getById(id);
	}

	public int removeById(Integer id) {
		if(id == null) {
			return 0;
		}
		return permRoleUserDao.delete(id);
	}	

	public List<PermRoleUserModel> find(Map<String, Object> param) {
		return permRoleUserDao.find(param);
	}
	
}
