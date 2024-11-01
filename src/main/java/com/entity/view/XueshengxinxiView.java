package com.entity.view;

import com.entity.XueshengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
@TableName("xueshengxinxi")
public class XueshengxinxiView  extends XueshengxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengxinxiView(){
	}
 
 	public XueshengxinxiView(XueshengxinxiEntity xueshengxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
