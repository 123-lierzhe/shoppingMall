package com.liez.coupon.controller;

import com.liez.coupon.entity.SmsSeckillSession;
import com.liez.coupon.service.SmsSeckillSessionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 秒杀活动场次(SmsSeckillSession)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:50:23
 */
@RestController
@RequestMapping("smsSeckillSession")
public class SmsSeckillSessionController {
	/**
	 * 服务对象
	 */
	@Resource
	private SmsSeckillSessionService smsSeckillSessionService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public SmsSeckillSession selectOne(Long id) {
		return this.smsSeckillSessionService.queryById(id);
	}

}
