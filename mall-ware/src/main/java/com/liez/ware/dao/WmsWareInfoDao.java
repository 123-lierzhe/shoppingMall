package com.liez.ware.dao;

import com.liez.ware.entity.WmsWareInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 仓库信息(WmsWareInfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-06 21:17:41
 */
@Mapper
public interface WmsWareInfoDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	WmsWareInfo queryById(Long id);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<WmsWareInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param wmsWareInfo 实例对象
	 * @return 对象列表
	 */
	List<WmsWareInfo> queryAll(WmsWareInfo wmsWareInfo);

	/**
	 * 新增数据
	 *
	 * @param wmsWareInfo 实例对象
	 * @return 影响行数
	 */
	int insert(WmsWareInfo wmsWareInfo);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<WmsWareInfo> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<WmsWareInfo> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<WmsWareInfo> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<WmsWareInfo> entities);

	/**
	 * 修改数据
	 *
	 * @param wmsWareInfo 实例对象
	 * @return 影响行数
	 */
	int update(WmsWareInfo wmsWareInfo);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 影响行数
	 */
	int deleteById(Long id);

}

