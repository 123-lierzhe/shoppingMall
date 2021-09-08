package com.liez.member.controller;

import com.alibaba.fastjson.JSONObject;
import com.liez.common.utils.R;
import com.liez.member.entity.UmsMember;
import com.liez.member.feign.CouponClient;
import com.liez.member.service.UmsMemberService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员(UmsMember)表控制层
 *
 * @author makejava
 * @since 2021-09-06 20:22:21
 */
@RestController
@RequestMapping("umsMember")
public class UmsMemberController {
	/**
	 * 服务对象
	 */
	@Resource
	private UmsMemberService umsMemberService;
	@Resource
	private CouponClient couponClient;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne/{id}")
	public UmsMember selectOne(@PathVariable Long id) {
		return this.umsMemberService.queryById(id);
	}

	@PostMapping("getCouponByMember/{id}")
	public R getCouponByMember(@PathVariable Long id){
		UmsMember umsMember = new UmsMember();
		umsMember.setUsername("liez");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id",2L);
		return couponClient.selectOne(jsonObject);
	}

}
