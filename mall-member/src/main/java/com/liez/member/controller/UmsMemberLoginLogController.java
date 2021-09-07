package com.liez.member.controller;

import com.liez.member.entity.UmsMemberLoginLog;
import com.liez.member.service.UmsMemberLoginLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员登录记录(UmsMemberLoginLog)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:47:59
 */
@RestController
@RequestMapping("umsMemberLoginLog")
public class UmsMemberLoginLogController {
	/**
	 * 服务对象
	 */
	@Resource
	private UmsMemberLoginLogService umsMemberLoginLogService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public UmsMemberLoginLog selectOne(Long id) {
		return this.umsMemberLoginLogService.queryById(id);
	}

}
