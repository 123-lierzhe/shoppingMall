package com.liez.coupon.controller;

import com.liez.coupon.entity.SmsSeckillSkuNotice;
import com.liez.coupon.service.SmsSeckillSkuNoticeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 秒杀商品通知订阅(SmsSeckillSkuNotice)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:50:24
 */
@RestController
@RequestMapping("smsSeckillSkuNotice")
public class SmsSeckillSkuNoticeController {
	/**
	 * 服务对象
	 */
	@Resource
	private SmsSeckillSkuNoticeService smsSeckillSkuNoticeService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public SmsSeckillSkuNotice selectOne(Long id) {
		return this.smsSeckillSkuNoticeService.queryById(id);
	}

}
