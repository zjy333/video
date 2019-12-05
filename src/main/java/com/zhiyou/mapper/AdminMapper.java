package com.zhiyou.mapper;

import com.zhiyou.model.Admin;

public interface AdminMapper {
	
	Admin selectByUserName(String accounts);

}
