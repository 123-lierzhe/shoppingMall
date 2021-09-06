package com.liez.coupon.service;

import com.liez.coupon.entity.SmsCoupon;

import java.util.List;

/**
 * 优惠券信息(SmsCoupon)表服务接口
 *
 * @author makejava
 * @since 2021-08-27 16:53:09
 */
public interface SmsCouponService {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	SmsCoupon queryById(Long id);

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<SmsCoupon> queryAllByLimit(int offset, int limit);

	/**
	 * 新增数据
	 *
	 * @param smsCoupon 实例对象
	 * @return 实例对象
	 */
	SmsCoupon insert(SmsCoupon smsCoupon);

	/**
	 * 修改数据
	 *
	 * @param smsCoupon 实例对象
	 * @return 实例对象
	 */
	SmsCoupon update(SmsCoupon smsCoupon);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	boolean deleteById(Long id);

}
