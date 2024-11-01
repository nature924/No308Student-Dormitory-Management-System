package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SuguanyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SuguanyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SuguanyuanView;


/**
 * 宿管员
 *
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public interface SuguanyuanService extends IService<SuguanyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SuguanyuanVO> selectListVO(Wrapper<SuguanyuanEntity> wrapper);
   	
   	SuguanyuanVO selectVO(@Param("ew") Wrapper<SuguanyuanEntity> wrapper);
   	
   	List<SuguanyuanView> selectListView(Wrapper<SuguanyuanEntity> wrapper);
   	
   	SuguanyuanView selectView(@Param("ew") Wrapper<SuguanyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SuguanyuanEntity> wrapper);
   	
}

