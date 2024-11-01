package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuangweianpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuangweianpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuangweianpaiView;


/**
 * 床位安排
 *
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public interface ChuangweianpaiService extends IService<ChuangweianpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuangweianpaiVO> selectListVO(Wrapper<ChuangweianpaiEntity> wrapper);
   	
   	ChuangweianpaiVO selectVO(@Param("ew") Wrapper<ChuangweianpaiEntity> wrapper);
   	
   	List<ChuangweianpaiView> selectListView(Wrapper<ChuangweianpaiEntity> wrapper);
   	
   	ChuangweianpaiView selectView(@Param("ew") Wrapper<ChuangweianpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuangweianpaiEntity> wrapper);
   	
}

