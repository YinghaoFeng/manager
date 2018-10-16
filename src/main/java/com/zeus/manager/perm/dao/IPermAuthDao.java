/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.zeus.manager.perm.dao;
import com.zeus.manager.perm.model.PermAuthModel;
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
public interface IPermAuthDao {

	public int insert(PermAuthModel permAuth);

	public int update(PermAuthModel permAuth);

	public PermAuthModel getById(@Param("id")Integer id);

	public int delete(@Param("id")Integer id);
	
	public List<PermAuthModel> find(Map<String, Object> param);
	
}
