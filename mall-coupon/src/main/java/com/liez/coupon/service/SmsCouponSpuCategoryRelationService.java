package com.liez.coupon.service;

import com.liez.coupon.entity.SmsCouponSpuCategoryRelation;

import java.util.List;

/**
 * 优惠券分类关联(SmsCouponSpuCategoryRelation)表服务接口
 *
 * @author makejava
 * @since 2021-09-07 20:50:16
 */
public interface SmsCouponSpuCategoryRelationService {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	SmsCouponSpuCategoryRelation queryById(Long id);

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<SmsCouponSpuCategoryRelation> queryAllByLimit(int offset, int limit);

	/**
	 * 新增数据
	 *
	 * @param smsCouponSpuCategoryRelation 实例对象
	 * @return 实例对象
	 */
	SmsCouponSpuCategoryRelation insert(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation);

	/**
	 * 修改数据
	 *
	 * @param smsCouponSpuCategoryRelation 实例对象
	 * @return 实例对象
	 */
	SmsCouponSpuCategoryRelation update(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	boolean deleteById(Long id);

}
