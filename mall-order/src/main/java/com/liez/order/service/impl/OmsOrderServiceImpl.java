package com.liez.order.service.impl;

import com.liez.order.entity.OmsOrder;
import com.liez.order.dao.OmsOrderDao;
import com.liez.order.service.OmsOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单(OmsOrder)表服务实现类
 *
 * @author makejava
 * @since 2021-09-06 20:59:52
 */
@Service("omsOrderService")
public class OmsOrderServiceImpl implements OmsOrderService {
	@Resource
	private OmsOrderDao omsOrderDao;

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	@Override
	public OmsOrder queryById(Long id) {
		return this.omsOrderDao.queryById(id);
	}

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	@Override
	public List<OmsOrder> queryAllByLimit(int offset, int limit) {
		return this.omsOrderDao.queryAllByLimit(offset, limit);
	}

	/**
	 * 新增数据
	 *
	 * @param omsOrder 实例对象
	 * @return 实例对象
	 */
	@Override
	public OmsOrder insert(OmsOrder omsOrder) {
		this.omsOrderDao.insert(omsOrder);
		return omsOrder;
	}

	/**
	 * 修改数据
	 *
	 * @param omsOrder 实例对象
	 * @return 实例对象
	 */
	@Override
	public OmsOrder update(OmsOrder omsOrder) {
		this.omsOrderDao.update(omsOrder);
		return this.queryById(omsOrder.getId());
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(Long id) {
		return this.omsOrderDao.deleteById(id) > 0;
	}
}
