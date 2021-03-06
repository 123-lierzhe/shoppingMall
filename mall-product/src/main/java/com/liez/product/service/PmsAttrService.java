package com.liez.product.service;

import com.liez.product.entity.PmsAttr;

import java.util.List;

/**
 * 商品属性(PmsAttr)表服务接口
 *
 * @author makejava
 * @since 2021-09-07 20:40:51
 */
public interface PmsAttrService {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param attrId 主键
	 * @return 实例对象
	 */
	PmsAttr queryById(Long attrId);

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<PmsAttr> queryAllByLimit(int offset, int limit);

	/**
	 * 新增数据
	 *
	 * @param pmsAttr 实例对象
	 * @return 实例对象
	 */
	PmsAttr insert(PmsAttr pmsAttr);

	/**
	 * 修改数据
	 *
	 * @param pmsAttr 实例对象
	 * @return 实例对象
	 */
	PmsAttr update(PmsAttr pmsAttr);

	/**
	 * 通过主键删除数据
	 *
	 * @param attrId 主键
	 * @return 是否成功
	 */
	boolean deleteById(Long attrId);

}
