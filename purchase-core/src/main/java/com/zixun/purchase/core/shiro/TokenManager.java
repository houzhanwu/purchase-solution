package com.zixun.purchase.core.shiro;

import com.zixun.purchase.model.UserInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;

/**
 * @description:
 * @author: tiger
 * @date: 18-1-10 下午2:01
 * @version: V1.0
 * @modified by:
 */
public class TokenManager {
    /**
     * 获取当前登录用户信息
     *
     * @return
     */
    public static UserInfo getLoginUser() {
        UserInfo userInfo = (UserInfo) SecurityUtils.getSubject().getPrincipal();

        return userInfo;
    }

    /**
     * 获取当前登录用户的ID
     *
     * @return
     */
    public static long getUserId() {
        return getLoginUser().getId();
    }

    /**
     * 获取当前登录用户名
     *
     * @return
     */
    public static String getUserName() {
        return getLoginUser().getUsername();
    }

    /**
     * 判断是否登录
     *
     * @return
     */
    public static boolean isLogin() {
        return null != SecurityUtils.getSubject().getPrincipal();
    }

    /**
     * 退出登录
     */
    public static void logout() {
        SecurityUtils.getSubject().logout();
    }

    /**
     * 清除授权缓存
     */
    public static void ClearAuthorizationCache() {
        DefaultWebSecurityManager manager = (DefaultWebSecurityManager) SecurityUtils.getSecurityManager();
        manager.getCacheManager().getCache(StaticConfig.AUTHORIZATIONCACHE_NAME).clear();
    }
}
