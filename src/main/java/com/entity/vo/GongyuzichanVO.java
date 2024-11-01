package com.entity.vo;

import com.entity.GongyuzichanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 公寓资产
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public class GongyuzichanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房间号
	 */
	
	private String fangjianhao;
		
	/**
	 * 资产名称
	 */
	
	private String zichanmingcheng;
		
	/**
	 * 固定资产
	 */
	
	private String gudingzichan;
		
	/**
	 * 购入日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date goururiqi;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：房间号
	 */
	 
	public void setFangjianhao(String fangjianhao) {
		this.fangjianhao = fangjianhao;
	}
	
	/**
	 * 获取：房间号
	 */
	public String getFangjianhao() {
		return fangjianhao;
	}
				
	
	/**
	 * 设置：资产名称
	 */
	 
	public void setZichanmingcheng(String zichanmingcheng) {
		this.zichanmingcheng = zichanmingcheng;
	}
	
	/**
	 * 获取：资产名称
	 */
	public String getZichanmingcheng() {
		return zichanmingcheng;
	}
				
	
	/**
	 * 设置：固定资产
	 */
	 
	public void setGudingzichan(String gudingzichan) {
		this.gudingzichan = gudingzichan;
	}
	
	/**
	 * 获取：固定资产
	 */
	public String getGudingzichan() {
		return gudingzichan;
	}
				
	
	/**
	 * 设置：购入日期
	 */
	 
	public void setGoururiqi(Date goururiqi) {
		this.goururiqi = goururiqi;
	}
	
	/**
	 * 获取：购入日期
	 */
	public Date getGoururiqi() {
		return goururiqi;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
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
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
