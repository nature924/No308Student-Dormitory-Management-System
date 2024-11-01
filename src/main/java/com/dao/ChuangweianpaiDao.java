package com.dao;

import com.entity.ChuangweianpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuangweianpaiVO;
import com.entity.view.ChuangweianpaiView;


/**
 * 床位安排
 * 
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public interface ChuangweianpaiDao extends BaseMapper<ChuangweianpaiEntity> {
	
	List<ChuangweianpaiVO> selectListVO(@Param("ew") Wrapper<ChuangweianpaiEntity> wrapper);
	
	ChuangweianpaiVO selectVO(@Param("ew") Wrapper<ChuangweianpaiEntity> wrapper);
	
	List<ChuangweianpaiView> selectListView(@Param("ew") Wrapper<ChuangweianpaiEntity> wrapper);

	List<ChuangweianpaiView> selectListView(Pagination page,@Param("ew") Wrapper<ChuangweianpaiEntity> wrapper);
	
	ChuangweianpaiView selectView(@Param("ew") Wrapper<ChuangweianpaiEntity> wrapper);
	
}
