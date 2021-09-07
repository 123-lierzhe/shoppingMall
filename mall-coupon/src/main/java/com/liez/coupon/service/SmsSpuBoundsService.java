package com.liez.coupon.service;

import com.liez.coupon.entity.SmsSpuBounds;

import java.util.List;

/**
 * 商品spu积分设置(SmsSpuBounds)表服务接口
 *
 * @author makejava
 * @since 2021-09-07 20:50:26
 */
public interface SmsSpuBoundsService {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	SmsSpuBounds queryById(Long id);

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<SmsSpuBounds> queryAllByLimit(int offset, int limit);

	/**
	 * 新增数据
	 *
	 * @param smsSpuBounds 实例对象
	 * @return 实例对象
	 */
	SmsSpuBounds insert(SmsSpuBounds smsSpuBounds);

	/**
	 * 修改数据
	 *
	 * @param smsSpuBounds 实例对象
	 * @return 实例对象
	 */
	SmsSpuBounds update(SmsSpuBounds smsSpuBounds);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	boolean deleteById(Long id);

}
