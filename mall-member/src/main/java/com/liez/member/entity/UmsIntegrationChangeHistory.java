package com.liez.member.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 积分变化历史记录(UmsIntegrationChangeHistory)实体类
 *
 * @author makejava
 * @since 2021-09-07 20:47:55
 */
public class UmsIntegrationChangeHistory implements Serializable {
	private static final long serialVersionUID = -83053821458767652L;
	/**
	 * id
	 */
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * create_time
	 */
	private Date createTime;
	/**
	 * 变化的值
	 */
	private Integer changeCount;
	/**
	 * 备注
	 */
	private String note;
	/**
	 * 来源[0->购物；1->管理员修改;2->活动]
	 */
	private Boolean sourceTyoe;


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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getChangeCount() {
		return changeCount;
	}

	public void setChangeCount(Integer changeCount) {
		this.changeCount = changeCount;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Boolean getSourceTyoe() {
		return sourceTyoe;
	}

	public void setSourceTyoe(Boolean sourceTyoe) {
		this.sourceTyoe = sourceTyoe;
	}

}
