package com.liez.product.controller;

import com.liez.product.entity.PmsAttr;
import com.liez.product.service.PmsAttrService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品属性(PmsAttr)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:40:51
 */
@RestController
@RequestMapping("pmsAttr")
public class PmsAttrController {
	/**
	 * 服务对象
	 */
	@Resource
	private PmsAttrService pmsAttrService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public PmsAttr selectOne(Long id) {
		return this.pmsAttrService.queryById(id);
	}

}
