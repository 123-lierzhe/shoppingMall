package com.liez.ware.controller;

import com.liez.ware.entity.WmsPurchase;
import com.liez.ware.service.WmsPurchaseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 采购信息(WmsPurchase)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:25:47
 */
@RestController
@RequestMapping("wmsPurchase")
public class WmsPurchaseController {
	/**
	 * 服务对象
	 */
	@Resource
	private WmsPurchaseService wmsPurchaseService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public WmsPurchase selectOne(Long id) {
		return this.wmsPurchaseService.queryById(id);
	}

}
