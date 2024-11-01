package com.dao;

import com.entity.XueshengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengxinxiVO;
import com.entity.view.XueshengxinxiView;


/**
 * 学生信息
 * 
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public interface XueshengxinxiDao extends BaseMapper<XueshengxinxiEntity> {
	
	List<XueshengxinxiVO> selectListVO(@Param("ew") Wrapper<XueshengxinxiEntity> wrapper);
	
	XueshengxinxiVO selectVO(@Param("ew") Wrapper<XueshengxinxiEntity> wrapper);
	
	List<XueshengxinxiView> selectListView(@Param("ew") Wrapper<XueshengxinxiEntity> wrapper);

	List<XueshengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengxinxiEntity> wrapper);
	
	XueshengxinxiView selectView(@Param("ew") Wrapper<XueshengxinxiEntity> wrapper);
	
}
