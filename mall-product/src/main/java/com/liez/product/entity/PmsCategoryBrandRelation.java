package com.liez.product.entity;

import java.io.Serializable;

/**
 * 品牌分类关联(PmsCategoryBrandRelation)实体类
 *
 * @author makejava
 * @since 2021-09-07 20:40:54
 */
public class PmsCategoryBrandRelation implements Serializable {
	private static final long serialVersionUID = 569886000424524907L;

	private Long id;
	/**
	 * 品牌id
	 */
	private Long brandId;
	/**
	 * 分类id
	 */
	private Long catelogId;

	private String brandName;

	private String catelogName;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Long getCatelogId() {
		return catelogId;
	}

	public void setCatelogId(Long catelogId) {
		this.catelogId = catelogId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCatelogName() {
		return catelogName;
	}

	public void setCatelogName(String catelogName) {
		this.catelogName = catelogName;
	}

}
