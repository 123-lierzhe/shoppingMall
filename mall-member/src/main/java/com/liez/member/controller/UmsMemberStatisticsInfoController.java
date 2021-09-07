package com.liez.member.controller;

import com.liez.member.entity.UmsMemberStatisticsInfo;
import com.liez.member.service.UmsMemberStatisticsInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员统计信息(UmsMemberStatisticsInfo)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:48:00
 */
@RestController
@RequestMapping("umsMemberStatisticsInfo")
public class UmsMemberStatisticsInfoController {
	/**
	 * 服务对象
	 */
	@Resource
	private UmsMemberStatisticsInfoService umsMemberStatisticsInfoService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public UmsMemberStatisticsInfo selectOne(Long id) {
		return this.umsMemberStatisticsInfoService.queryById(id);
	}

}
