package com.bf.service.mod;

import com.bf.base.BaseFinder;
import com.bf.common.PageView;
import com.bf.po.module.Module;

public interface ModServiceFinder extends BaseFinder<Module> {
	
	//���ݱ��� ��ʾ��ģ�����ģ��
	public PageView<Module> findPageByFlag(int mid,int pageNo,int pageSize);

}
