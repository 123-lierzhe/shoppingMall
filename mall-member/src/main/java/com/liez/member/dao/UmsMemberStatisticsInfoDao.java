package com.liez.member.dao;

import com.liez.member.entity.UmsMemberStatisticsInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 会员统计信息(UmsMemberStatisticsInfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-07 20:48:00
 */
public interface UmsMemberStatisticsInfoDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	UmsMemberStatisticsInfo queryById(Long id);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<UmsMemberStatisticsInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param umsMemberStatisticsInfo 实例对象
	 * @return 对象列表
	 */
	List<UmsMemberStatisticsInfo> queryAll(UmsMemberStatisticsInfo umsMemberStatisticsInfo);

	/**
	 * 新增数据
	 *
	 * @param umsMemberStatisticsInfo 实例对象
	 * @return 影响行数
	 */
	int insert(UmsMemberStatisticsInfo umsMemberStatisticsInfo);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<UmsMemberStatisticsInfo> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<UmsMemberStatisticsInfo> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<UmsMemberStatisticsInfo> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<UmsMemberStatisticsInfo> entities);

	/**
	 * 修改数据
	 *
	 * @param umsMemberStatisticsInfo 实例对象
	 * @return 影响行数
	 */
	int update(UmsMemberStatisticsInfo umsMemberStatisticsInfo);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 影响行数
	 */
	int deleteById(Long id);

}

