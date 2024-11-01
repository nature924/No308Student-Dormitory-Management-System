package com.dao;

import com.entity.GongyuzichanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongyuzichanVO;
import com.entity.view.GongyuzichanView;


/**
 * 公寓资产
 * 
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public interface GongyuzichanDao extends BaseMapper<GongyuzichanEntity> {
	
	List<GongyuzichanVO> selectListVO(@Param("ew") Wrapper<GongyuzichanEntity> wrapper);
	
	GongyuzichanVO selectVO(@Param("ew") Wrapper<GongyuzichanEntity> wrapper);
	
	List<GongyuzichanView> selectListView(@Param("ew") Wrapper<GongyuzichanEntity> wrapper);

	List<GongyuzichanView> selectListView(Pagination page,@Param("ew") Wrapper<GongyuzichanEntity> wrapper);
	
	GongyuzichanView selectView(@Param("ew") Wrapper<GongyuzichanEntity> wrapper);
	
}
