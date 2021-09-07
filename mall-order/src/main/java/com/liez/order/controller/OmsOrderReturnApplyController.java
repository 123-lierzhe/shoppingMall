package com.liez.order.controller;

import com.liez.order.entity.OmsOrderReturnApply;
import com.liez.order.service.OmsOrderReturnApplyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单退货申请(OmsOrderReturnApply)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:46:34
 */
@RestController
@RequestMapping("omsOrderReturnApply")
public class OmsOrderReturnApplyController {
	/**
	 * 服务对象
	 */
	@Resource
	private OmsOrderReturnApplyService omsOrderReturnApplyService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public OmsOrderReturnApply selectOne(Long id) {
		return this.omsOrderReturnApplyService.queryById(id);
	}

}
