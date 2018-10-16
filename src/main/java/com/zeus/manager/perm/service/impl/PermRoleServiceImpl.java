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
import com.zeus.manager.perm.model.PermRoleModel;
import java.util.*;
import com.zeus.manager.perm.dao.*;
import com.zeus.manager.perm.service.*;

/**
 * @author  fengyinghao
 * @version 1.0
 * @since 1.0
 */

@Service("permRoleService")
public class PermRoleServiceImpl implements IPermRoleService{
	@Autowired
	private IPermRoleDao permRoleDao;

	public int insert(PermRoleModel permRole) {
		if(permRole == null) {
			return 0;
		}
		return permRoleDao.insert(permRole);
	}
	
	public int update(PermRoleModel permRole) {
		if(permRole == null) {
			return 0;
		}
		return permRoleDao.update(permRole);
	}
	
	public PermRoleModel getById(Integer id) {
		if(id == null) {
			return null;
		}
		return permRoleDao.getById(id);
	}

	public int removeById(Integer id) {
		if(id == null) {
			return 0;
		}
		return permRoleDao.delete(id);
	}	

	public List<PermRoleModel> find(Map<String, Object> param) {
		return permRoleDao.find(param);
	}
	
}
