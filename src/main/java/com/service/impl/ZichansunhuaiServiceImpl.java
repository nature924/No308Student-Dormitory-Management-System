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


import com.dao.ZichansunhuaiDao;
import com.entity.ZichansunhuaiEntity;
import com.service.ZichansunhuaiService;
import com.entity.vo.ZichansunhuaiVO;
import com.entity.view.ZichansunhuaiView;

@Service("zichansunhuaiService")
public class ZichansunhuaiServiceImpl extends ServiceImpl<ZichansunhuaiDao, ZichansunhuaiEntity> implements ZichansunhuaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichansunhuaiEntity> page = this.selectPage(
                new Query<ZichansunhuaiEntity>(params).getPage(),
                new EntityWrapper<ZichansunhuaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichansunhuaiEntity> wrapper) {
		  Page<ZichansunhuaiView> page =new Query<ZichansunhuaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichansunhuaiVO> selectListVO(Wrapper<ZichansunhuaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichansunhuaiVO selectVO(Wrapper<ZichansunhuaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichansunhuaiView> selectListView(Wrapper<ZichansunhuaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichansunhuaiView selectView(Wrapper<ZichansunhuaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
