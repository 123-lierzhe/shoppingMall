package com.liez.member.controller;

import com.liez.member.entity.UndoLog;
import com.liez.member.service.UndoLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UndoLog)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:48:01
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
