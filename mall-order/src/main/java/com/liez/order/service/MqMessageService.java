package com.liez.order.service;

import com.liez.order.entity.MqMessage;

import java.util.List;

/**
 * (MqMessage)表服务接口
 *
 * @author makejava
 * @since 2021-09-07 20:46:31
 */
public interface MqMessageService {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param messageId 主键
	 * @return 实例对象
	 */
	MqMessage queryById(String messageId);

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<MqMessage> queryAllByLimit(int offset, int limit);

	/**
	 * 新增数据
	 *
	 * @param mqMessage 实例对象
	 * @return 实例对象
	 */
	MqMessage insert(MqMessage mqMessage);

	/**
	 * 修改数据
	 *
	 * @param mqMessage 实例对象
	 * @return 实例对象
	 */
	MqMessage update(MqMessage mqMessage);

	/**
	 * 通过主键删除数据
	 *
	 * @param messageId 主键
	 * @return 是否成功
	 */
	boolean deleteById(String messageId);

}
