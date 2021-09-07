package com.liez.order.controller;

import com.liez.order.entity.MqMessage;
import com.liez.order.service.MqMessageService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MqMessage)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:46:31
 */
@RestController
@RequestMapping("mqMessage")
public class MqMessageController {
	/**
	 * 服务对象
	 */
	@Resource
	private MqMessageService mqMessageService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public MqMessage selectOne(String id) {
		return this.mqMessageService.queryById(id);
	}

}
