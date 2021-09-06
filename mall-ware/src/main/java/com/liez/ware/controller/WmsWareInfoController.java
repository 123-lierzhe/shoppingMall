package com.liez.ware.controller;

import com.liez.ware.entity.WmsWareInfo;
import com.liez.ware.service.WmsWareInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 仓库信息(WmsWareInfo)表控制层
 *
 * @author makejava
 * @since 2021-09-06 21:17:43
 */
@RestController
@RequestMapping("wmsWareInfo")
public class WmsWareInfoController {
	/**
	 * 服务对象
	 */
	@Resource
	private WmsWareInfoService wmsWareInfoService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne/{id}")
	public WmsWareInfo selectOne(@PathVariable Long id) {
		return this.wmsWareInfoService.queryById(id);
	}

}
