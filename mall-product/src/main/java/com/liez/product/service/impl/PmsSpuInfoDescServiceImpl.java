package com.liez.product.service.impl;

import com.liez.product.entity.PmsSpuInfoDesc;
import com.liez.product.dao.PmsSpuInfoDescDao;
import com.liez.product.service.PmsSpuInfoDescService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * spu信息介绍(PmsSpuInfoDesc)表服务实现类
 *
 * @author makejava
 * @since 2021-09-07 20:41:03
 */
@Service("pmsSpuInfoDescService")
public class PmsSpuInfoDescServiceImpl implements PmsSpuInfoDescService {
	@Resource
	private PmsSpuInfoDescDao pmsSpuInfoDescDao;

	/**
	 * 通过ID查询单条数据
	 *
	 * @param spuId 主键
	 * @return 实例对象
	 */
	@Override
	public PmsSpuInfoDesc queryById(Long spuId) {
		return this.pmsSpuInfoDescDao.queryById(spuId);
	}

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	@Override
	public List<PmsSpuInfoDesc> queryAllByLimit(int offset, int limit) {
		return this.pmsSpuInfoDescDao.queryAllByLimit(offset, limit);
	}

	/**
	 * 新增数据
	 *
	 * @param pmsSpuInfoDesc 实例对象
	 * @return 实例对象
	 */
	@Override
	public PmsSpuInfoDesc insert(PmsSpuInfoDesc pmsSpuInfoDesc) {
		this.pmsSpuInfoDescDao.insert(pmsSpuInfoDesc);
		return pmsSpuInfoDesc;
	}

	/**
	 * 修改数据
	 *
	 * @param pmsSpuInfoDesc 实例对象
	 * @return 实例对象
	 */
	@Override
	public PmsSpuInfoDesc update(PmsSpuInfoDesc pmsSpuInfoDesc) {
		this.pmsSpuInfoDescDao.update(pmsSpuInfoDesc);
		return this.queryById(pmsSpuInfoDesc.getSpuId());
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param spuId 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(Long spuId) {
		return this.pmsSpuInfoDescDao.deleteById(spuId) > 0;
	}
}
