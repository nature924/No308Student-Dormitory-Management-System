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


import com.dao.JiaofeixinxiDao;
import com.entity.JiaofeixinxiEntity;
import com.service.JiaofeixinxiService;
import com.entity.vo.JiaofeixinxiVO;
import com.entity.view.JiaofeixinxiView;

@Service("jiaofeixinxiService")
public class JiaofeixinxiServiceImpl extends ServiceImpl<JiaofeixinxiDao, JiaofeixinxiEntity> implements JiaofeixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaofeixinxiEntity> page = this.selectPage(
                new Query<JiaofeixinxiEntity>(params).getPage(),
                new EntityWrapper<JiaofeixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaofeixinxiEntity> wrapper) {
		  Page<JiaofeixinxiView> page =new Query<JiaofeixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaofeixinxiVO> selectListVO(Wrapper<JiaofeixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaofeixinxiVO selectVO(Wrapper<JiaofeixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaofeixinxiView> selectListView(Wrapper<JiaofeixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaofeixinxiView selectView(Wrapper<JiaofeixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
