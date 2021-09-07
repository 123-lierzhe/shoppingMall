package com.liez.order.controller;

import com.liez.order.entity.OmsOrderSetting;
import com.liez.order.service.OmsOrderSettingService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单配置信息(OmsOrderSetting)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:46:35
 */
@RestController
@RequestMapping("omsOrderSetting")
public class OmsOrderSettingController {
	/**
	 * 服务对象
	 */
	@Resource
	private OmsOrderSettingService omsOrderSettingService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public OmsOrderSetting selectOne(Long id) {
		return this.omsOrderSettingService.queryById(id);
	}

}
