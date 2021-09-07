package com.liez.order.controller;

import com.liez.order.entity.OmsPaymentInfo;
import com.liez.order.service.OmsPaymentInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 支付信息表(OmsPaymentInfo)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:46:36
 */
@RestController
@RequestMapping("omsPaymentInfo")
public class OmsPaymentInfoController {
	/**
	 * 服务对象
	 */
	@Resource
	private OmsPaymentInfoService omsPaymentInfoService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public OmsPaymentInfo selectOne(Long id) {
		return this.omsPaymentInfoService.queryById(id);
	}

}
