package com.liez.member.entity;

import java.io.Serializable;

/**
 * 会员收藏的专题活动(UmsMemberCollectSubject)实体类
 *
 * @author makejava
 * @since 2021-09-07 20:47:57
 */
public class UmsMemberCollectSubject implements Serializable {
	private static final long serialVersionUID = -34991342654292210L;
	/**
	 * id
	 */
	private Long id;
	/**
	 * subject_id
	 */
	private Long subjectId;
	/**
	 * subject_name
	 */
	private String subjectName;
	/**
	 * subject_img
	 */
	private String subjectImg;
	/**
	 * 活动url
	 */
	private String subjectUrll;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectImg() {
		return subjectImg;
	}

	public void setSubjectImg(String subjectImg) {
		this.subjectImg = subjectImg;
	}

	public String getSubjectUrll() {
		return subjectUrll;
	}

	public void setSubjectUrll(String subjectUrll) {
		this.subjectUrll = subjectUrll;
	}

}
