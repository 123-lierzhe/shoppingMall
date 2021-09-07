package com.liez.product.dao;

import com.liez.product.entity.PmsAttr;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品属性(PmsAttr)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-07 20:40:50
 */
public interface PmsAttrDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param attrId 主键
	 * @return 实例对象
	 */
	PmsAttr queryById(Long attrId);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<PmsAttr> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param pmsAttr 实例对象
	 * @return 对象列表
	 */
	List<PmsAttr> queryAll(PmsAttr pmsAttr);

	/**
	 * 新增数据
	 *
	 * @param pmsAttr 实例对象
	 * @return 影响行数
	 */
	int insert(PmsAttr pmsAttr);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<PmsAttr> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<PmsAttr> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<PmsAttr> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<PmsAttr> entities);

	/**
	 * 修改数据
	 *
	 * @param pmsAttr 实例对象
	 * @return 影响行数
	 */
	int update(PmsAttr pmsAttr);

	/**
	 * 通过主键删除数据
	 *
	 * @param attrId 主键
	 * @return 影响行数
	 */
	int deleteById(Long attrId);

}

