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
import com.zeus.manager.perm.model.PermUserModel;
import java.util.*;
import com.zeus.manager.perm.dao.*;
import com.zeus.manager.perm.service.*;

/**
 * @author  fengyinghao
 * @version 1.0
 * @since 1.0
 */

@Service("permUserService")
public class PermUserServiceImpl implements IPermUserService{
	@Autowired
	private IPermUserDao permUserDao;

	public int insert(PermUserModel permUser) {
		if(permUser == null) {
			return 0;
		}
		return permUserDao.insert(permUser);
	}
	
	public int update(PermUserModel permUser) {
		if(permUser == null) {
			return 0;
		}
		return permUserDao.update(permUser);
	}
	
	public PermUserModel getById(Integer id) {
		if(id == null) {
			return null;
		}
		return permUserDao.getById(id);
	}

	public int removeByUserId(Integer id) {
		if(id == null) {
			return 0;
		}
		return permUserDao.delete(id);
	}	

	public List<PermUserModel> find(Map<String, Object> param) {
		return permUserDao.find(param);
	}
	
}
