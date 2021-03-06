package com.liez.member.dao;

import com.liez.member.entity.UmsGrowthChangeHistory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 成长值变化历史记录(UmsGrowthChangeHistory)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-07 20:47:55
 */
public interface UmsGrowthChangeHistoryDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	UmsGrowthChangeHistory queryById(Long id);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<UmsGrowthChangeHistory> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param umsGrowthChangeHistory 实例对象
	 * @return 对象列表
	 */
	List<UmsGrowthChangeHistory> queryAll(UmsGrowthChangeHistory umsGrowthChangeHistory);

	/**
	 * 新增数据
	 *
	 * @param umsGrowthChangeHistory 实例对象
	 * @return 影响行数
	 */
	int insert(UmsGrowthChangeHistory umsGrowthChangeHistory);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<UmsGrowthChangeHistory> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<UmsGrowthChangeHistory> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<UmsGrowthChangeHistory> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<UmsGrowthChangeHistory> entities);

	/**
	 * 修改数据
	 *
	 * @param umsGrowthChangeHistory 实例对象
	 * @return 影响行数
	 */
	int update(UmsGrowthChangeHistory umsGrowthChangeHistory);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 影响行数
	 */
	int deleteById(Long id);

}

