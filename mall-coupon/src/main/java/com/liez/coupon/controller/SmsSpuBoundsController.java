package com.liez.coupon.controller;

import com.liez.coupon.entity.SmsSpuBounds;
import com.liez.coupon.service.SmsSpuBoundsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品spu积分设置(SmsSpuBounds)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:50:26
 */
@RestController
@RequestMapping("smsSpuBounds")
public class SmsSpuBoundsController {
	/**
	 * 服务对象
	 */
	@Resource
	private SmsSpuBoundsService smsSpuBoundsService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public SmsSpuBounds selectOne(Long id) {
		return this.smsSpuBoundsService.queryById(id);
	}

}
