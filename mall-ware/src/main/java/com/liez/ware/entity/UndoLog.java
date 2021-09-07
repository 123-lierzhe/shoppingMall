package com.liez.ware.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (UndoLog)实体类
 *
 * @author makejava
 * @since 2021-09-07 20:25:43
 */
public class UndoLog implements Serializable {
	private static final long serialVersionUID = 281068979437756268L;

	private Long id;

	private Long branchId;

	private String xid;

	private String context;

	private Object rollbackInfo;

	private Integer logStatus;

	private Date logCreated;

	private Date logModified;

	private String ext;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBranchId() {
		return branchId;
	}

	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	public String getXid() {
		return xid;
	}

	public void setXid(String xid) {
		this.xid = xid;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Object getRollbackInfo() {
		return rollbackInfo;
	}

	public void setRollbackInfo(Object rollbackInfo) {
		this.rollbackInfo = rollbackInfo;
	}

	public Integer getLogStatus() {
		return logStatus;
	}

	public void setLogStatus(Integer logStatus) {
		this.logStatus = logStatus;
	}

	public Date getLogCreated() {
		return logCreated;
	}

	public void setLogCreated(Date logCreated) {
		this.logCreated = logCreated;
	}

	public Date getLogModified() {
		return logModified;
	}

	public void setLogModified(Date logModified) {
		this.logModified = logModified;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

}
