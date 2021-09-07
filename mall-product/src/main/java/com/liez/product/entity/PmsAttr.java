package com.liez.product.entity;

import java.io.Serializable;

/**
 * 商品属性(PmsAttr)实体类
 *
 * @author makejava
 * @since 2021-09-07 20:40:50
 */
public class PmsAttr implements Serializable {
	private static final long serialVersionUID = 943092200439973904L;
	/**
	 * 属性id
	 */
	private Long attrId;
	/**
	 * 属性名
	 */
	private String attrName;
	/**
	 * 是否需要检索[0-不需要，1-需要]
	 */
	private Boolean searchType;
	/**
	 * 属性图标
	 */
	private String icon;
	/**
	 * 可选值列表[用逗号分隔]
	 */
	private String valueSelect;
	/**
	 * 属性类型[0-销售属性，1-基本属性
	 */
	private Boolean attrType;
	/**
	 * 启用状态[0 - 禁用，1 - 启用]
	 */
	private Long enable;
	/**
	 * 所属分类
	 */
	private Long catelogId;
	/**
	 * 快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整
	 */
	private Boolean showDesc;


	public Long getAttrId() {
		return attrId;
	}

	public void setAttrId(Long attrId) {
		this.attrId = attrId;
	}

	public String getAttrName() {
		return attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public Boolean getSearchType() {
		return searchType;
	}

	public void setSearchType(Boolean searchType) {
		this.searchType = searchType;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getValueSelect() {
		return valueSelect;
	}

	public void setValueSelect(String valueSelect) {
		this.valueSelect = valueSelect;
	}

	public Boolean getAttrType() {
		return attrType;
	}

	public void setAttrType(Boolean attrType) {
		this.attrType = attrType;
	}

	public Long getEnable() {
		return enable;
	}

	public void setEnable(Long enable) {
		this.enable = enable;
	}

	public Long getCatelogId() {
		return catelogId;
	}

	public void setCatelogId(Long catelogId) {
		this.catelogId = catelogId;
	}

	public Boolean getShowDesc() {
		return showDesc;
	}

	public void setShowDesc(Boolean showDesc) {
		this.showDesc = showDesc;
	}

}
