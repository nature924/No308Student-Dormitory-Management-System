package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichanxinzengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichanxinzengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanxinzengView;


/**
 * 资产新增
 *
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public interface ZichanxinzengService extends IService<ZichanxinzengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichanxinzengVO> selectListVO(Wrapper<ZichanxinzengEntity> wrapper);
   	
   	ZichanxinzengVO selectVO(@Param("ew") Wrapper<ZichanxinzengEntity> wrapper);
   	
   	List<ZichanxinzengView> selectListView(Wrapper<ZichanxinzengEntity> wrapper);
   	
   	ZichanxinzengView selectView(@Param("ew") Wrapper<ZichanxinzengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichanxinzengEntity> wrapper);
   	
}

