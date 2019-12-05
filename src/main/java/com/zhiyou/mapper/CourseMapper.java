package com.zhiyou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhiyou.model.Course;

public interface CourseMapper {

	
	void add(Course course);
	
	void update(Course course);
	
	void delete(int id);
	
	void deletes(int [] ids);
	
	List<Course>selectAll(@Param("page")int page,@Param("num")int num);
	
	Course selectById(int id);
	
	List<Course>selectLikeName(String course_title);
	
	Integer selectCount();
	
}
