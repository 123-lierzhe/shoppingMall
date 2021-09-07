package com.liez.product.service.impl;

import com.liez.product.entity.PmsSpuInfo;
import com.liez.product.dao.PmsSpuInfoDao;
import com.liez.product.service.PmsSpuInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * spu信息(PmsSpuInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-09-07 20:41:02
 */
@Service("pmsSpuInfoService")
public class PmsSpuInfoServiceImpl implements PmsSpuInfoService {
	@Resource
	private PmsSpuInfoDao pmsSpuInfoDao;

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	@Override
	public PmsSpuInfo queryById(Long id) {
		return this.pmsSpuInfoDao.queryById(id);
	}

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	@Override
	public List<PmsSpuInfo> queryAllByLimit(int offset, int limit) {
		return this.pmsSpuInfoDao.queryAllByLimit(offset, limit);
	}

	/**
	 * 新增数据
	 *
	 * @param pmsSpuInfo 实例对象
	 * @return 实例对象
	 */
	@Override
	public PmsSpuInfo insert(PmsSpuInfo pmsSpuInfo) {
		this.pmsSpuInfoDao.insert(pmsSpuInfo);
		return pmsSpuInfo;
	}

	/**
	 * 修改数据
	 *
	 * @param pmsSpuInfo 实例对象
	 * @return 实例对象
	 */
	@Override
	public PmsSpuInfo update(PmsSpuInfo pmsSpuInfo) {
		this.pmsSpuInfoDao.update(pmsSpuInfo);
		return this.queryById(pmsSpuInfo.getId());
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(Long id) {
		return this.pmsSpuInfoDao.deleteById(id) > 0;
	}
}
