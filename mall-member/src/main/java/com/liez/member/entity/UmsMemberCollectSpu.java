package com.liez.member.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 会员收藏的商品(UmsMemberCollectSpu)实体类
 *
 * @author makejava
 * @since 2021-09-07 20:47:56
 */
public class UmsMemberCollectSpu implements Serializable {
	private static final long serialVersionUID = -11665928845189016L;
	/**
	 * id
	 */
	private Long id;
	/**
	 * 会员id
	 */
	private Long memberId;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * spu_name
	 */
	private String spuName;
	/**
	 * spu_img
	 */
	private String spuImg;
	/**
	 * create_time
	 */
	private Date createTime;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Long getSpuId() {
		return spuId;
	}

	public void setSpuId(Long spuId) {
		this.spuId = spuId;
	}

	public String getSpuName() {
		return spuName;
	}

	public void setSpuName(String spuName) {
		this.spuName = spuName;
	}

	public String getSpuImg() {
		return spuImg;
	}

	public void setSpuImg(String spuImg) {
		this.spuImg = spuImg;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
