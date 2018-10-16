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
import com.zeus.manager.perm.model.PermRoleAuthModel;
import java.util.*;
import com.zeus.manager.perm.dao.*;
import com.zeus.manager.perm.service.*;

/**
 * @author  fengyinghao
 * @version 1.0
 * @since 1.0
 */

@Service("permRoleAuthService")
public class PermRoleAuthServiceImpl implements IPermRoleAuthService{
	@Autowired
	private IPermRoleAuthDao permRoleAuthDao;

	public int insert(PermRoleAuthModel permRoleAuth) {
		if(permRoleAuth == null) {
			return 0;
		}
		return permRoleAuthDao.insert(permRoleAuth);
	}
	
	public int update(PermRoleAuthModel permRoleAuth) {
		if(permRoleAuth == null) {
			return 0;
		}
		return permRoleAuthDao.update(permRoleAuth);
	}
	
	public PermRoleAuthModel getById(Integer id) {
		if(id == null) {
			return null;
		}
		return permRoleAuthDao.getById(id);
	}

	public int removeById(Integer id) {
		if(id == null) {
			return 0;
		}
		return permRoleAuthDao.delete(id);
	}	

	public List<PermRoleAuthModel> find(Map<String, Object> param) {
		return permRoleAuthDao.find(param);
	}
	
}
