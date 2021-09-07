package com.liez.product.controller;

import com.liez.product.entity.PmsSpuInfoDesc;
import com.liez.product.service.PmsSpuInfoDescService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * spu信息介绍(PmsSpuInfoDesc)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:41:03
 */
@RestController
@RequestMapping("pmsSpuInfoDesc")
public class PmsSpuInfoDescController {
	/**
	 * 服务对象
	 */
	@Resource
	private PmsSpuInfoDescService pmsSpuInfoDescService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public PmsSpuInfoDesc selectOne(Long id) {
		return this.pmsSpuInfoDescService.queryById(id);
	}

}
