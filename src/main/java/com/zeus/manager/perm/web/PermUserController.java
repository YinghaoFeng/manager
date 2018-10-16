/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.zeus.manager.perm.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zeus.manager.common.param.ResultParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zeus.manager.perm.model.PermUserModel;

import java.util.*;

import com.zeus.manager.perm.dao.*;
import com.zeus.manager.perm.service.*;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author fengyinghao
 * @version 1.0
 * @since 1.0
 */

@Controller
@RequestMapping(value = "/permUser")
public class PermUserController {

    @Autowired
    private IPermUserService permUserService;

    @RequestMapping(value = "/getUser", method = { RequestMethod.GET })
    @ResponseBody
    public ResultParam getUser(@RequestParam(value = "userId", required = false) Integer userId) {
        PermUserModel byId = permUserService.getById(userId);
        return ResultParam.data(byId);
    }

    @RequestMapping(value = "/user/list", method = { RequestMethod.GET })
    @ResponseBody
    public ResultParam getUserList(@RequestParam(value = "pageNo", required = false, defaultValue = "1") Integer pageNo,
            @RequestParam(value = "pageSize", required = false, defaultValue = "20") Integer pageSize) {

        Map<String, Object> param = new HashMap<>();
        param.put("pageNo", (pageNo - 1) * pageSize);
        param.put("pageSize", pageSize);
        List<PermUserModel> permUserModels = permUserService.find(param);
        return ResultParam.data(permUserModels);
    }

}
