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


import com.dao.ChuangweianpaiDao;
import com.entity.ChuangweianpaiEntity;
import com.service.ChuangweianpaiService;
import com.entity.vo.ChuangweianpaiVO;
import com.entity.view.ChuangweianpaiView;

@Service("chuangweianpaiService")
public class ChuangweianpaiServiceImpl extends ServiceImpl<ChuangweianpaiDao, ChuangweianpaiEntity> implements ChuangweianpaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuangweianpaiEntity> page = this.selectPage(
                new Query<ChuangweianpaiEntity>(params).getPage(),
                new EntityWrapper<ChuangweianpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuangweianpaiEntity> wrapper) {
		  Page<ChuangweianpaiView> page =new Query<ChuangweianpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuangweianpaiVO> selectListVO(Wrapper<ChuangweianpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuangweianpaiVO selectVO(Wrapper<ChuangweianpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuangweianpaiView> selectListView(Wrapper<ChuangweianpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuangweianpaiView selectView(Wrapper<ChuangweianpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
