/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.zeus.manager.perm.service;

import com.zeus.manager.perm.model.PermRoleAuthModel;
import java.util.*;
import com.zeus.manager.perm.dao.*;
import com.zeus.manager.perm.service.*;
import org.springframework.stereotype.Service;

/**
 * @author  fengyinghao
 * @version 1.0
 * @since 1.0
 */

@Service
public interface IPermRoleAuthService{

	public int insert(PermRoleAuthModel permRoleAuth);

	public int update(PermRoleAuthModel permRoleAuth);

	public PermRoleAuthModel getById(Integer value);

	public int removeById(Integer value);

	public List<PermRoleAuthModel> find(Map<String, Object> param);
}
