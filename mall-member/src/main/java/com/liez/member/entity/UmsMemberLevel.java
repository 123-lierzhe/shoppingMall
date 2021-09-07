package com.liez.member.entity;

import java.io.Serializable;

/**
 * 会员等级(UmsMemberLevel)实体类
 *
 * @author makejava
 * @since 2021-09-07 20:47:58
 */
public class UmsMemberLevel implements Serializable {
	private static final long serialVersionUID = 639685069854227917L;
	/**
	 * id
	 */
	private Long id;
	/**
	 * 等级名称
	 */
	private String name;
	/**
	 * 等级需要的成长值
	 */
	private Integer growthPoint;
	/**
	 * 是否为默认等级[0->不是；1->是]
	 */
	private Boolean defaultStatus;
	/**
	 * 免运费标准
	 */
	private Double freeFreightPoint;
	/**
	 * 每次评价获取的成长值
	 */
	private Integer commentGrowthPoint;
	/**
	 * 是否有免邮特权
	 */
	private Boolean priviledgeFreeFreight;
	/**
	 * 是否有会员价格特权
	 */
	private Boolean priviledgeMemberPrice;
	/**
	 * 是否有生日特权
	 */
	private Boolean priviledgeBirthday;
	/**
	 * 备注
	 */
	private String note;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGrowthPoint() {
		return growthPoint;
	}

	public void setGrowthPoint(Integer growthPoint) {
		this.growthPoint = growthPoint;
	}

	public Boolean getDefaultStatus() {
		return defaultStatus;
	}

	public void setDefaultStatus(Boolean defaultStatus) {
		this.defaultStatus = defaultStatus;
	}

	public Double getFreeFreightPoint() {
		return freeFreightPoint;
	}

	public void setFreeFreightPoint(Double freeFreightPoint) {
		this.freeFreightPoint = freeFreightPoint;
	}

	public Integer getCommentGrowthPoint() {
		return commentGrowthPoint;
	}

	public void setCommentGrowthPoint(Integer commentGrowthPoint) {
		this.commentGrowthPoint = commentGrowthPoint;
	}

	public Boolean getPriviledgeFreeFreight() {
		return priviledgeFreeFreight;
	}

	public void setPriviledgeFreeFreight(Boolean priviledgeFreeFreight) {
		this.priviledgeFreeFreight = priviledgeFreeFreight;
	}

	public Boolean getPriviledgeMemberPrice() {
		return priviledgeMemberPrice;
	}

	public void setPriviledgeMemberPrice(Boolean priviledgeMemberPrice) {
		this.priviledgeMemberPrice = priviledgeMemberPrice;
	}

	public Boolean getPriviledgeBirthday() {
		return priviledgeBirthday;
	}

	public void setPriviledgeBirthday(Boolean priviledgeBirthday) {
		this.priviledgeBirthday = priviledgeBirthday;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
