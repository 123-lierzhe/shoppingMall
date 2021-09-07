package com.liez.coupon.dao;

import com.liez.coupon.entity.SmsCouponSpuCategoryRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 优惠券分类关联(SmsCouponSpuCategoryRelation)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-07 20:50:16
 */
public interface SmsCouponSpuCategoryRelationDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	SmsCouponSpuCategoryRelation queryById(Long id);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<SmsCouponSpuCategoryRelation> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param smsCouponSpuCategoryRelation 实例对象
	 * @return 对象列表
	 */
	List<SmsCouponSpuCategoryRelation> queryAll(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation);

	/**
	 * 新增数据
	 *
	 * @param smsCouponSpuCategoryRelation 实例对象
	 * @return 影响行数
	 */
	int insert(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<SmsCouponSpuCategoryRelation> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<SmsCouponSpuCategoryRelation> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<SmsCouponSpuCategoryRelation> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<SmsCouponSpuCategoryRelation> entities);

	/**
	 * 修改数据
	 *
	 * @param smsCouponSpuCategoryRelation 实例对象
	 * @return 影响行数
	 */
	int update(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 影响行数
	 */
	int deleteById(Long id);

}

