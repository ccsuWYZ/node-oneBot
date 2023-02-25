//package com.siku.realm;
//
//import com.siku.pojo.User;
//import com.siku.service.UserService;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.shiro.authc.*;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//import org.apache.shiro.util.ByteSource;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import javax.annotation.Resource;
//
//@Slf4j
//public class MyRealm extends AuthorizingRealm {
//
//    @Autowired
//
//
//    @Resource
//    private UserService userService;
//
//
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        return null;
//    }
//
//    //自定义登录认证
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
//            throws AuthenticationException {
//        //令牌信息
//        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
//
//        //查找用户
//        User user = userService.getUserByOpenId(usernamePasswordToken.getUsername());
//
//
//
//        if (user == null) {//未注册
//            throw new AccountException();
//        }
//        ByteSource saltOfCredential = ByteSource.Util.bytes(user.getNickName());
//        //认证对象
//        return new SimpleAuthenticationInfo(user, String.valueOf(usernamePasswordToken.getPassword()),
//                saltOfCredential, getName());
//    }
//}
//
