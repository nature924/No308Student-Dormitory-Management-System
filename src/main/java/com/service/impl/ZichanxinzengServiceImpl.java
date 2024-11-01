package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZichanxinzengDao;
import com.entity.ZichanxinzengEntity;
import com.service.ZichanxinzengService;
import com.entity.vo.ZichanxinzengVO;
import com.entity.view.ZichanxinzengView;

@Service("zichanxinzengService")
public class ZichanxinzengServiceImpl extends ServiceImpl<ZichanxinzengDao, ZichanxinzengEntity> implements ZichanxinzengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichanxinzengEntity> page = this.selectPage(
                new Query<ZichanxinzengEntity>(params).getPage(),
                new EntityWrapper<ZichanxinzengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichanxinzengEntity> wrapper) {
		  Page<ZichanxinzengView> page =new Query<ZichanxinzengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichanxinzengVO> selectListVO(Wrapper<ZichanxinzengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichanxinzengVO selectVO(Wrapper<ZichanxinzengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichanxinzengView> selectListView(Wrapper<ZichanxinzengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichanxinzengView selectView(Wrapper<ZichanxinzengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
