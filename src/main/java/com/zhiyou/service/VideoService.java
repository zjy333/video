package com.zhiyou.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhiyou.model.Video;

public interface VideoService {
	
	  void add(Video video);
	  
	  void update(Video video);
	  
	  void delete(int id);
	  
	  void deletes(int[] ids);
	  
	  List<Video> selectAll(@Param("page")int page,@Param("num")int num);
	  
	  Video selectById(int id);
	  
	  List<Video>selectLikeName(String title);
	  
	  Integer selectCount();
	  

}
