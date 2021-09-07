package com.liez.ware.dao;

import com.liez.ware.entity.WmsWareOrderTask;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 库存工作单(WmsWareOrderTask)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-07 20:25:49
 */
public interface WmsWareOrderTaskDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	WmsWareOrderTask queryById(Long id);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<WmsWareOrderTask> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param wmsWareOrderTask 实例对象
	 * @return 对象列表
	 */
	List<WmsWareOrderTask> queryAll(WmsWareOrderTask wmsWareOrderTask);

	/**
	 * 新增数据
	 *
	 * @param wmsWareOrderTask 实例对象
	 * @return 影响行数
	 */
	int insert(WmsWareOrderTask wmsWareOrderTask);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<WmsWareOrderTask> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<WmsWareOrderTask> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<WmsWareOrderTask> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<WmsWareOrderTask> entities);

	/**
	 * 修改数据
	 *
	 * @param wmsWareOrderTask 实例对象
	 * @return 影响行数
	 */
	int update(WmsWareOrderTask wmsWareOrderTask);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 影响行数
	 */
	int deleteById(Long id);

}

