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


import com.dao.XueshengxinxiDao;
import com.entity.XueshengxinxiEntity;
import com.service.XueshengxinxiService;
import com.entity.vo.XueshengxinxiVO;
import com.entity.view.XueshengxinxiView;

@Service("xueshengxinxiService")
public class XueshengxinxiServiceImpl extends ServiceImpl<XueshengxinxiDao, XueshengxinxiEntity> implements XueshengxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengxinxiEntity> page = this.selectPage(
                new Query<XueshengxinxiEntity>(params).getPage(),
                new EntityWrapper<XueshengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengxinxiEntity> wrapper) {
		  Page<XueshengxinxiView> page =new Query<XueshengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengxinxiVO> selectListVO(Wrapper<XueshengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengxinxiVO selectVO(Wrapper<XueshengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengxinxiView> selectListView(Wrapper<XueshengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengxinxiView selectView(Wrapper<XueshengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
