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


import com.dao.GongyuzichanDao;
import com.entity.GongyuzichanEntity;
import com.service.GongyuzichanService;
import com.entity.vo.GongyuzichanVO;
import com.entity.view.GongyuzichanView;

@Service("gongyuzichanService")
public class GongyuzichanServiceImpl extends ServiceImpl<GongyuzichanDao, GongyuzichanEntity> implements GongyuzichanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongyuzichanEntity> page = this.selectPage(
                new Query<GongyuzichanEntity>(params).getPage(),
                new EntityWrapper<GongyuzichanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongyuzichanEntity> wrapper) {
		  Page<GongyuzichanView> page =new Query<GongyuzichanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongyuzichanVO> selectListVO(Wrapper<GongyuzichanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongyuzichanVO selectVO(Wrapper<GongyuzichanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongyuzichanView> selectListView(Wrapper<GongyuzichanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongyuzichanView selectView(Wrapper<GongyuzichanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
