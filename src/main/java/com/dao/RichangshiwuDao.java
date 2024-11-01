package com.dao;

import com.entity.RichangshiwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RichangshiwuVO;
import com.entity.view.RichangshiwuView;


/**
 * 日常事物
 * 
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public interface RichangshiwuDao extends BaseMapper<RichangshiwuEntity> {
	
	List<RichangshiwuVO> selectListVO(@Param("ew") Wrapper<RichangshiwuEntity> wrapper);
	
	RichangshiwuVO selectVO(@Param("ew") Wrapper<RichangshiwuEntity> wrapper);
	
	List<RichangshiwuView> selectListView(@Param("ew") Wrapper<RichangshiwuEntity> wrapper);

	List<RichangshiwuView> selectListView(Pagination page,@Param("ew") Wrapper<RichangshiwuEntity> wrapper);
	
	RichangshiwuView selectView(@Param("ew") Wrapper<RichangshiwuEntity> wrapper);
	
}
