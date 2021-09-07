package com.liez.order.controller;

import com.liez.order.entity.OmsOrderOperateHistory;
import com.liez.order.service.OmsOrderOperateHistoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单操作历史记录(OmsOrderOperateHistory)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:46:33
 */
@RestController
@RequestMapping("omsOrderOperateHistory")
public class OmsOrderOperateHistoryController {
	/**
	 * 服务对象
	 */
	@Resource
	private OmsOrderOperateHistoryService omsOrderOperateHistoryService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public OmsOrderOperateHistory selectOne(Long id) {
		return this.omsOrderOperateHistoryService.queryById(id);
	}

}
