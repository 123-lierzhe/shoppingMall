package com.liez.coupon.controller;

import com.liez.coupon.entity.SmsSeckillSkuRelation;
import com.liez.coupon.service.SmsSeckillSkuRelationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 秒杀活动商品关联(SmsSeckillSkuRelation)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:50:24
 */
@RestController
@RequestMapping("smsSeckillSkuRelation")
public class SmsSeckillSkuRelationController {
	/**
	 * 服务对象
	 */
	@Resource
	private SmsSeckillSkuRelationService smsSeckillSkuRelationService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public SmsSeckillSkuRelation selectOne(Long id) {
		return this.smsSeckillSkuRelationService.queryById(id);
	}

}
