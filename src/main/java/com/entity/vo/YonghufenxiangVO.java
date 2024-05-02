package com.entity.vo;

import com.entity.YonghufenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 用户分享
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-21 18:11:26
 */
public class YonghufenxiangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 分享类型
	 */
	
	private String fenxiangleixing;
		
	/**
	 * 分享图片
	 */
	
	private String fenxiangtupian;
		
	/**
	 * 分享视频
	 */
	
	private String fenxiangshipin;
		
	/**
	 * 分享日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fenxiangriqi;
		
	/**
	 * 分享内容
	 */
	
	private String fenxiangneirong;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 邮箱
	 */
	
	private String youxiang;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：分享类型
	 */
	 
	public void setFenxiangleixing(String fenxiangleixing) {
		this.fenxiangleixing = fenxiangleixing;
	}
	
	/**
	 * 获取：分享类型
	 */
	public String getFenxiangleixing() {
		return fenxiangleixing;
	}
				
	
	/**
	 * 设置：分享图片
	 */
	 
	public void setFenxiangtupian(String fenxiangtupian) {
		this.fenxiangtupian = fenxiangtupian;
	}
	
	/**
	 * 获取：分享图片
	 */
	public String getFenxiangtupian() {
		return fenxiangtupian;
	}
				
	
	/**
	 * 设置：分享视频
	 */
	 
	public void setFenxiangshipin(String fenxiangshipin) {
		this.fenxiangshipin = fenxiangshipin;
	}
	
	/**
	 * 获取：分享视频
	 */
	public String getFenxiangshipin() {
		return fenxiangshipin;
	}
				
	
	/**
	 * 设置：分享日期
	 */
	 
	public void setFenxiangriqi(Date fenxiangriqi) {
		this.fenxiangriqi = fenxiangriqi;
	}
	
	/**
	 * 获取：分享日期
	 */
	public Date getFenxiangriqi() {
		return fenxiangriqi;
	}
				
	
	/**
	 * 设置：分享内容
	 */
	 
	public void setFenxiangneirong(String fenxiangneirong) {
		this.fenxiangneirong = fenxiangneirong;
	}
	
	/**
	 * 获取：分享内容
	 */
	public String getFenxiangneirong() {
		return fenxiangneirong;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：邮箱
	 */
	 
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
