/**
 * 
 */
package com.tzl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tzl.model.UserPO;
import com.tzl.service.IUserService;

/**
 * @author tangzhilong
 *
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userService ;
    
    @RequestMapping("/User/helloUser")
    public String helloUser(ModelMap modelMap) {
        List<UserPO> list = this.userService.findAllUser();
        modelMap.addAttribute("userDo", list) ;
        return "/user_list";
    }
}
