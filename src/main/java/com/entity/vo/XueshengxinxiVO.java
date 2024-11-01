package com.entity.vo;

import com.entity.XueshengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学生信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public class XueshengxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 电话号码
	 */
	
	private String dianhuahaoma;
		
	/**
	 * 房间号
	 */
	
	private Integer fangjianhao;
		
	/**
	 * 床位
	 */
	
	private String chuangwei;
				
	
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
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：电话号码
	 */
	 
	public void setDianhuahaoma(String dianhuahaoma) {
		this.dianhuahaoma = dianhuahaoma;
	}
	
	/**
	 * 获取：电话号码
	 */
	public String getDianhuahaoma() {
		return dianhuahaoma;
	}
				
	
	/**
	 * 设置：房间号
	 */
	 
	public void setFangjianhao(Integer fangjianhao) {
		this.fangjianhao = fangjianhao;
	}
	
	/**
	 * 获取：房间号
	 */
	public Integer getFangjianhao() {
		return fangjianhao;
	}
				
	
	/**
	 * 设置：床位
	 */
	 
	public void setChuangwei(String chuangwei) {
		this.chuangwei = chuangwei;
	}
	
	/**
	 * 获取：床位
	 */
	public String getChuangwei() {
		return chuangwei;
	}
			
}
