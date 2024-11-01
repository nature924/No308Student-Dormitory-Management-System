package com.dao;

import com.entity.ZichanxinzengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanxinzengVO;
import com.entity.view.ZichanxinzengView;


/**
 * 资产新增
 * 
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public interface ZichanxinzengDao extends BaseMapper<ZichanxinzengEntity> {
	
	List<ZichanxinzengVO> selectListVO(@Param("ew") Wrapper<ZichanxinzengEntity> wrapper);
	
	ZichanxinzengVO selectVO(@Param("ew") Wrapper<ZichanxinzengEntity> wrapper);
	
	List<ZichanxinzengView> selectListView(@Param("ew") Wrapper<ZichanxinzengEntity> wrapper);

	List<ZichanxinzengView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanxinzengEntity> wrapper);
	
	ZichanxinzengView selectView(@Param("ew") Wrapper<ZichanxinzengEntity> wrapper);
	
}
