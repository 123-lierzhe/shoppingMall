package com.liez.coupon.dao;

import com.liez.coupon.entity.SmsCoupon;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 优惠券信息(SmsCoupon)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-27 16:53:06
 */
public interface SmsCouponDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	SmsCoupon queryById(Long id);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<SmsCoupon> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param smsCoupon 实例对象
	 * @return 对象列表
	 */
	List<SmsCoupon> queryAll(SmsCoupon smsCoupon);

	/**
	 * 新增数据
	 *
	 * @param smsCoupon 实例对象
	 * @return 影响行数
	 */
	int insert(SmsCoupon smsCoupon);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<SmsCoupon> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<SmsCoupon> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<SmsCoupon> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<SmsCoupon> entities);

	/**
	 * 修改数据
	 *
	 * @param smsCoupon 实例对象
	 * @return 影响行数
	 */
	int update(SmsCoupon smsCoupon);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 影响行数
	 */
	int deleteById(Long id);

}

