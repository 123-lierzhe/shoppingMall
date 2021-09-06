package com.liez.order.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单(OmsOrder)实体类
 *
 * @author makejava
 * @since 2021-09-06 20:59:49
 */
public class OmsOrder implements Serializable {
	private static final long serialVersionUID = 654989367014955219L;
	/**
	 * id
	 */
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * 订单号
	 */
	private String orderSn;
	/**
	 * 使用的优惠券
	 */
	private Long couponId;
	/**
	 * create_time
	 */
	private Date createTime;
	/**
	 * 用户名
	 */
	private String memberUsername;
	/**
	 * 订单总额
	 */
	private Double totalAmount;
	/**
	 * 应付总额
	 */
	private Double payAmount;
	/**
	 * 运费金额
	 */
	private Double freightAmount;
	/**
	 * 促销优化金额（促销价、满减、阶梯价）
	 */
	private Double promotionAmount;
	/**
	 * 积分抵扣金额
	 */
	private Double integrationAmount;
	/**
	 * 优惠券抵扣金额
	 */
	private Double couponAmount;
	/**
	 * 后台调整订单使用的折扣金额
	 */
	private Double discountAmount;
	/**
	 * 支付方式【1->支付宝；2->微信；3->银联； 4->货到付款；】
	 */
	private Boolean payType;
	/**
	 * 订单来源[0->PC订单；1->app订单]
	 */
	private Boolean sourceType;
	/**
	 * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
	 */
	private Boolean status;
	/**
	 * 物流公司(配送方式)
	 */
	private String deliveryCompany;
	/**
	 * 物流单号
	 */
	private String deliverySn;
	/**
	 * 自动确认时间（天）
	 */
	private Integer autoConfirmDay;
	/**
	 * 可以获得的积分
	 */
	private Integer integration;
	/**
	 * 可以获得的成长值
	 */
	private Integer growth;
	/**
	 * 发票类型[0->不开发票；1->电子发票；2->纸质发票]
	 */
	private Boolean billType;
	/**
	 * 发票抬头
	 */
	private String billHeader;
	/**
	 * 发票内容
	 */
	private String billContent;
	/**
	 * 收票人电话
	 */
	private String billReceiverPhone;
	/**
	 * 收票人邮箱
	 */
	private String billReceiverEmail;
	/**
	 * 收货人姓名
	 */
	private String receiverName;
	/**
	 * 收货人电话
	 */
	private String receiverPhone;
	/**
	 * 收货人邮编
	 */
	private String receiverPostCode;
	/**
	 * 省份/直辖市
	 */
	private String receiverProvince;
	/**
	 * 城市
	 */
	private String receiverCity;
	/**
	 * 区
	 */
	private String receiverRegion;
	/**
	 * 详细地址
	 */
	private String receiverDetailAddress;
	/**
	 * 订单备注
	 */
	private String note;
	/**
	 * 确认收货状态[0->未确认；1->已确认]
	 */
	private Boolean confirmStatus;
	/**
	 * 删除状态【0->未删除；1->已删除】
	 */
	private Boolean deleteStatus;
	/**
	 * 下单时使用的积分
	 */
	private Integer useIntegration;
	/**
	 * 支付时间
	 */
	private Date paymentTime;
	/**
	 * 发货时间
	 */
	private Date deliveryTime;
	/**
	 * 确认收货时间
	 */
	private Date receiveTime;
	/**
	 * 评价时间
	 */
	private Date commentTime;
	/**
	 * 修改时间
	 */
	private Date modifyTime;


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

