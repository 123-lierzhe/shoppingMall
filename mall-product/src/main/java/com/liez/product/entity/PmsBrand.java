package com.liez.product.entity;

import java.io.Serializable;

/**
 * 品牌(PmsBrand)实体类
 *
 * @author makejava
 * @since 2021-09-06 21:13:10
 */
public class PmsBrand implements Serializable {
	private static final long serialVersionUID = -32357576499809933L;
	/**
	 * 品牌id
	 */
	private Long brandId;
	/**
	 * 品牌名
	 */
	private String name;
	/**
	 * 品牌logo地址
	 */
	private String logo;
	/**
	 * 介绍
	 */
	private Object descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	private Boolean showStatus;
	/**
	 * 检索首字母
	 */
	private String firstLetter;
	/**
	 * 排序
	 */
	private Integer sort;


	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Object getDescript() {
		return descript;
	}

	public void setDescript(Object descript) {
		this.descript = descript;
	}

	public Boolean getShowStatus() {
		return showStatus;
	}

	public void setShowStatus(Boolean showStatus) {
		this.showStatus = showStatus;
	}

	public String getFirstLetter() {
		return firstLetter;
	}

	public void setFirstLetter(String firstLetter) {
		this.firstLetter = firstLetter;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

}
