package com.liez.coupon.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 秒杀商品通知订阅(SmsSeckillSkuNotice)实体类
 *
 * @author makejava
 * @since 2021-09-07 20:50:23
 */
public class SmsSeckillSkuNotice implements Serializable {
	private static final long serialVersionUID = -69634720033051923L;
	/**
	 * id
	 */
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * 活动场次id
	 */
	private Long sessionId;
	/**
	 * 订阅时间
	 */
	private Date subcribeTime;
	/**
	 * 发送时间
	 */
	private Date sendTime;
	/**
	 * 通知方式[0-短信，1-邮件]
	 */
	private Boolean noticeType;


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

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getSessionId() {
		return sessionId;
	}

	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}

	public Date getSubcribeTime() {
		return subcribeTime;
	}

	public void setSubcribeTime(Date subcribeTime) {
		this.subcribeTime = subcribeTime;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public Boolean getNoticeType() {
		return noticeType;
	}

	public void setNoticeType(Boolean noticeType) {
		this.noticeType = noticeType;
	}

}
