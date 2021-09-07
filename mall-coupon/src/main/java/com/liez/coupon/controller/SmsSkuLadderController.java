package com.liez.coupon.controller;

import com.liez.coupon.entity.SmsSkuLadder;
import com.liez.coupon.service.SmsSkuLadderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品阶梯价格(SmsSkuLadder)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:50:26
 */
@RestController
@RequestMapping("smsSkuLadder")
public class SmsSkuLadderController {
	/**
	 * 服务对象
	 */
	@Resource
	private SmsSkuLadderService smsSkuLadderService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public SmsSkuLadder selectOne(Long id) {
		return this.smsSkuLadderService.queryById(id);
	}

}
