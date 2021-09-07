package com.liez.product.controller;

import com.liez.product.entity.PmsSpuInfo;
import com.liez.product.service.PmsSpuInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * spu信息(PmsSpuInfo)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:41:02
 */
@RestController
@RequestMapping("pmsSpuInfo")
public class PmsSpuInfoController {
	/**
	 * 服务对象
	 */
	@Resource
	private PmsSpuInfoService pmsSpuInfoService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public PmsSpuInfo selectOne(Long id) {
		return this.pmsSpuInfoService.queryById(id);
	}

}
