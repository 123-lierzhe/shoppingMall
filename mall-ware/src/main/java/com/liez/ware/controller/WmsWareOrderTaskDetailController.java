package com.liez.ware.controller;

import com.liez.ware.entity.WmsWareOrderTaskDetail;
import com.liez.ware.service.WmsWareOrderTaskDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 库存工作单(WmsWareOrderTaskDetail)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:25:51
 */
@RestController
@RequestMapping("wmsWareOrderTaskDetail")
public class WmsWareOrderTaskDetailController {
	/**
	 * 服务对象
	 */
	@Resource
	private WmsWareOrderTaskDetailService wmsWareOrderTaskDetailService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public WmsWareOrderTaskDetail selectOne(Long id) {
		return this.wmsWareOrderTaskDetailService.queryById(id);
	}

}
