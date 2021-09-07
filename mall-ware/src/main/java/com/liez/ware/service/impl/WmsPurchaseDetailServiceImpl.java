package com.liez.ware.service.impl;

import com.liez.ware.entity.WmsPurchaseDetail;
import com.liez.ware.dao.WmsPurchaseDetailDao;
import com.liez.ware.service.WmsPurchaseDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (WmsPurchaseDetail)表服务实现类
 *
 * @author makejava
 * @since 2021-09-07 20:25:48
 */
@Service("wmsPurchaseDetailService")
public class WmsPurchaseDetailServiceImpl implements WmsPurchaseDetailService {
	@Resource
	private WmsPurchaseDetailDao wmsPurchaseDetailDao;

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	@Override
	public WmsPurchaseDetail queryById(Long id) {
		return this.wmsPurchaseDetailDao.queryById(id);
	}

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	@Override
	public List<WmsPurchaseDetail> queryAllByLimit(int offset, int limit) {
		return this.wmsPurchaseDetailDao.queryAllByLimit(offset, limit);
	}

	/**
	 * 新增数据
	 *
	 * @param wmsPurchaseDetail 实例对象
	 * @return 实例对象
	 */
	@Override
	public WmsPurchaseDetail insert(WmsPurchaseDetail wmsPurchaseDetail) {
		this.wmsPurchaseDetailDao.insert(wmsPurchaseDetail);
		return wmsPurchaseDetail;
	}

	/**
	 * 修改数据
	 *
	 * @param wmsPurchaseDetail 实例对象
	 * @return 实例对象
	 */
	@Override
	public WmsPurchaseDetail update(WmsPurchaseDetail wmsPurchaseDetail) {
		this.wmsPurchaseDetailDao.update(wmsPurchaseDetail);
		return this.queryById(wmsPurchaseDetail.getId());
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(Long id) {
		return this.wmsPurchaseDetailDao.deleteById(id) > 0;
	}
}
