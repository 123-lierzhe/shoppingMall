package com.liez.member.controller;

import com.liez.member.entity.UmsIntegrationChangeHistory;
import com.liez.member.service.UmsIntegrationChangeHistoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 积分变化历史记录(UmsIntegrationChangeHistory)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:47:56
 */
@RestController
@RequestMapping("umsIntegrationChangeHistory")
public class UmsIntegrationChangeHistoryController {
	/**
	 * 服务对象
	 */
	@Resource
	private UmsIntegrationChangeHistoryService umsIntegrationChangeHistoryService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public UmsIntegrationChangeHistory selectOne(Long id) {
		return this.umsIntegrationChangeHistoryService.queryById(id);
	}

}
