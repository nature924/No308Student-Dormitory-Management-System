package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyuzichanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongyuzichanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongyuzichanView;


/**
 * 公寓资产
 *
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public interface GongyuzichanService extends IService<GongyuzichanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongyuzichanVO> selectListVO(Wrapper<GongyuzichanEntity> wrapper);
   	
   	GongyuzichanVO selectVO(@Param("ew") Wrapper<GongyuzichanEntity> wrapper);
   	
   	List<GongyuzichanView> selectListView(Wrapper<GongyuzichanEntity> wrapper);
   	
   	GongyuzichanView selectView(@Param("ew") Wrapper<GongyuzichanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongyuzichanEntity> wrapper);
   	
}

