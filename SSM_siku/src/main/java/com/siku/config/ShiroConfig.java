//package com.siku.config;
//
//
//
//import com.siku.manager.WeChatSessionManager;
//import com.siku.realm.MyRealm;
////import org.apache.catalina.Realm;
//import org.apache.shiro.authc.credential.CredentialsMatcher;
//import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
//import org.apache.shiro.mgt.SecurityManager;
//import org.apache.shiro.mgt.SessionsSecurityManager;
//import org.apache.shiro.realm.Realm;
//import org.apache.shiro.session.mgt.SessionManager;
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//public class ShiroConfig {
//
//    @Bean
//    public CredentialsMatcher credentialsMatcher() {
//        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher();
//        matcher.setHashAlgorithmName("MD5");
//        matcher.setHashIterations(1024);
//        return matcher;
//    }
//
//    @Bean
//    public Realm realm(@Qualifier("credentialsMatcher") CredentialsMatcher credentialsMatcher) {
//        MyRealm realm = new MyRealm();
//        realm.setCredentialsMatcher(credentialsMatcher);
//        return new MyRealm();
//    }
//
//    @Bean
//    public WeChatSessionManager sessionManager() {
//        WeChatSessionManager weChatSessionManager = new WeChatSessionManager();
//        return weChatSessionManager;
//    }
//
//    @Bean
//    public SessionsSecurityManager securityManager(@Qualifier("realm") Realm realm,
//                                                   @Qualifier("sessionManager") SessionManager sessionManager) {
//        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
//        securityManager.setRealm(realm);
//        securityManager.setSessionManager(sessionManager);
//        return securityManager;
//    }
//
//    @Bean
//    public ShiroFilterFactoryBean shiroFilter(@Qualifier("securityManager") SecurityManager securityManager) {
//        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
//        shiroFilterFactoryBean.setSecurityManager(securityManager);
//
//        // 设置默认登录的 url（若登录失败，则转到此）
//        shiroFilterFactoryBean.setLoginUrl("/app/noLogin/error");
//        // 设置登录认证成功后默认转到的 url
////        shiroFilterFactoryBean.setSuccessUrl("/admin/index");
//        // 设置权限认证失败时转到的 url
//        shiroFilterFactoryBean.setUnauthorizedUrl("/app/noLogin/noAccess");
//
//        /*
//         * anon：匿名用户可访问
//         * authc：认证用户可访问
//         * user：使用rememberMe可访问
//         * perms：对应权限可访问
//         * roles[角色名]：对应角色权限可访问
//         */
//        //设置访问各 url 的权限
//        Map<String, String> filterChain = new HashMap<>(5);
//
//        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChain);
//
//        return shiroFilterFactoryBean;
//    }
//}
//
