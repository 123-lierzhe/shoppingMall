package com.liez.member.controller;

import com.liez.member.entity.UmsMemberLevel;
import com.liez.member.service.UmsMemberLevelService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员等级(UmsMemberLevel)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:47:58
 */
@RestController
@RequestMapping("umsMemberLevel")
public class UmsMemberLevelController {
	/**
	 * 服务对象
	 */
	@Resource
	private UmsMemberLevelService umsMemberLevelService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public UmsMemberLevel selectOne(Long id) {
		return this.umsMemberLevelService.queryById(id);
	}

}
