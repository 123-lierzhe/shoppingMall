package com.liez.coupon.entity;

import java.io.Serializable;

/**
 * 商品spu积分设置(SmsSpuBounds)实体类
 *
 * @author makejava
 * @since 2021-09-07 20:50:26
 */
public class SmsSpuBounds implements Serializable {
	private static final long serialVersionUID = 183663062891891404L;
	/**
	 * id
	 */
	private Long id;

	private Long spuId;
	/**
	 * 成长积分
	 */
	private Double growBounds;
	/**
	 * 购物积分
	 */
	private Double buyBounds;
	/**
	 * 优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]
	 */
	private Boolean work;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSpuId() {
		return spuId;
	}

	public void setSpuId(Long spuId) {
		this.spuId = spuId;
	}

	public Double getGrowBounds() {
		return growBounds;
	}

	public void setGrowBounds(Double growBounds) {
		this.growBounds = growBounds;
	}

	public Double getBuyBounds() {
		return buyBounds;
	}

	public void setBuyBounds(Double buyBounds) {
		this.buyBounds = buyBounds;
	}

	public Boolean getWork() {
		return work;
	}

	public void setWork(Boolean work) {
		this.work = work;
	}

}
