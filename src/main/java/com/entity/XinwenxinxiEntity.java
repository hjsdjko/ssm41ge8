package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 新闻信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-21 18:11:26
 */
@TableName("xinwenxinxi")
public class XinwenxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XinwenxinxiEntity() {
		
	}
	
	public XinwenxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 新闻标题
	 */
					
	private String xinwenbiaoti;
	
	/**
	 * 新闻类别
	 */
					
	private String xinwenleibie;
	
	/**
	 * 新闻地区
	 */
					
	private String xinwendiqu;
	
	/**
	 * 新闻图片
	 */
					
	private String xinwentupian;
	
	/**
	 * 新闻视频
	 */
					
	private String xinwenshipin;
	
	/**
	 * 新闻详情
	 */
					
	private String xinwenxiangqing;
	
	/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：新闻标题
	 */
	public void setXinwenbiaoti(String xinwenbiaoti) {
		this.xinwenbiaoti = xinwenbiaoti;
	}
	/**
	 * 获取：新闻标题
	 */
	public String getXinwenbiaoti() {
		return xinwenbiaoti;
	}
	/**
	 * 设置：新闻类别
	 */
	public void setXinwenleibie(String xinwenleibie) {
		this.xinwenleibie = xinwenleibie;
	}
	/**
	 * 获取：新闻类别
	 */
	public String getXinwenleibie() {
		return xinwenleibie;
	}
	/**
	 * 设置：新闻地区
	 */
	public void setXinwendiqu(String xinwendiqu) {
		this.xinwendiqu = xinwendiqu;
	}
	/**
	 * 获取：新闻地区
	 */
	public String getXinwendiqu() {
		return xinwendiqu;
	}
	/**
	 * 设置：新闻图片
	 */
	public void setXinwentupian(String xinwentupian) {
		this.xinwentupian = xinwentupian;
	}
	/**
	 * 获取：新闻图片
	 */
	public String getXinwentupian() {
		return xinwentupian;
	}
	/**
	 * 设置：新闻视频
	 */
	public void setXinwenshipin(String xinwenshipin) {
		this.xinwenshipin = xinwenshipin;
	}
	/**
	 * 获取：新闻视频
	 */
	public String getXinwenshipin() {
		return xinwenshipin;
	}
	/**
	 * 设置：新闻详情
	 */
	public void setXinwenxiangqing(String xinwenxiangqing) {
		this.xinwenxiangqing = xinwenxiangqing;
	}
	/**
	 * 获取：新闻详情
	 */
	public String getXinwenxiangqing() {
		return xinwenxiangqing;
	}
	/**
	 * 设置：发布日期
	 */
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
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
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
