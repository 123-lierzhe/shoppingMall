package com.liez.ware.entity;

import java.io.Serializable;

/**
 * 仓库信息(WmsWareInfo)实体类
 *
 * @author makejava
 * @since 2021-09-06 21:17:40
 */
public class WmsWareInfo implements Serializable {
	private static final long serialVersionUID = 444717092637115154L;
	/**
	 * id
	 */
	private Long id;
	/**
	 * 仓库名
	 */
	private String name;
	/**
	 * 仓库地址
	 */
	private String address;
	/**
	 * 区域编码
	 */
	private String areacode;


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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAreacode() {
		return areacode;
	}

	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}

}
