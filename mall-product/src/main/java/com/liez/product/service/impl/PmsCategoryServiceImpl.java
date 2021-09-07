package com.liez.product.service.impl;

import com.liez.product.entity.PmsCategory;
import com.liez.product.dao.PmsCategoryDao;
import com.liez.product.service.PmsCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品三级分类(PmsCategory)表服务实现类
 *
 * @author makejava
 * @since 2021-09-07 20:40:54
 */
@Service("pmsCategoryService")
public class PmsCategoryServiceImpl implements PmsCategoryService {
	@Resource
	private PmsCategoryDao pmsCategoryDao;

	/**
	 * 通过ID查询单条数据
	 *
	 * @param catId 主键
	 * @return 实例对象
	 */
	@Override
	public PmsCategory queryById(Long catId) {
		return this.pmsCategoryDao.queryById(catId);
	}

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	@Override
	public List<PmsCategory> queryAllByLimit(int offset, int limit) {
		return this.pmsCategoryDao.queryAllByLimit(offset, limit);
	}

	/**
	 * 新增数据
	 *
	 * @param pmsCategory 实例对象
	 * @return 实例对象
	 */
	@Override
	public PmsCategory insert(PmsCategory pmsCategory) {
		this.pmsCategoryDao.insert(pmsCategory);
		return pmsCategory;
	}

	/**
	 * 修改数据
	 *
	 * @param pmsCategory 实例对象
	 * @return 实例对象
	 */
	@Override
	public PmsCategory update(PmsCategory pmsCategory) {
		this.pmsCategoryDao.update(pmsCategory);
		return this.queryById(pmsCategory.getCatId());
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param catId 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(Long catId) {
		return this.pmsCategoryDao.deleteById(catId) > 0;
	}
}
