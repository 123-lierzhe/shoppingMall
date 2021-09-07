package com.liez.member.controller;

import com.liez.member.entity.UmsGrowthChangeHistory;
import com.liez.member.service.UmsGrowthChangeHistoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 成长值变化历史记录(UmsGrowthChangeHistory)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:47:55
 */
@RestController
@RequestMapping("umsGrowthChangeHistory")
public class UmsGrowthChangeHistoryController {
	/**
	 * 服务对象
	 */
	@Resource
	private UmsGrowthChangeHistoryService umsGrowthChangeHistoryService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public UmsGrowthChangeHistory selectOne(Long id) {
		return this.umsGrowthChangeHistoryService.queryById(id);
	}

}
