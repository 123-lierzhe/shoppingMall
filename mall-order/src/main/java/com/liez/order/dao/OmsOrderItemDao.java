package com.liez.order.dao;

import com.liez.order.entity.OmsOrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单项信息(OmsOrderItem)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-07 20:46:32
 */
public interface OmsOrderItemDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	OmsOrderItem queryById(Long id);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<OmsOrderItem> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param omsOrderItem 实例对象
	 * @return 对象列表
	 */
	List<OmsOrderItem> queryAll(OmsOrderItem omsOrderItem);

	/**
	 * 新增数据
	 *
	 * @param omsOrderItem 实例对象
	 * @return 影响行数
	 */
	int insert(OmsOrderItem omsOrderItem);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<OmsOrderItem> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<OmsOrderItem> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<OmsOrderItem> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<OmsOrderItem> entities);

	/**
	 * 修改数据
	 *
	 * @param omsOrderItem 实例对象
	 * @return 影响行数
	 */
	int update(OmsOrderItem omsOrderItem);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 影响行数
	 */
	int deleteById(Long id);

}

