package com.bf.service.mod;

import com.bf.base.BaseFinder;
import com.bf.common.PageView;
import com.bf.po.module.Module;

public interface ModServiceFinder extends BaseFinder<Module> {
	
	//根据变量 显示父模块或子模块
	public PageView<Module> findPageByFlag(int mid,int pageNo,int pageSize);

}
