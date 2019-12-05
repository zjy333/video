package com.zhiyou.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhiyou.mapper.VideoMapper;
import com.zhiyou.model.Video;
import com.zhiyou.service.VideoService;
@Service
public class VideoServiceImpl implements VideoService{

	@Resource
	VideoMapper mapper;

	public void add(Video video) {
		
		mapper.add(video);
		
	}

	public void update(Video video) {
	
		mapper.update(video);
		
	}

	public void delete(int id) {

        mapper.delete(id);
		
	}

	public void deletes(int[] ids) {
		
		mapper.deletes(ids);
		
	}

	public List<Video> selectAll(int page, int num) {
		
		return mapper.selectAll(page, num);
		
	}

	public Video selectById(int id) {
	
		return mapper.selectById(id);
		
	}

	public List<Video> selectLikeName(String title) {
	
		return mapper.selectLikeName(title);
		
	}

	public Integer selectCount() {
		
		return mapper.selectCount();
		
	}
	
}
