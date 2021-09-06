package com.liez.product.dao;

import com.liez.product.entity.PmsBrand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 品牌(PmsBrand)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-06 21:13:11
 */
@Mapper
public interface PmsBrandDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param brandId 主键
	 * @return 实例对象
	 */
	PmsBrand queryById(Long brandId);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<PmsBrand> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param pmsBrand 实例对象
	 * @return 对象列表
	 */
	List<PmsBrand> queryAll(PmsBrand pmsBrand);

	/**
	 * 新增数据
	 *
	 * @param pmsBrand 实例对象
	 * @return 影响行数
	 */
	int insert(PmsBrand pmsBrand);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<PmsBrand> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<PmsBrand> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<PmsBrand> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<PmsBrand> entities);

	/**
	 * 修改数据
	 *
	 * @param pmsBrand 实例对象
	 * @return 影响行数
	 */
	int update(PmsBrand pmsBrand);

	/**
	 * 通过主键删除数据
	 *
	 * @param brandId 主键
	 * @return 影响行数
	 */
	int deleteById(Long brandId);

}

