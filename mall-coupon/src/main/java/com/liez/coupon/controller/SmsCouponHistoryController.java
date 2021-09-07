package com.liez.coupon.controller;

import com.liez.coupon.entity.SmsCouponHistory;
import com.liez.coupon.service.SmsCouponHistoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 优惠券领取历史记录(SmsCouponHistory)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:50:16
 */
@RestController
@RequestMapping("smsCouponHistory")
public class SmsCouponHistoryController {
	/**
	 * 服务对象
	 */
	@Resource
	private SmsCouponHistoryService smsCouponHistoryService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public SmsCouponHistory selectOne(Long id) {
		return this.smsCouponHistoryService.queryById(id);
	}

}
