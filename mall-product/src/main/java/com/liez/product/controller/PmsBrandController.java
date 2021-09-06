package com.liez.product.controller;

import com.liez.product.entity.PmsBrand;
import com.liez.product.service.PmsBrandService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 品牌(PmsBrand)表控制层
 *
 * @author makejava
 * @since 2021-09-06 21:13:12
 */
@RestController
@RequestMapping("pmsBrand")
public class PmsBrandController {
	/**
	 * 服务对象
	 */
	@Resource
	private PmsBrandService pmsBrandService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne/{id}")
	public PmsBrand selectOne(@PathVariable Long id) {
		return this.pmsBrandService.queryById(id);
	}

}
