package com.entity.vo;

import com.entity.QingligonggongchangsuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 清理公共场所
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public class QingligonggongchangsuoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 清理时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date qinglishijian;
		
	/**
	 * 清理地点
	 */
	
	private String qinglididian;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：清理时间
	 */
	 
	public void setQinglishijian(Date qinglishijian) {
		this.qinglishijian = qinglishijian;
	}
	
	/**
	 * 获取：清理时间
	 */
	public Date getQinglishijian() {
		return qinglishijian;
	}
				
	
	/**
	 * 设置：清理地点
	 */
	 
	public void setQinglididian(String qinglididian) {
		this.qinglididian = qinglididian;
	}
	
	/**
	 * 获取：清理地点
	 */
	public String getQinglididian() {
		return qinglididian;
	}
			
}
