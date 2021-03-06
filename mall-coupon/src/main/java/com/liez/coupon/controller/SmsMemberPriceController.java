package com.liez.coupon.controller;

import com.liez.coupon.entity.SmsMemberPrice;
import com.liez.coupon.service.SmsMemberPriceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品会员价格(SmsMemberPrice)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:50:21
 */
@RestController
@RequestMapping("smsMemberPrice")
public class SmsMemberPriceController {
	/**
	 * 服务对象
	 */
	@Resource
	private SmsMemberPriceService smsMemberPriceService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public SmsMemberPrice selectOne(Long id) {
		return this.smsMemberPriceService.queryById(id);
	}

}
