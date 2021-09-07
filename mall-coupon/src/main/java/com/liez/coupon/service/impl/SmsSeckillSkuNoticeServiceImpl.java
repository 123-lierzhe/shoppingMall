package com.liez.coupon.service.impl;

import com.liez.coupon.entity.SmsSeckillSkuNotice;
import com.liez.coupon.dao.SmsSeckillSkuNoticeDao;
import com.liez.coupon.service.SmsSeckillSkuNoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 秒杀商品通知订阅(SmsSeckillSkuNotice)表服务实现类
 *
 * @author makejava
 * @since 2021-09-07 20:50:23
 */
@Service("smsSeckillSkuNoticeService")
public class SmsSeckillSkuNoticeServiceImpl implements SmsSeckillSkuNoticeService {
	@Resource
	private SmsSeckillSkuNoticeDao smsSeckillSkuNoticeDao;

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	@Override
	public SmsSeckillSkuNotice queryById(Long id) {
		return this.smsSeckillSkuNoticeDao.queryById(id);
	}

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	@Override
	public List<SmsSeckillSkuNotice> queryAllByLimit(int offset, int limit) {
		return this.smsSeckillSkuNoticeDao.queryAllByLimit(offset, limit);
	}

	/**
	 * 新增数据
	 *
	 * @param smsSeckillSkuNotice 实例对象
	 * @return 实例对象
	 */
	@Override
	public SmsSeckillSkuNotice insert(SmsSeckillSkuNotice smsSeckillSkuNotice) {
		this.smsSeckillSkuNoticeDao.insert(smsSeckillSkuNotice);
		return smsSeckillSkuNotice;
	}

	/**
	 * 修改数据
	 *
	 * @param smsSeckillSkuNotice 实例对象
	 * @return 实例对象
	 */
	@Override
	public SmsSeckillSkuNotice update(SmsSeckillSkuNotice smsSeckillSkuNotice) {
		this.smsSeckillSkuNoticeDao.update(smsSeckillSkuNotice);
		return this.queryById(smsSeckillSkuNotice.getId());
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(Long id) {
		return this.smsSeckillSkuNoticeDao.deleteById(id) > 0;
	}
}
