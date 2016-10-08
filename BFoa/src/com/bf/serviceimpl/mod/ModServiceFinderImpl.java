package com.bf.serviceimpl.mod;

import org.springframework.stereotype.Service;

import com.bf.base.AbstractFinder;
import com.bf.common.PageView;
import com.bf.po.module.Module;
import com.bf.service.mod.ModServiceFinder;
@Service
public class ModServiceFinderImpl extends AbstractFinder<Module> implements ModServiceFinder {

	@Override
	public PageView<Module> findPageByFlag(int mid, int pageNo, int pageSize) {
		
		if(mid == 0){
			return super.findByPage(Module.class, "from Module m where m.parent =null", pageNo, pageSize);
		}else{
			
			return super.findByPage(Module.class, "from Module m where m.parent.m_id="+mid, pageNo, pageSize);
		}
		
	}

}
