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


import com.dao.QingligonggongchangsuoDao;
import com.entity.QingligonggongchangsuoEntity;
import com.service.QingligonggongchangsuoService;
import com.entity.vo.QingligonggongchangsuoVO;
import com.entity.view.QingligonggongchangsuoView;

@Service("qingligonggongchangsuoService")
public class QingligonggongchangsuoServiceImpl extends ServiceImpl<QingligonggongchangsuoDao, QingligonggongchangsuoEntity> implements QingligonggongchangsuoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QingligonggongchangsuoEntity> page = this.selectPage(
                new Query<QingligonggongchangsuoEntity>(params).getPage(),
                new EntityWrapper<QingligonggongchangsuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QingligonggongchangsuoEntity> wrapper) {
		  Page<QingligonggongchangsuoView> page =new Query<QingligonggongchangsuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QingligonggongchangsuoVO> selectListVO(Wrapper<QingligonggongchangsuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QingligonggongchangsuoVO selectVO(Wrapper<QingligonggongchangsuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QingligonggongchangsuoView> selectListView(Wrapper<QingligonggongchangsuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QingligonggongchangsuoView selectView(Wrapper<QingligonggongchangsuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
