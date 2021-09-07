package com.liez.member.controller;

import com.liez.member.entity.UmsMemberCollectSubject;
import com.liez.member.service.UmsMemberCollectSubjectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员收藏的专题活动(UmsMemberCollectSubject)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:47:57
 */
@RestController
@RequestMapping("umsMemberCollectSubject")
public class UmsMemberCollectSubjectController {
	/**
	 * 服务对象
	 */
	@Resource
	private UmsMemberCollectSubjectService umsMemberCollectSubjectService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public UmsMemberCollectSubject selectOne(Long id) {
		return this.umsMemberCollectSubjectService.queryById(id);
	}

}
