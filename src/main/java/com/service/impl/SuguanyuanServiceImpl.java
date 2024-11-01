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


import com.dao.SuguanyuanDao;
import com.entity.SuguanyuanEntity;
import com.service.SuguanyuanService;
import com.entity.vo.SuguanyuanVO;
import com.entity.view.SuguanyuanView;

@Service("suguanyuanService")
public class SuguanyuanServiceImpl extends ServiceImpl<SuguanyuanDao, SuguanyuanEntity> implements SuguanyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SuguanyuanEntity> page = this.selectPage(
                new Query<SuguanyuanEntity>(params).getPage(),
                new EntityWrapper<SuguanyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SuguanyuanEntity> wrapper) {
		  Page<SuguanyuanView> page =new Query<SuguanyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SuguanyuanVO> selectListVO(Wrapper<SuguanyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SuguanyuanVO selectVO(Wrapper<SuguanyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SuguanyuanView> selectListView(Wrapper<SuguanyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SuguanyuanView selectView(Wrapper<SuguanyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
