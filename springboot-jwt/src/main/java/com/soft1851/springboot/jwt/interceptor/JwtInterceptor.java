package com.soft1851.springboot.jwt.interceptor;

import com.auth0.jwt.exceptions.InvalidClaimException;
import com.soft1851.springboot.jwt.common.ResultCode;
import com.soft1851.springboot.jwt.util.JwtTokenUtil;
import com.soft1851.springboot.jwt.exception.JwtException;
import com.soft1851.springboot.jwt.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jh_wu
 * @ClassName JwtInterceptor
 * @Description TODO
 * @Date 2020/4/15:16:54
 * @Version 1.0
 **/
@Slf4j
@Component
public class JwtInterceptor implements HandlerInterceptor {
    @Resource
    private AdminService adminService;

    /**
     * 前置处理，拦截请求
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("Authorization");
        //认证
        if (token == null) {
            log.info("### 用户未登录，请先登录 ###");
            //通过自定义异常抛出未登录的信息，有全局统一处理
            throw new JwtException("用户未登录，请先登录", ResultCode.USER_NOT_SIGN_IN);
        }
        else {
            log.info("## token = {}",token);
            //鉴权
            if (!adminService.checkRole(JwtTokenUtil.getUserRole(token))) {
                log.info("### 用户权限不足 ###");
                //通过自定义异常抛出权限不足的信息，由全局统一处理
             throw new JwtException("用户权限不足", ResultCode.USER_NO_AUTH);
            } else {
//                if (JwtTokenUtil.isExpiration(token))
//                {
//                    log.info("### token已失效 ###");
////                    //通过自定义异常抛出token失效的信息，由全局统一处理
////                    throw new JwtException("token已失效",ResultCode.USER_TOKEN_EXPIRES);
//                    throw new InvalidClaimException("Token已失效");
//
//                }else {
                    //通过认证，放行到controller层
                    return true;
                }
            }
    }
}
