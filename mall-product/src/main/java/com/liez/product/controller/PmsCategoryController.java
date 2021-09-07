package com.liez.product.controller;

import com.liez.product.entity.PmsCategory;
import com.liez.product.service.PmsCategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品三级分类(PmsCategory)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:40:54
 */
@RestController
@RequestMapping("pmsCategory")
public class PmsCategoryController {
	/**
	 * 服务对象
	 */
	@Resource
	private PmsCategoryService pmsCategoryService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public PmsCategory selectOne(Long id) {
		return this.pmsCategoryService.queryById(id);
	}

}
