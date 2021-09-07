package com.liez.ware.controller;

import com.liez.ware.entity.WmsPurchaseDetail;
import com.liez.ware.service.WmsPurchaseDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (WmsPurchaseDetail)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:25:48
 */
@RestController
@RequestMapping("wmsPurchaseDetail")
public class WmsPurchaseDetailController {
	/**
	 * 服务对象
	 */
	@Resource
	private WmsPurchaseDetailService wmsPurchaseDetailService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public WmsPurchaseDetail selectOne(Long id) {
		return this.wmsPurchaseDetailService.queryById(id);
	}

}
