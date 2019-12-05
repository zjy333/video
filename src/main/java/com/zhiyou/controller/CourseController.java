package com.zhiyou.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.model.Course;
import com.zhiyou.service.CourseService;

@Controller
 
public class CourseController {

	@Resource
	CourseService service;
	
	@RequestMapping("CourseShow")
       public String show (int page,HttpServletRequest req ,HttpServletResponse res) {
		
		int count = service.selectCount();
		
		req.setAttribute("list", service.selectAll((page-1)*5,5));
		
		return "show";
		
	}
	
	@RequestMapping("CourseLikeName")
	public String likename(String course_title,HttpServletRequest req, HttpServletResponse res){
		
		service.selectLikeName(course_title);
		
		return "redirect:show";
		
	}
	
	
	@RequestMapping("CourseAdd")
       public String add(Course course,HttpServletRequest req, HttpServletResponse res) {
   		
   		service.add(course);
   		
   		return "redirect:show";	
   		
   	}
	
	@RequestMapping("CourseUpdate")
	  public String update(Course course,HttpServletRequest req, HttpServletResponse res) {
		
		service.update(course);
		
		return "redirect:show";
	
	}
		
	 @RequestMapping("CourseDelete")
	  public String delete(int id, HttpServletRequest req, HttpServletResponse res) {
		 
		 service.delete(id);
		 
		 return "redirect:show";
		 
	 }
		
	@RequestMapping("CourseDeletes")
	 public String deletes(int [] ids , HttpServletRequest req, HttpServletResponse res) {
		
		service.deletes(ids);;
		
		return "redirect:show";
		
	}
	
	
	@RequestMapping("CourseSelectById")
	  public String selectById(int id , HttpServletRequest req, HttpServletResponse res) {
		
		service.selectById(id);
		
		return "update";
		
	}
		
		
	}
		

