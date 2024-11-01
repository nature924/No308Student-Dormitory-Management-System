package com.dao;

import com.entity.QingligonggongchangsuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QingligonggongchangsuoVO;
import com.entity.view.QingligonggongchangsuoView;


/**
 * 清理公共场所
 * 
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public interface QingligonggongchangsuoDao extends BaseMapper<QingligonggongchangsuoEntity> {
	
	List<QingligonggongchangsuoVO> selectListVO(@Param("ew") Wrapper<QingligonggongchangsuoEntity> wrapper);
	
	QingligonggongchangsuoVO selectVO(@Param("ew") Wrapper<QingligonggongchangsuoEntity> wrapper);
	
	List<QingligonggongchangsuoView> selectListView(@Param("ew") Wrapper<QingligonggongchangsuoEntity> wrapper);

	List<QingligonggongchangsuoView> selectListView(Pagination page,@Param("ew") Wrapper<QingligonggongchangsuoEntity> wrapper);
	
	QingligonggongchangsuoView selectView(@Param("ew") Wrapper<QingligonggongchangsuoEntity> wrapper);
	
}
