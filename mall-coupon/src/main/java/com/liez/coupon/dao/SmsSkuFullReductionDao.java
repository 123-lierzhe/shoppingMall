package com.liez.coupon.dao;

import com.liez.coupon.entity.SmsSkuFullReduction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品满减信息(SmsSkuFullReduction)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-07 20:50:25
 */
public interface SmsSkuFullReductionDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	SmsSkuFullReduction queryById(Long id);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<SmsSkuFullReduction> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param smsSkuFullReduction 实例对象
	 * @return 对象列表
	 */
	List<SmsSkuFullReduction> queryAll(SmsSkuFullReduction smsSkuFullReduction);

	/**
	 * 新增数据
	 *
	 * @param smsSkuFullReduction 实例对象
	 * @return 影响行数
	 */
	int insert(SmsSkuFullReduction smsSkuFullReduction);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<SmsSkuFullReduction> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<SmsSkuFullReduction> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<SmsSkuFullReduction> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<SmsSkuFullReduction> entities);

	/**
	 * 修改数据
	 *
	 * @param smsSkuFullReduction 实例对象
	 * @return 影响行数
	 */
	int update(SmsSkuFullReduction smsSkuFullReduction);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 影响行数
	 */
	int deleteById(Long id);

}

