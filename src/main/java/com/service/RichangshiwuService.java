package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RichangshiwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RichangshiwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RichangshiwuView;


/**
 * 日常事物
 *
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public interface RichangshiwuService extends IService<RichangshiwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RichangshiwuVO> selectListVO(Wrapper<RichangshiwuEntity> wrapper);
   	
   	RichangshiwuVO selectVO(@Param("ew") Wrapper<RichangshiwuEntity> wrapper);
   	
   	List<RichangshiwuView> selectListView(Wrapper<RichangshiwuEntity> wrapper);
   	
   	RichangshiwuView selectView(@Param("ew") Wrapper<RichangshiwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RichangshiwuEntity> wrapper);
   	
}

