package com.liez.ware.service;

import com.liez.ware.entity.WmsPurchaseDetail;

import java.util.List;

/**
 * (WmsPurchaseDetail)表服务接口
 *
 * @author makejava
 * @since 2021-09-07 20:25:48
 */
public interface WmsPurchaseDetailService {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	WmsPurchaseDetail queryById(Long id);

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<WmsPurchaseDetail> queryAllByLimit(int offset, int limit);

	/**
	 * 新增数据
	 *
	 * @param wmsPurchaseDetail 实例对象
	 * @return 实例对象
	 */
	WmsPurchaseDetail insert(WmsPurchaseDetail wmsPurchaseDetail);

	/**
	 * 修改数据
	 *
	 * @param wmsPurchaseDetail 实例对象
	 * @return 实例对象
	 */
	WmsPurchaseDetail update(WmsPurchaseDetail wmsPurchaseDetail);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	boolean deleteById(Long id);

}
