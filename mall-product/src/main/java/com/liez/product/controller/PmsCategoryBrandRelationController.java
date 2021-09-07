package com.liez.product.controller;

import com.liez.product.entity.PmsCategoryBrandRelation;
import com.liez.product.service.PmsCategoryBrandRelationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 品牌分类关联(PmsCategoryBrandRelation)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:40:55
 */
@RestController
@RequestMapping("pmsCategoryBrandRelation")
public class PmsCategoryBrandRelationController {
	/**
	 * 服务对象
	 */
	@Resource
	private PmsCategoryBrandRelationService pmsCategoryBrandRelationService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public PmsCategoryBrandRelation selectOne(Long id) {
		return this.pmsCategoryBrandRelationService.queryById(id);
	}

}
