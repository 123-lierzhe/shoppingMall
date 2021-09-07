package com.liez.product.dao;

import com.liez.product.entity.PmsSkuInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * sku信息(PmsSkuInfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-07 20:40:58
 */
public interface PmsSkuInfoDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param skuId 主键
	 * @return 实例对象
	 */
	PmsSkuInfo queryById(Long skuId);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<PmsSkuInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param pmsSkuInfo 实例对象
	 * @return 对象列表
	 */
	List<PmsSkuInfo> queryAll(PmsSkuInfo pmsSkuInfo);

	/**
	 * 新增数据
	 *
	 * @param pmsSkuInfo 实例对象
	 * @return 影响行数
	 */
	int insert(PmsSkuInfo pmsSkuInfo);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<PmsSkuInfo> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<PmsSkuInfo> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<PmsSkuInfo> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<PmsSkuInfo> entities);

	/**
	 * 修改数据
	 *
	 * @param pmsSkuInfo 实例对象
	 * @return 影响行数
	 */
	int update(PmsSkuInfo pmsSkuInfo);

	/**
	 * 通过主键删除数据
	 *
	 * @param skuId 主键
	 * @return 影响行数
	 */
	int deleteById(Long skuId);

}

