/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.zeus.manager.perm.service;

import com.zeus.manager.perm.model.PermUserModel;
import java.util.*;
import com.zeus.manager.perm.dao.*;
import com.zeus.manager.perm.service.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @author  fengyinghao
 * @version 1.0
 * @since 1.0
 */

@Service
public interface IPermUserService{

	public int insert(PermUserModel permUser);

	public int update(PermUserModel permUser);

	public PermUserModel getById(Integer userId);

	public int removeByUserId(Integer value);

	public List<PermUserModel> find(Map<String, Object> param);
}
