package com.liez.order.controller;

import com.liez.order.entity.UndoLog;
import com.liez.order.service.UndoLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UndoLog)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:46:38
 */
@RestController
@RequestMapping("undoLog")
public class UndoLogController {
	/**
	 * 服务对象
	 */
	@Resource
	private UndoLogService undoLogService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public UndoLog selectOne(Long id) {
		return this.undoLogService.queryById(id);
	}

}
