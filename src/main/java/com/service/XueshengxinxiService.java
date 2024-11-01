package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengxinxiView;


/**
 * 学生信息
 *
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public interface XueshengxinxiService extends IService<XueshengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengxinxiVO> selectListVO(Wrapper<XueshengxinxiEntity> wrapper);
   	
   	XueshengxinxiVO selectVO(@Param("ew") Wrapper<XueshengxinxiEntity> wrapper);
   	
   	List<XueshengxinxiView> selectListView(Wrapper<XueshengxinxiEntity> wrapper);
   	
   	XueshengxinxiView selectView(@Param("ew") Wrapper<XueshengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengxinxiEntity> wrapper);
   	
}

