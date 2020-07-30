package com.jinhua.kblog.base.service;

import com.jinhua.kblog.web.vo.AccountProfile;
import com.jinhua.kblog.web.vo.UserVo;

public interface UserService {

    /**
     * 登录
     */
    AccountProfile login(String username, String password);

    /**
     * 登录，用于记住登录时获取用户信息
     */
    AccountProfile findProfile(Long id);

    /**
     * 注册
     * @param user
     */
    UserVo register(UserVo user);

    /**
     * 修改密码
     */
    void updatePassword(long id, String newPassword);

    /**
     * 修改密码
     * @param id
     * @param oldPassword
     * @param newPassword
     */
    void updatePassword(long id, String oldPassword, String newPassword);

    /**
     * 修改用户状态
     */
    void updateStatus(long id, int status);

    long count();
}
