/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.zeus.manager.perm.dao;
import com.zeus.manager.perm.model.PermUserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.*;
import com.zeus.manager.perm.dao.*;
import com.zeus.manager.perm.service.*;
import org.springframework.stereotype.Component;

/**
 * @author  fengyinghao
 * @version 1.0
 * @since 1.0
 */

@Mapper
public interface IPermUserDao {

	public int insert(PermUserModel permUser);

	public int update(PermUserModel permUser);

	public PermUserModel getById(@Param("userId")Integer id);

	public int delete(@Param("id")Integer id);
	
	public List<PermUserModel> find(Map<String, Object> param);
	
}
