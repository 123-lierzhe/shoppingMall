package com.liez.order.service.impl;

import com.liez.order.entity.OmsOrderReturnReason;
import com.liez.order.dao.OmsOrderReturnReasonDao;
import com.liez.order.service.OmsOrderReturnReasonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 退货原因(OmsOrderReturnReason)表服务实现类
 *
 * @author makejava
 * @since 2021-09-07 20:46:34
 */
@Service("omsOrderReturnReasonService")
public class OmsOrderReturnReasonServiceImpl implements OmsOrderReturnReasonService {
	@Resource
	private OmsOrderReturnReasonDao omsOrderReturnReasonDao;

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	@Override
	public OmsOrderReturnReason queryById(Long id) {
		return this.omsOrderReturnReasonDao.queryById(id);
	}

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	@Override
	public List<OmsOrderReturnReason> queryAllByLimit(int offset, int limit) {
		return this.omsOrderReturnReasonDao.queryAllByLimit(offset, limit);
	}

	/**
	 * 新增数据
	 *
	 * @param omsOrderReturnReason 实例对象
	 * @return 实例对象
	 */
	@Override
	public OmsOrderReturnReason insert(OmsOrderReturnReason omsOrderReturnReason) {
		this.omsOrderReturnReasonDao.insert(omsOrderReturnReason);
		return omsOrderReturnReason;
	}

	/**
	 * 修改数据
	 *
	 * @param omsOrderReturnReason 实例对象
	 * @return 实例对象
	 */
	@Override
	public OmsOrderReturnReason update(OmsOrderReturnReason omsOrderReturnReason) {
		this.omsOrderReturnReasonDao.update(omsOrderReturnReason);
		return this.queryById(omsOrderReturnReason.getId());
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(Long id) {
		return this.omsOrderReturnReasonDao.deleteById(id) > 0;
	}
}
