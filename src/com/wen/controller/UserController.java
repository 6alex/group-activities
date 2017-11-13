package com.wen.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wen.po.User;
import com.wen.service.UserService;

@Controller
public class UserController {
	@Resource
	UserService us;
	@RequestMapping("/login")
	public String login(Model model,User user,HttpServletRequest request){
		if(!user.getName().equals("")&&!user.getPwd().equals("")){
			User login = us.login(user);
			if(login!=null){
			request.getSession().setAttribute("user", login);
			model.addAttribute("user", login);
			return "/views/index.jsp";
			}else{
				model.addAttribute("msg", "用户名或者密码错误！");
				return "/";
			}
		}else{
			
			model.addAttribute("msg", "用户名或者密码为空！");
			return "/";
		}
		
		
	}
}
