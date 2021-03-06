package com.liez.coupon.dao;

import com.liez.coupon.entity.SmsMemberPrice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品会员价格(SmsMemberPrice)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-07 20:50:21
 */
public interface SmsMemberPriceDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	SmsMemberPrice queryById(Long id);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<SmsMemberPrice> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param smsMemberPrice 实例对象
	 * @return 对象列表
	 */
	List<SmsMemberPrice> queryAll(SmsMemberPrice smsMemberPrice);

	/**
	 * 新增数据
	 *
	 * @param smsMemberPrice 实例对象
	 * @return 影响行数
	 */
	int insert(SmsMemberPrice smsMemberPrice);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<SmsMemberPrice> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<SmsMemberPrice> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<SmsMemberPrice> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<SmsMemberPrice> entities);

	/**
	 * 修改数据
	 *
	 * @param smsMemberPrice 实例对象
	 * @return 影响行数
	 */
	int update(SmsMemberPrice smsMemberPrice);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 影响行数
	 */
	int deleteById(Long id);

}

