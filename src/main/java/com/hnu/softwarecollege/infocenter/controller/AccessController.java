package com.hnu.softwarecollege.infocenter.controller;


import com.hnu.softwarecollege.infocenter.entity.vo.BaseResponseVo;
import com.hnu.softwarecollege.infocenter.entity.vo.LoginForm;
import com.hnu.softwarecollege.infocenter.service.UserService;
import com.hnu.softwarecollege.infocenter.util.TokenUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping("access")
public class AccessController {

    @Resource
    UserService userService;


    /**
    * @Description:  生成跨域cookie
    * @Param: [name, value]
    * @return: javax.servlet.http.Cookie
    * @Author: yu
    * @Date: 2018/11/9 2:30
    **/
    private Cookie getCookie(String name,String value){
        Cookie cookie = new Cookie(name,value);
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        return cookie;
    }

    /** 
    * @Description: 用户登录 登录生成token，放于cookie中返回，生成上下文用户对象，filter使用该上下文验证用户
    * @Param: [loginForm] 
    * @return: com.hnu.softwarecollege.infocenter.entity.vo.BaseResponseVo 
    * @Author: yu 
    * @Date: 2018/11/7 
    **/
    @PostMapping("login")
    @ResponseBody
    public BaseResponseVo login(
            @RequestBody @Valid LoginForm loginForm,
            HttpServletResponse response){
        //will set userContext
        boolean isTrue = userService.verifyUser(loginForm);
        if(isTrue){
            String token = TokenUtil.createToken();
            response.addCookie(getCookie("token",token));
            return BaseResponseVo.success("login success");
        }else {
            return BaseResponseVo.fail("login fail");
        }
    }
}
