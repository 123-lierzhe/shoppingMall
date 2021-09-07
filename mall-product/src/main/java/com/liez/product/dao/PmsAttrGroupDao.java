package com.liez.product.dao;

import com.liez.product.entity.PmsAttrGroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 属性分组(PmsAttrGroup)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-07 20:40:52
 */
public interface PmsAttrGroupDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param attrGroupId 主键
	 * @return 实例对象
	 */
	PmsAttrGroup queryById(Long attrGroupId);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<PmsAttrGroup> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param pmsAttrGroup 实例对象
	 * @return 对象列表
	 */
	List<PmsAttrGroup> queryAll(PmsAttrGroup pmsAttrGroup);

	/**
	 * 新增数据
	 *
	 * @param pmsAttrGroup 实例对象
	 * @return 影响行数
	 */
	int insert(PmsAttrGroup pmsAttrGroup);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<PmsAttrGroup> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<PmsAttrGroup> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<PmsAttrGroup> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<PmsAttrGroup> entities);

	/**
	 * 修改数据
	 *
	 * @param pmsAttrGroup 实例对象
	 * @return 影响行数
	 */
	int update(PmsAttrGroup pmsAttrGroup);

	/**
	 * 通过主键删除数据
	 *
	 * @param attrGroupId 主键
	 * @return 影响行数
	 */
	int deleteById(Long attrGroupId);

}

