package com.liez.coupon.controller;

import com.liez.coupon.entity.SmsHomeSubject;
import com.liez.coupon.service.SmsHomeSubjectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(SmsHomeSubject)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:50:20
 */
@RestController
@RequestMapping("smsHomeSubject")
public class SmsHomeSubjectController {
	/**
	 * 服务对象
	 */
	@Resource
	private SmsHomeSubjectService smsHomeSubjectService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public SmsHomeSubject selectOne(Long id) {
		return this.smsHomeSubjectService.queryById(id);
	}

}
