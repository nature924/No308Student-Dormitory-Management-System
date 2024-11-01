package com.dao;

import com.entity.ZichansunhuaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichansunhuaiVO;
import com.entity.view.ZichansunhuaiView;


/**
 * 资产损坏
 * 
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public interface ZichansunhuaiDao extends BaseMapper<ZichansunhuaiEntity> {
	
	List<ZichansunhuaiVO> selectListVO(@Param("ew") Wrapper<ZichansunhuaiEntity> wrapper);
	
	ZichansunhuaiVO selectVO(@Param("ew") Wrapper<ZichansunhuaiEntity> wrapper);
	
	List<ZichansunhuaiView> selectListView(@Param("ew") Wrapper<ZichansunhuaiEntity> wrapper);

	List<ZichansunhuaiView> selectListView(Pagination page,@Param("ew") Wrapper<ZichansunhuaiEntity> wrapper);
	
	ZichansunhuaiView selectView(@Param("ew") Wrapper<ZichansunhuaiEntity> wrapper);
	
}