	public String getOrderSn() {
		return orderSn;
	}

	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}

	public Long getCouponId() {
		return couponId;
	}

	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getMemberUsername() {
		return memberUsername;
	}

	public void setMemberUsername(String memberUsername) {
		this.memberUsername = memberUsername;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
	}

	public Double getFreightAmount() {
		return freightAmount;
	}

	public void setFreightAmount(Double freightAmount) {
		this.freightAmount = freightAmount;
	}

	public Double getPromotionAmount() {
		return promotionAmount;
	}

	public void setPromotionAmount(Double promotionAmount) {
		this.promotionAmount = promotionAmount;
	}

	public Double getIntegrationAmount() {
		return integrationAmount;
	}

	public void setIntegrationAmount(Double integrationAmount) {
		this.integrationAmount = integrationAmount;
	}

	public Double getCouponAmount() {
		return couponAmount;
	}

	public void setCouponAmount(Double couponAmount) {
		this.couponAmount = couponAmount;
	}

	public Double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(Double discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Boolean getPayType() {
		return payType;
	}

	public void setPayType(Boolean payType) {
		this.payType = payType;
	}

	public Boolean getSourceType() {
		return sourceType;
	}

	public void setSourceType(Boolean sourceType) {
		this.sourceType = sourceType;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getDeliveryCompany() {
		return deliveryCompany;
	}

	public void setDeliveryCompany(String deliveryCompany) {
		this.deliveryCompany = deliveryCompany;
	}

	public String getDeliverySn() {
		return deliverySn;
	}

	public void setDeliverySn(String deliverySn) {
		this.deliverySn = deliverySn;
	}

	public Integer getAutoConfirmDay() {
		return autoConfirmDay;
	}

	public void setAutoConfirmDay(Integer autoConfirmDay) {
		this.autoConfirmDay = autoConfirmDay;
	}

	public Integer getIntegration() {
		return integration;
	}

	public void setIntegration(Integer integration) {
		this.integration = integration;
	}

	public Integer getGrowth() {
		return growth;
	}

	public void setGrowth(Integer growth) {
		this.growth = growth;
	}

	public Boolean getBillType() {
		return billType;
	}

	public void setBillType(Boolean billType) {
		this.billType = billType;
	}

	public String getBillHeader() {
		return billHeader;
	}

	public void setBillHeader(String billHeader) {
		this.billHeader = billHeader;
	}

	public String getBillContent() {
		return billContent;
	}

	public void setBillContent(String billContent) {
		this.billContent = billContent;
	}

	public String getBillReceiverPhone() {
		return billReceiverPhone;
	}

	public void setBillReceiverPhone(String billReceiverPhone) {
		this.billReceiverPhone = billReceiverPhone;
	}

	public String getBillReceiverEmail() {
		return billReceiverEmail;
	}

	public void setBillReceiverEmail(String billReceiverEmail) {
		this.billReceiverEmail = billReceiverEmail;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverPostCode() {
		return receiverPostCode;
	}

	public void setReceiverPostCode(String receiverPostCode) {
		this.receiverPostCode = receiverPostCode;
	}

	public String getReceiverProvince() {
		return receiverProvince;
	}

	public void setReceiverProvince(String receiverProvince) {
		this.receiverProvince = receiverProvince;
	}

	public String getReceiverCity() {
		return receiverCity;
	}

	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

	public String getReceiverRegion() {
		return receiverRegion;
	}

	public void setReceiverRegion(String receiverRegion) {
		this.receiverRegion = receiverRegion;
	}

	public String getReceiverDetailAddress() {
		return receiverDetailAddress;
	}

	public void setReceiverDetailAddress(String receiverDetailAddress) {
		this.receiverDetailAddress = receiverDetailAddress;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Boolean getConfirmStatus() {
		return confirmStatus;
	}

	public void setConfirmStatus(Boolean confirmStatus) {
		this.confirmStatus = confirmStatus;
	}

	public Boolean getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public Integer getUseIntegration() {
		return useIntegration;
	}

	public void setUseIntegration(Integer useIntegration) {
		this.useIntegration = useIntegration;
	}

	public Date getPaymentTime() {
		return paymentTime;
	}

	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}

	public Date getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public Date getReceiveTime() {
		return receiveTime;
	}

	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}

	public Date getCommentTime() {
		return commentTime;
	}

	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

}
