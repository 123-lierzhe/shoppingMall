package com.liez.order.entity;

import java.io.Serializable;

/**
 * 退款信息(OmsRefundInfo)实体类
 *
 * @author makejava
 * @since 2021-09-07 20:46:36
 */
public class OmsRefundInfo implements Serializable {
	private static final long serialVersionUID = 576310999939520504L;
	/**
	 * id
	 */
	private Long id;
	/**
	 * 退款的订单
	 */
	private Long orderReturnId;
	/**
	 * 退款金额
	 */
	private Double refund;
	/**
	 * 退款交易流水号
	 */
	private String refundSn;
	/**
	 * 退款状态
	 */
	private Boolean refundStatus;
	/**
	 * 退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
	 */
	private Boolean refundChannel;

	private String refundContent;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderReturnId() {
		return orderReturnId;
	}

	public void setOrderReturnId(Long orderReturnId) {
		this.orderReturnId = orderReturnId;
	}

	public Double getRefund() {
		return refund;
	}

	public void setRefund(Double refund) {
		this.refund = refund;
	}

	public String getRefundSn() {
		return refundSn;
	}

	public void setRefundSn(String refundSn) {
		this.refundSn = refundSn;
	}

	public Boolean getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(Boolean refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Boolean getRefundChannel() {
		return refundChannel;
	}

	public void setRefundChannel(Boolean refundChannel) {
		this.refundChannel = refundChannel;
	}

	public String getRefundContent() {
		return refundContent;
	}

	public void setRefundContent(String refundContent) {
		this.refundContent = refundContent;
	}

}
