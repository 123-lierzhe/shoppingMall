package com.liez.coupon.entity;

import java.io.Serializable;

/**
 * 商品会员价格(SmsMemberPrice)实体类
 *
 * @author makejava
 * @since 2021-09-07 20:50:21
 */
public class SmsMemberPrice implements Serializable {
	private static final long serialVersionUID = -77716611298489851L;
	/**
	 * id
	 */
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * 会员等级id
	 */
	private Long memberLevelId;
	/**
	 * 会员等级名
	 */
	private String memberLevelName;
	/**
	 * 会员对应价格
	 */
	private Double memberPrice;
	/**
	 * 可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
	 */
	private Boolean addOther;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getMemberLevelId() {
		return memberLevelId;
	}

	public void setMemberLevelId(Long memberLevelId) {
		this.memberLevelId = memberLevelId;
	}

	public String getMemberLevelName() {
		return memberLevelName;
	}

	public void setMemberLevelName(String memberLevelName) {
		this.memberLevelName = memberLevelName;
	}

	public Double getMemberPrice() {
		return memberPrice;
	}

	public void setMemberPrice(Double memberPrice) {
		this.memberPrice = memberPrice;
	}

	public Boolean getAddOther() {
		return addOther;
	}

	public void setAddOther(Boolean addOther) {
		this.addOther = addOther;
	}

}
