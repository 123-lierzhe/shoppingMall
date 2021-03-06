package com.liez.order.service;

import com.liez.order.entity.OmsOrderReturnApply;

import java.util.List;

/**
 * 订单退货申请(OmsOrderReturnApply)表服务接口
 *
 * @author makejava
 * @since 2021-09-07 20:46:33
 */
public interface OmsOrderReturnApplyService {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	OmsOrderReturnApply queryById(Long id);

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<OmsOrderReturnApply> queryAllByLimit(int offset, int limit);

	/**
	 * 新增数据
	 *
	 * @param omsOrderReturnApply 实例对象
	 * @return 实例对象
	 */
	OmsOrderReturnApply insert(OmsOrderReturnApply omsOrderReturnApply);

	/**
	 * 修改数据
	 *
	 * @param omsOrderReturnApply 实例对象
	 * @return 实例对象
	 */
	OmsOrderReturnApply update(OmsOrderReturnApply omsOrderReturnApply);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	boolean deleteById(Long id);

}
