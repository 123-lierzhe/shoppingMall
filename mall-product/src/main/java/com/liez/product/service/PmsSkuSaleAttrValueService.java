package com.liez.product.service;

import com.liez.product.entity.PmsSkuSaleAttrValue;

import java.util.List;

/**
 * sku销售属性&值(PmsSkuSaleAttrValue)表服务接口
 *
 * @author makejava
 * @since 2021-09-07 20:40:59
 */
public interface PmsSkuSaleAttrValueService {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	PmsSkuSaleAttrValue queryById(Long id);

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<PmsSkuSaleAttrValue> queryAllByLimit(int offset, int limit);

	/**
	 * 新增数据
	 *
	 * @param pmsSkuSaleAttrValue 实例对象
	 * @return 实例对象
	 */
	PmsSkuSaleAttrValue insert(PmsSkuSaleAttrValue pmsSkuSaleAttrValue);

	/**
	 * 修改数据
	 *
	 * @param pmsSkuSaleAttrValue 实例对象
	 * @return 实例对象
	 */
	PmsSkuSaleAttrValue update(PmsSkuSaleAttrValue pmsSkuSaleAttrValue);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	boolean deleteById(Long id);

}
