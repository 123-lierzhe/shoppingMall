package com.liez.member.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 会员登录记录(UmsMemberLoginLog)实体类
 *
 * @author makejava
 * @since 2021-09-07 20:47:58
 */
public class UmsMemberLoginLog implements Serializable {
	private static final long serialVersionUID = -63137534564050938L;
	/**
	 * id
	 */
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * ip
	 */
	private String ip;
	/**
	 * city
	 */
	private String city;
	/**
	 * 登录类型[1-web，2-app]
	 */
	private Boolean loginType;


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

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Boolean getLoginType() {
		return loginType;
	}

	public void setLoginType(Boolean loginType) {
		this.loginType = loginType;
	}

}
