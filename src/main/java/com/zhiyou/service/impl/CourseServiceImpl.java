package com.zhiyou.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhiyou.mapper.CourseMapper;
import com.zhiyou.model.Course;
import com.zhiyou.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Resource
	CourseMapper mapper;
	
	
	public void add(Course course) {
		
		mapper.add(course);
		
	}

	public void update(Course course) {
		
		mapper.update(course);
		
	}

	public void delete(int id) {

   mapper.delete(id);
		
	}

	public void deletes(int[] ids) {
		
		mapper.deletes(ids);
		
	}

	public List<Course> selectAll(int page,int num) {
		
		return selectAll(page, num);
	
	}

	public Course selectById(int id) {
		
		return selectById(id);
		
	}

	public List<Course> selectLikeName(String course_title) {
		
		return mapper.selectLikeName(course_title);
		
	}

	public Integer selectCount() {
		
		return mapper.selectCount();
		
	}
		

	
}
