package com.liez.order.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 退货原因(OmsOrderReturnReason)实体类
 *
 * @author makejava
 * @since 2021-09-07 20:46:34
 */
public class OmsOrderReturnReason implements Serializable {
	private static final long serialVersionUID = -73760307042143481L;
	/**
	 * id
	 */
	private Long id;
	/**
	 * 退货原因名
	 */
	private String name;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 启用状态
	 */
	private Boolean status;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
