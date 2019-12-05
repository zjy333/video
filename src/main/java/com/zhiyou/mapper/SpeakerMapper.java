package com.zhiyou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhiyou.model.Speaker;

public interface SpeakerMapper {
	
	void add(Speaker speaker);
	
	void update(Speaker speaker);
	
	void delete (int id);
		
    void deletes (int[] ids);
    
    List<Speaker> selectAll(@Param("page")int page , @Param("num")int num);
    
    List<Speaker> selectLikeName(String speaker_name);
    
    Speaker selectById(int id);
    
    Integer selectCount();
}
