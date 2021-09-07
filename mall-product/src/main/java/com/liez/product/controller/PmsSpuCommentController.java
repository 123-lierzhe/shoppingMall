package com.liez.product.controller;

import com.liez.product.entity.PmsSpuComment;
import com.liez.product.service.PmsSpuCommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品评价(PmsSpuComment)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:41:00
 */
@RestController
@RequestMapping("pmsSpuComment")
public class PmsSpuCommentController {
	/**
	 * 服务对象
	 */
	@Resource
	private PmsSpuCommentService pmsSpuCommentService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public PmsSpuComment selectOne(Long id) {
		return this.pmsSpuCommentService.queryById(id);
	}

}
