package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QingligonggongchangsuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QingligonggongchangsuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QingligonggongchangsuoView;


/**
 * 清理公共场所
 *
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public interface QingligonggongchangsuoService extends IService<QingligonggongchangsuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QingligonggongchangsuoVO> selectListVO(Wrapper<QingligonggongchangsuoEntity> wrapper);
   	
   	QingligonggongchangsuoVO selectVO(@Param("ew") Wrapper<QingligonggongchangsuoEntity> wrapper);
   	
   	List<QingligonggongchangsuoView> selectListView(Wrapper<QingligonggongchangsuoEntity> wrapper);
   	
   	QingligonggongchangsuoView selectView(@Param("ew") Wrapper<QingligonggongchangsuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QingligonggongchangsuoEntity> wrapper);
   	
}

