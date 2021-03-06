package com.liez.product.service;

import com.liez.product.entity.PmsSpuInfo;

import java.util.List;

/**
 * spu信息(PmsSpuInfo)表服务接口
 *
 * @author makejava
 * @since 2021-09-07 20:41:02
 */
public interface PmsSpuInfoService {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	PmsSpuInfo queryById(Long id);

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<PmsSpuInfo> queryAllByLimit(int offset, int limit);

	/**
	 * 新增数据
	 *
	 * @param pmsSpuInfo 实例对象
	 * @return 实例对象
	 */
	PmsSpuInfo insert(PmsSpuInfo pmsSpuInfo);

	/**
	 * 修改数据
	 *
	 * @param pmsSpuInfo 实例对象
	 * @return 实例对象
	 */
	PmsSpuInfo update(PmsSpuInfo pmsSpuInfo);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	boolean deleteById(Long id);

}
