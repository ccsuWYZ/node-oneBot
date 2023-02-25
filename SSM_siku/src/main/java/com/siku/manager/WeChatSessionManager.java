//package com.siku.manager;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.shiro.web.servlet.ShiroHttpServletRequest;
//import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
//import org.apache.shiro.web.util.WebUtils;
//
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import java.io.Serializable;
////添加WxSessionManager，解决微信没有浏览器session，人工将session放入request请求head中之后，
//// 后台session获取的问题，经过该类处理，shiro会自动将抓取的session与服务端比较
//@Slf4j
//public class WeChatSessionManager extends DefaultWebSessionManager {
//
//    public final static String HEADER_TOKEN_NAME = "JSessionId";
//    private static final String REFERENCED_SESSION_ID_SOURCE = "Stateless request";
//
//    /**
//     * 逻辑:
//     *     如果请求头中有 JSessionId，就分析它；
//     *     没有就调用父类的方法
//     */
//    @Override
//    protected Serializable getSessionId(ServletRequest request, ServletResponse response){
//        String JSessionId = WebUtils.toHttp(request).getHeader(HEADER_TOKEN_NAME);
//
//        if(JSessionId == null) {
//            return super.getSessionId(request, response);
//        } else {
//            System.out.println("!=null");
//            request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_SOURCE,REFERENCED_SESSION_ID_SOURCE);
//            request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID, JSessionId);
//            log.info("JSessionId: {}", JSessionId);
//            request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_IS_VALID, Boolean.TRUE);
//            return JSessionId;
//        }
//    }
//
//}
