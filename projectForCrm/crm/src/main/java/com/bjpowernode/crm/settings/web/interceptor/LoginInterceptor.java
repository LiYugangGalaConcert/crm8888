package com.bjpowernode.crm.settings.web.interceptor;

import com.bjpowernode.crm.commons.Contants;
import com.bjpowernode.crm.settings.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 周伦杰
 * 2021/8/30
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登录验证
        HttpSession session=request.getSession();
        User user=(User)session.getAttribute(Contants.SESSION_USER);

        if(user==null){//如果没登录过，跳转到登录页面

            response.sendRedirect(request.getContextPath());// 获取的字符串：/应用名字   /crm
            return false;
        }
        //如果已经登录过，则放行
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
