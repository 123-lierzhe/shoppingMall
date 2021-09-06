package com.liez.order.controller;

import com.liez.order.entity.OmsOrder;
import com.liez.order.service.OmsOrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单(OmsOrder)表控制层
 *
 * @author makejava
 * @since 2021-09-06 20:59:53
 */
@RestController
@RequestMapping("omsOrder")
public class OmsOrderController {
	/**
	 * 服务对象
	 */
	@Resource
	private OmsOrderService omsOrderService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne/{id}")
	public OmsOrder selectOne(@PathVariable Long id) {
		return this.omsOrderService.queryById(id);
	}

}
