package com.liez.order.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (MqMessage)实体类
 *
 * @author makejava
 * @since 2021-09-07 20:46:31
 */
public class MqMessage implements Serializable {
	private static final long serialVersionUID = -19857977712666586L;

	private String messageId;
	/**
	 * JSON
	 */
	private String content;

	private String toExchange;

	private String classType;
	/**
	 * 0-新建 1-已发送 2-错误抵达 3-已抵达
	 */
	private Integer messageStatus;

	private Date createTime;

	private Date updateTime;


	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getToExchange() {
		return toExchange;
	}

	public void setToExchange(String toExchange) {
		this.toExchange = toExchange;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public Integer getMessageStatus() {
		return messageStatus;
	}

	public void setMessageStatus(Integer messageStatus) {
		this.messageStatus = messageStatus;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
