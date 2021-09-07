package com.liez.product.controller;

import com.liez.product.entity.PmsProductAttrValue;
import com.liez.product.service.PmsProductAttrValueService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * spu属性值(PmsProductAttrValue)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:40:57
 */
@RestController
@RequestMapping("pmsProductAttrValue")
public class PmsProductAttrValueController {
	/**
	 * 服务对象
	 */
	@Resource
	private PmsProductAttrValueService pmsProductAttrValueService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public PmsProductAttrValue selectOne(Long id) {
		return this.pmsProductAttrValueService.queryById(id);
	}

}
