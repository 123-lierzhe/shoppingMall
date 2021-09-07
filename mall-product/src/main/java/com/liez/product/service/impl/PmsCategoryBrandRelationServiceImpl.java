package com.liez.product.service.impl;

import com.liez.product.entity.PmsCategoryBrandRelation;
import com.liez.product.dao.PmsCategoryBrandRelationDao;
import com.liez.product.service.PmsCategoryBrandRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 品牌分类关联(PmsCategoryBrandRelation)表服务实现类
 *
 * @author makejava
 * @since 2021-09-07 20:40:55
 */
@Service("pmsCategoryBrandRelationService")
public class PmsCategoryBrandRelationServiceImpl implements PmsCategoryBrandRelationService {
	@Resource
	private PmsCategoryBrandRelationDao pmsCategoryBrandRelationDao;

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	@Override
	public PmsCategoryBrandRelation queryById(Long id) {
		return this.pmsCategoryBrandRelationDao.queryById(id);
	}

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	@Override
	public List<PmsCategoryBrandRelation> queryAllByLimit(int offset, int limit) {
		return this.pmsCategoryBrandRelationDao.queryAllByLimit(offset, limit);
	}

	/**
	 * 新增数据
	 *
	 * @param pmsCategoryBrandRelation 实例对象
	 * @return 实例对象
	 */
	@Override
	public PmsCategoryBrandRelation insert(PmsCategoryBrandRelation pmsCategoryBrandRelation) {
		this.pmsCategoryBrandRelationDao.insert(pmsCategoryBrandRelation);
		return pmsCategoryBrandRelation;
	}

	/**
	 * 修改数据
	 *
	 * @param pmsCategoryBrandRelation 实例对象
	 * @return 实例对象
	 */
	@Override
	public PmsCategoryBrandRelation update(PmsCategoryBrandRelation pmsCategoryBrandRelation) {
		this.pmsCategoryBrandRelationDao.update(pmsCategoryBrandRelation);
		return this.queryById(pmsCategoryBrandRelation.getId());
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(Long id) {
		return this.pmsCategoryBrandRelationDao.deleteById(id) > 0;
	}
}
