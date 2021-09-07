package com.liez.coupon.controller;

import com.liez.coupon.entity.SmsHomeAdv;
import com.liez.coupon.service.SmsHomeAdvService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 首页轮播广告(SmsHomeAdv)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:50:19
 */
@RestController
@RequestMapping("smsHomeAdv")
public class SmsHomeAdvController {
	/**
	 * 服务对象
	 */
	@Resource
	private SmsHomeAdvService smsHomeAdvService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public SmsHomeAdv selectOne(Long id) {
		return this.smsHomeAdvService.queryById(id);
	}

}
