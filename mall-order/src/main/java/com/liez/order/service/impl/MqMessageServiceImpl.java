package com.liez.order.service.impl;

import com.liez.order.entity.MqMessage;
import com.liez.order.dao.MqMessageDao;
import com.liez.order.service.MqMessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (MqMessage)表服务实现类
 *
 * @author makejava
 * @since 2021-09-07 20:46:31
 */
@Service("mqMessageService")
public class MqMessageServiceImpl implements MqMessageService {
	@Resource
	private MqMessageDao mqMessageDao;

	/**
	 * 通过ID查询单条数据
	 *
	 * @param messageId 主键
	 * @return 实例对象
	 */
	@Override
	public MqMessage queryById(String messageId) {
		return this.mqMessageDao.queryById(messageId);
	}

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	@Override
	public List<MqMessage> queryAllByLimit(int offset, int limit) {
		return this.mqMessageDao.queryAllByLimit(offset, limit);
	}

	/**
	 * 新增数据
	 *
	 * @param mqMessage 实例对象
	 * @return 实例对象
	 */
	@Override
	public MqMessage insert(MqMessage mqMessage) {
		this.mqMessageDao.insert(mqMessage);
		return mqMessage;
	}

	/**
	 * 修改数据
	 *
	 * @param mqMessage 实例对象
	 * @return 实例对象
	 */
	@Override
	public MqMessage update(MqMessage mqMessage) {
		this.mqMessageDao.update(mqMessage);
		return this.queryById(mqMessage.getMessageId());
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param messageId 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(String messageId) {
		return this.mqMessageDao.deleteById(messageId) > 0;
	}
}
