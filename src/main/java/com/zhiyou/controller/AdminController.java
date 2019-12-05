package com.zhiyou.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.model.Admin;
import com.zhiyou.service.AdminService;

@Controller
public class AdminController {

	@Resource
	AdminService service;
	
	@RequestMapping("AdminLogin")
	public String selectByUserName(@Param("accounts")String accounts,@Param("password")String password,HttpServletRequest req, HttpServletResponse res) {
		
		Admin admin = service.selectByUserName(accounts);
		
		if (admin!=null) {
			if (admin.getPassword().equals(password)) {
				return "videoshow";
			}else {
				req.setAttribute("msg", "密码错误");
				return "index";
			}
			
		}else {
			
			req.setAttribute("msg", "账号不存在");
			return "index";
			
		}
		
		
		
		
		
	}
}
