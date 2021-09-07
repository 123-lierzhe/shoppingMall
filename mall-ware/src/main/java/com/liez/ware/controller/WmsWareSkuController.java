package com.liez.ware.controller;

import com.liez.ware.entity.WmsWareSku;
import com.liez.ware.service.WmsWareSkuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品库存(WmsWareSku)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:25:52
 */
@RestController
@RequestMapping("wmsWareSku")
public class WmsWareSkuController {
	/**
	 * 服务对象
	 */
	@Resource
	private WmsWareSkuService wmsWareSkuService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public WmsWareSku selectOne(Long id) {
		return this.wmsWareSkuService.queryById(id);
	}

}
