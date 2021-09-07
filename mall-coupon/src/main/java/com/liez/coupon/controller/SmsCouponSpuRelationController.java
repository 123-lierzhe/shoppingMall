package com.liez.coupon.controller;

import com.liez.coupon.entity.SmsCouponSpuRelation;
import com.liez.coupon.service.SmsCouponSpuRelationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 优惠券与产品关联(SmsCouponSpuRelation)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:50:17
 */
@RestController
@RequestMapping("smsCouponSpuRelation")
public class SmsCouponSpuRelationController {
	/**
	 * 服务对象
	 */
	@Resource
	private SmsCouponSpuRelationService smsCouponSpuRelationService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public SmsCouponSpuRelation selectOne(Long id) {
		return this.smsCouponSpuRelationService.queryById(id);
	}

}
