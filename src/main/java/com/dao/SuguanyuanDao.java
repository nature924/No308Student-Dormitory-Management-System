package com.dao;

import com.entity.SuguanyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SuguanyuanVO;
import com.entity.view.SuguanyuanView;


/**
 * 宿管员
 * 
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public interface SuguanyuanDao extends BaseMapper<SuguanyuanEntity> {
	
	List<SuguanyuanVO> selectListVO(@Param("ew") Wrapper<SuguanyuanEntity> wrapper);
	
	SuguanyuanVO selectVO(@Param("ew") Wrapper<SuguanyuanEntity> wrapper);
	
	List<SuguanyuanView> selectListView(@Param("ew") Wrapper<SuguanyuanEntity> wrapper);

	List<SuguanyuanView> selectListView(Pagination page,@Param("ew") Wrapper<SuguanyuanEntity> wrapper);
	
	SuguanyuanView selectView(@Param("ew") Wrapper<SuguanyuanEntity> wrapper);
	
}
