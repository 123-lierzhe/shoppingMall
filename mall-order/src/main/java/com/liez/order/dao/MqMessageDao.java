package com.liez.order.dao;

import com.liez.order.entity.MqMessage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (MqMessage)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-07 20:46:31
 */
public interface MqMessageDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param messageId 主键
	 * @return 实例对象
	 */
	MqMessage queryById(String messageId);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<MqMessage> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param mqMessage 实例对象
	 * @return 对象列表
	 */
	List<MqMessage> queryAll(MqMessage mqMessage);

	/**
	 * 新增数据
	 *
	 * @param mqMessage 实例对象
	 * @return 影响行数
	 */
	int insert(MqMessage mqMessage);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<MqMessage> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<MqMessage> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<MqMessage> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<MqMessage> entities);

	/**
	 * 修改数据
	 *
	 * @param mqMessage 实例对象
	 * @return 影响行数
	 */
	int update(MqMessage mqMessage);

	/**
	 * 通过主键删除数据
	 *
	 * @param messageId 主键
	 * @return 影响行数
	 */
	int deleteById(String messageId);

}

