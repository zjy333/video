package com.zhiyou.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhiyou.mapper.SpeakerMapper;
import com.zhiyou.model.Speaker;
import com.zhiyou.service.SpeakerService;

@Service
public class SpeakerServiceImpl implements SpeakerService{

	@Resource
	SpeakerMapper mapper;

	public void add(Speaker speaker) {
		
		mapper.add(speaker);
		
	}

	public void update(Speaker speaker) {
		
		mapper.update(speaker);
		
	}

	public void delete(int id) {
		
		mapper.delete(id);
		
	}

	public void deletes(int[] ids) {

     mapper.deletes(ids);
		
	}

	public List<Speaker> selectAll(int page, int num) {
	
		return mapper.selectAll(page, num);
		
	}

	public List<Speaker> selectLikeName(String speaker_name) {
	
		return mapper.selectLikeName(speaker_name);
		
	}

	public Speaker selectById(int id) {
		
		return mapper.selectById(id);
		
	}

	public Integer selectCount() {
		
		return mapper.selectCount();
		
	}
	
	
}
