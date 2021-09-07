package com.liez.product.entity;

import java.io.Serializable;

/**
 * spu信息介绍(PmsSpuInfoDesc)实体类
 *
 * @author makejava
 * @since 2021-09-07 20:41:03
 */
public class PmsSpuInfoDesc implements Serializable {
	private static final long serialVersionUID = -57777263988430827L;
	/**
	 * 商品id
	 */
	private Long spuId;
	/**
	 * 商品介绍
	 */
	private Object decript;


	public Long getSpuId() {
		return spuId;
	}

	public void setSpuId(Long spuId) {
		this.spuId = spuId;
	}

	public Object getDecript() {
		return decript;
	}

	public void setDecript(Object decript) {
		this.decript = decript;
	}

}
