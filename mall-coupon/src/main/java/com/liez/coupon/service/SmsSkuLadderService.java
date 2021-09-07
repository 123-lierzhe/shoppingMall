package com.liez.coupon.service;

import com.liez.coupon.entity.SmsSkuLadder;

import java.util.List;

/**
 * 商品阶梯价格(SmsSkuLadder)表服务接口
 *
 * @author makejava
 * @since 2021-09-07 20:50:26
 */
public interface SmsSkuLadderService {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	SmsSkuLadder queryById(Long id);

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<SmsSkuLadder> queryAllByLimit(int offset, int limit);

	/**
	 * 新增数据
	 *
	 * @param smsSkuLadder 实例对象
	 * @return 实例对象
	 */
	SmsSkuLadder insert(SmsSkuLadder smsSkuLadder);

	/**
	 * 修改数据
	 *
	 * @param smsSkuLadder 实例对象
	 * @return 实例对象
	 */
	SmsSkuLadder update(SmsSkuLadder smsSkuLadder);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	boolean deleteById(Long id);

}
