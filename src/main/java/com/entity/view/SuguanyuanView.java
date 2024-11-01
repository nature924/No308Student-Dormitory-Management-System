package com.entity.view;

import com.entity.SuguanyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宿管员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
@TableName("suguanyuan")
public class SuguanyuanView  extends SuguanyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SuguanyuanView(){
	}
 
 	public SuguanyuanView(SuguanyuanEntity suguanyuanEntity){
 	try {
			BeanUtils.copyProperties(this, suguanyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
