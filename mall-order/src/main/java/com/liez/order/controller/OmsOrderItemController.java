package com.liez.order.controller;

import com.liez.order.entity.OmsOrderItem;
import com.liez.order.service.OmsOrderItemService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单项信息(OmsOrderItem)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:46:32
 */
@RestController
@RequestMapping("omsOrderItem")
public class OmsOrderItemController {
	/**
	 * 服务对象
	 */
	@Resource
	private OmsOrderItemService omsOrderItemService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public OmsOrderItem selectOne(Long id) {
		return this.omsOrderItemService.queryById(id);
	}

}
