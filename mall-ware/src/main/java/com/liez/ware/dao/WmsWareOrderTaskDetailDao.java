package com.liez.ware.dao;

import com.liez.ware.entity.WmsWareOrderTaskDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 库存工作单(WmsWareOrderTaskDetail)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-07 20:25:50
 */
public interface WmsWareOrderTaskDetailDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	WmsWareOrderTaskDetail queryById(Long id);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<WmsWareOrderTaskDetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param wmsWareOrderTaskDetail 实例对象
	 * @return 对象列表
	 */
	List<WmsWareOrderTaskDetail> queryAll(WmsWareOrderTaskDetail wmsWareOrderTaskDetail);

	/**
	 * 新增数据
	 *
	 * @param wmsWareOrderTaskDetail 实例对象
	 * @return 影响行数
	 */
	int insert(WmsWareOrderTaskDetail wmsWareOrderTaskDetail);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<WmsWareOrderTaskDetail> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<WmsWareOrderTaskDetail> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<WmsWareOrderTaskDetail> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<WmsWareOrderTaskDetail> entities);

	/**
	 * 修改数据
	 *
	 * @param wmsWareOrderTaskDetail 实例对象
	 * @return 影响行数
	 */
	int update(WmsWareOrderTaskDetail wmsWareOrderTaskDetail);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 影响行数
	 */
	int deleteById(Long id);

}

