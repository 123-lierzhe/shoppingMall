package com.liez.coupon.service;

import com.liez.coupon.entity.SmsSeckillSession;

import java.util.List;

/**
 * 秒杀活动场次(SmsSeckillSession)表服务接口
 *
 * @author makejava
 * @since 2021-09-07 20:50:22
 */
public interface SmsSeckillSessionService {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	SmsSeckillSession queryById(Long id);

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<SmsSeckillSession> queryAllByLimit(int offset, int limit);

	/**
	 * 新增数据
	 *
	 * @param smsSeckillSession 实例对象
	 * @return 实例对象
	 */
	SmsSeckillSession insert(SmsSeckillSession smsSeckillSession);

	/**
	 * 修改数据
	 *
	 * @param smsSeckillSession 实例对象
	 * @return 实例对象
	 */
	SmsSeckillSession update(SmsSeckillSession smsSeckillSession);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	boolean deleteById(Long id);

}
