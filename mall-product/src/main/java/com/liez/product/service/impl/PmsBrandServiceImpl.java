package com.liez.product.service.impl;

import com.liez.product.entity.PmsBrand;
import com.liez.product.dao.PmsBrandDao;
import com.liez.product.service.PmsBrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 品牌(PmsBrand)表服务实现类
 *
 * @author makejava
 * @since 2021-09-06 21:13:12
 */
@Service("pmsBrandService")
public class PmsBrandServiceImpl implements PmsBrandService {
	@Resource
	private PmsBrandDao pmsBrandDao;

	/**
	 * 通过ID查询单条数据
	 *
	 * @param brandId 主键
	 * @return 实例对象
	 */
	@Override
	public PmsBrand queryById(Long brandId) {
		return this.pmsBrandDao.queryById(brandId);
	}

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	@Override
	public List<PmsBrand> queryAllByLimit(int offset, int limit) {
		return this.pmsBrandDao.queryAllByLimit(offset, limit);
	}

	/**
	 * 新增数据
	 *
	 * @param pmsBrand 实例对象
	 * @return 实例对象
	 */
	@Override
	public PmsBrand insert(PmsBrand pmsBrand) {
		this.pmsBrandDao.insert(pmsBrand);
		return pmsBrand;
	}

	/**
	 * 修改数据
	 *
	 * @param pmsBrand 实例对象
	 * @return 实例对象
	 */
	@Override
	public PmsBrand update(PmsBrand pmsBrand) {
		this.pmsBrandDao.update(pmsBrand);
		return this.queryById(pmsBrand.getBrandId());
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param brandId 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(Long brandId) {
		return this.pmsBrandDao.deleteById(brandId) > 0;
	}
}
