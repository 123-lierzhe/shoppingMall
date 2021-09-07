package com.liez.coupon.controller;

import com.liez.coupon.entity.SmsSkuFullReduction;
import com.liez.coupon.service.SmsSkuFullReductionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品满减信息(SmsSkuFullReduction)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:50:25
 */
@RestController
@RequestMapping("smsSkuFullReduction")
public class SmsSkuFullReductionController {
	/**
	 * 服务对象
	 */
	@Resource
	private SmsSkuFullReductionService smsSkuFullReductionService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public SmsSkuFullReduction selectOne(Long id) {
		return this.smsSkuFullReductionService.queryById(id);
	}

}
