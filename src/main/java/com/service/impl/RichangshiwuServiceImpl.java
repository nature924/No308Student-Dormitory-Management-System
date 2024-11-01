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


import com.dao.RichangshiwuDao;
import com.entity.RichangshiwuEntity;
import com.service.RichangshiwuService;
import com.entity.vo.RichangshiwuVO;
import com.entity.view.RichangshiwuView;

@Service("richangshiwuService")
public class RichangshiwuServiceImpl extends ServiceImpl<RichangshiwuDao, RichangshiwuEntity> implements RichangshiwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RichangshiwuEntity> page = this.selectPage(
                new Query<RichangshiwuEntity>(params).getPage(),
                new EntityWrapper<RichangshiwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RichangshiwuEntity> wrapper) {
		  Page<RichangshiwuView> page =new Query<RichangshiwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RichangshiwuVO> selectListVO(Wrapper<RichangshiwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RichangshiwuVO selectVO(Wrapper<RichangshiwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RichangshiwuView> selectListView(Wrapper<RichangshiwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RichangshiwuView selectView(Wrapper<RichangshiwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
