/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.zeus.manager.perm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zeus.manager.perm.model.PermAuthModel;
import java.util.*;
import com.zeus.manager.perm.dao.*;
import com.zeus.manager.perm.service.*;

/**
 * @author  fengyinghao
 * @version 1.0
 * @since 1.0
 */

@Service("permAuthService")
public class PermAuthServiceImpl implements IPermAuthService{
	@Autowired
	private IPermAuthDao permAuthDao;

	public int insert(PermAuthModel permAuth) {
		if(permAuth == null) {
			return 0;
		}
		return permAuthDao.insert(permAuth);
	}
	
	public int update(PermAuthModel permAuth) {
		if(permAuth == null) {
			return 0;
		}
		return permAuthDao.update(permAuth);
	}
	
	public PermAuthModel getById(Integer id) {
		if(id == null) {
			return null;
		}
		return permAuthDao.getById(id);
	}

	public int removeById(Integer id) {
		if(id == null) {
			return 0;
		}
		return permAuthDao.delete(id);
	}	

	public List<PermAuthModel> find(Map<String, Object> param) {
		return permAuthDao.find(param);
	}
	
}
