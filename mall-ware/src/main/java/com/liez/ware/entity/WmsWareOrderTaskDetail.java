package com.liez.ware.entity;

import java.io.Serializable;

/**
 * 库存工作单(WmsWareOrderTaskDetail)实体类
 *
 * @author makejava
 * @since 2021-09-07 20:25:50
 */
public class WmsWareOrderTaskDetail implements Serializable {
	private static final long serialVersionUID = 468497029405281871L;
	/**
	 * id
	 */
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * sku_name
	 */
	private String skuName;
	/**
	 * 购买个数
	 */
	private Integer skuNum;
	/**
	 * 工作单id
	 */
	private Long taskId;
	/**
	 * 仓库id
	 */
	private Long wareId;
	/**
	 * 1-已锁定  2-已解锁  3-扣减
	 */
	private Integer lockStatus;


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

	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public Integer getSkuNum() {
		return skuNum;
	}

	public void setSkuNum(Integer skuNum) {
		this.skuNum = skuNum;
	}

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getWareId() {
		return wareId;
	}

	public void setWareId(Long wareId) {
		this.wareId = wareId;
	}

	public Integer getLockStatus() {
		return lockStatus;
	}

	public void setLockStatus(Integer lockStatus) {
		this.lockStatus = lockStatus;
	}

}
