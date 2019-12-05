package com.zhiyou.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.model.Video;
import com.zhiyou.service.VideoService;

@Controller
public class VideoController {

	@Resource
	VideoService service;
	
	@RequestMapping("VideoShow")
	public String show (int page, HttpServletRequest req, HttpServletRequest res) {
	
		req.setAttribute("list", service.selectAll(page, 5));
		
		return "show";
		
}
	
	@RequestMapping("VideoLikeName")
	public String likename(String title,HttpServletRequest req, HttpServletResponse res) {
		
		service.selectLikeName(title);
		
		return "redirect:show";
		
	}
	
	@RequestMapping("VideoAdd")
	public String add(Video video,HttpServletRequest req, HttpServletResponse res) {
		
		service.add(video);
		
		return "redirect:show";
		
	}
	
	@RequestMapping("VideoUpdate")
	public String update(Video video, HttpServletRequest req, HttpServletResponse res) {
		
		service.update(video);
		
		return "redirect:show";
		
	}
	
}
