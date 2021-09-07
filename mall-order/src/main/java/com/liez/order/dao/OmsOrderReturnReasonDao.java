package com.liez.order.dao;

import com.liez.order.entity.OmsOrderReturnReason;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 退货原因(OmsOrderReturnReason)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-07 20:46:34
 */
public interface OmsOrderReturnReasonDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	OmsOrderReturnReason queryById(Long id);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<OmsOrderReturnReason> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param omsOrderReturnReason 实例对象
	 * @return 对象列表
	 */
	List<OmsOrderReturnReason> queryAll(OmsOrderReturnReason omsOrderReturnReason);

	/**
	 * 新增数据
	 *
	 * @param omsOrderReturnReason 实例对象
	 * @return 影响行数
	 */
	int insert(OmsOrderReturnReason omsOrderReturnReason);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<OmsOrderReturnReason> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<OmsOrderReturnReason> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<OmsOrderReturnReason> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<OmsOrderReturnReason> entities);

	/**
	 * 修改数据
	 *
	 * @param omsOrderReturnReason 实例对象
	 * @return 影响行数
	 */
	int update(OmsOrderReturnReason omsOrderReturnReason);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 影响行数
	 */
	int deleteById(Long id);

}

