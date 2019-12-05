package com.zhiyou.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhiyou.mapper.AdminMapper;
import com.zhiyou.model.Admin;
import com.zhiyou.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Resource
	AdminMapper mapper;


	public Admin selectByUserName(String accounts) {
		 
  
		return mapper.selectByUserName(accounts);
		
	}
	
	
	

}
