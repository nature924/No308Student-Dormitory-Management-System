package com.entity.vo;

import com.entity.ZichansunhuaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 资产损坏
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-20 22:53:13
 */
public class ZichansunhuaiVO  implements Serializable {
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
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 损坏情况
	 */
	
	private String sunhuaiqingkuang;
				
	
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
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：损坏情况
	 */
	 
	public void setSunhuaiqingkuang(String sunhuaiqingkuang) {
		this.sunhuaiqingkuang = sunhuaiqingkuang;
	}
	
	/**
	 * 获取：损坏情况
	 */
	public String getSunhuaiqingkuang() {
		return sunhuaiqingkuang;
	}
			
}
