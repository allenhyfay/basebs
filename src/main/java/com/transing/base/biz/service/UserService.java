package com.transing.base.biz.service;

import com.jeeframework.logicframework.biz.service.BizService;
import com.transing.base.integration.bo.User;
import com.transing.base.web.filter.GetUsersFilter;

import java.util.List;

/**
 * @author lanceyan
 * @version 1.0
 */
public interface UserService extends BizService {

    /**
     * 简单描述：根据userFilter返回用户对象列表
     * <p/>
     *
     * @param getUsersFilter
     * @
     */
    List<User> getUsers(GetUsersFilter getUsersFilter);
    /**
     * 简单描述：根据userFilter返回用户列表数量
     * <p/>
     *
     * @param getUsersFilter
     * @
     */
    long getUsersCount(GetUsersFilter getUsersFilter);

}