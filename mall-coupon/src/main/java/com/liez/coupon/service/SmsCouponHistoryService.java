package com.liez.coupon.service;

import com.liez.coupon.entity.SmsCouponHistory;

import java.util.List;

/**
 * 优惠券领取历史记录(SmsCouponHistory)表服务接口
 *
 * @author makejava
 * @since 2021-09-07 20:50:16
 */
public interface SmsCouponHistoryService {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	SmsCouponHistory queryById(Long id);

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<SmsCouponHistory> queryAllByLimit(int offset, int limit);

	/**
	 * 新增数据
	 *
	 * @param smsCouponHistory 实例对象
	 * @return 实例对象
	 */
	SmsCouponHistory insert(SmsCouponHistory smsCouponHistory);

	/**
	 * 修改数据
	 *
	 * @param smsCouponHistory 实例对象
	 * @return 实例对象
	 */
	SmsCouponHistory update(SmsCouponHistory smsCouponHistory);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	boolean deleteById(Long id);

}
