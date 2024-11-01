package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichansunhuaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichansunhuaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichansunhuaiView;


/**
 * 资产损坏
 *
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public interface ZichansunhuaiService extends IService<ZichansunhuaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichansunhuaiVO> selectListVO(Wrapper<ZichansunhuaiEntity> wrapper);
   	
   	ZichansunhuaiVO selectVO(@Param("ew") Wrapper<ZichansunhuaiEntity> wrapper);
   	
   	List<ZichansunhuaiView> selectListView(Wrapper<ZichansunhuaiEntity> wrapper);
   	
   	ZichansunhuaiView selectView(@Param("ew") Wrapper<ZichansunhuaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichansunhuaiEntity> wrapper);
   	
}

