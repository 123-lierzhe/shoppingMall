package com.liez.member.controller;

import com.liez.member.entity.UmsMemberReceiveAddress;
import com.liez.member.service.UmsMemberReceiveAddressService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员收货地址(UmsMemberReceiveAddress)表控制层
 *
 * @author makejava
 * @since 2021-09-07 20:47:59
 */
@RestController
@RequestMapping("umsMemberReceiveAddress")
public class UmsMemberReceiveAddressController {
	/**
	 * 服务对象
	 */
	@Resource
	private UmsMemberReceiveAddressService umsMemberReceiveAddressService;

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("selectOne")
	public UmsMemberReceiveAddress selectOne(Long id) {
		return this.umsMemberReceiveAddressService.queryById(id);
	}

}
