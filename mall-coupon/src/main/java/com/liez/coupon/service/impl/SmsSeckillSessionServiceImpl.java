package com.liez.coupon.service.impl;

import com.liez.coupon.entity.SmsSeckillSession;
import com.liez.coupon.dao.SmsSeckillSessionDao;
import com.liez.coupon.service.SmsSeckillSessionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 秒杀活动场次(SmsSeckillSession)表服务实现类
 *
 * @author makejava
 * @since 2021-09-07 20:50:23
 */
@Service("smsSeckillSessionService")
public class SmsSeckillSessionServiceImpl implements SmsSeckillSessionService {
	@Resource
	private SmsSeckillSessionDao smsSeckillSessionDao;

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	@Override
	public SmsSeckillSession queryById(Long id) {
		return this.smsSeckillSessionDao.queryById(id);
	}

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	@Override
	public List<SmsSeckillSession> queryAllByLimit(int offset, int limit) {
		return this.smsSeckillSessionDao.queryAllByLimit(offset, limit);
	}

	/**
	 * 新增数据
	 *
	 * @param smsSeckillSession 实例对象
	 * @return 实例对象
	 */
	@Override
	public SmsSeckillSession insert(SmsSeckillSession smsSeckillSession) {
		this.smsSeckillSessionDao.insert(smsSeckillSession);
		return smsSeckillSession;
	}

	/**
	 * 修改数据
	 *
	 * @param smsSeckillSession 实例对象
	 * @return 实例对象
	 */
	@Override
	public SmsSeckillSession update(SmsSeckillSession smsSeckillSession) {
		this.smsSeckillSessionDao.update(smsSeckillSession);
		return this.queryById(smsSeckillSession.getId());
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(Long id) {
		return this.smsSeckillSessionDao.deleteById(id) > 0;
	}
}
