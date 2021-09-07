package com.liez.ware.controller;

import com.liez.ware.entity.WmsWareOrderTask;
import com.liez.ware.service.WmsWareOrderTaskService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 库存工作单(WmsWareOrderTask)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:25:49
 */
@RestController
@RequestMapping("wmsWareOrderTask")
public class WmsWareOrderTaskController {
	/**
	 * 服务对象
	 */
	@Resource
	private WmsWareOrderTaskService wmsWareOrderTaskService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public WmsWareOrderTask selectOne(Long id) {
		return this.wmsWareOrderTaskService.queryById(id);
	}

}
