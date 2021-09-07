package com.liez.ware.service.impl;

import com.liez.ware.entity.WmsPurchase;
import com.liez.ware.dao.WmsPurchaseDao;
import com.liez.ware.service.WmsPurchaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 采购信息(WmsPurchase)表服务实现类
 *
 * @author makejava
 * @since 2021-09-07 20:25:46
 */
@Service("wmsPurchaseService")
public class WmsPurchaseServiceImpl implements WmsPurchaseService {
	@Resource
	private WmsPurchaseDao wmsPurchaseDao;

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	@Override
	public WmsPurchase queryById(Long id) {
		return this.wmsPurchaseDao.queryById(id);
	}

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	@Override
	public List<WmsPurchase> queryAllByLimit(int offset, int limit) {
		return this.wmsPurchaseDao.queryAllByLimit(offset, limit);
	}

	/**
	 * 新增数据
	 *
	 * @param wmsPurchase 实例对象
	 * @return 实例对象
	 */
	@Override
	public WmsPurchase insert(WmsPurchase wmsPurchase) {
		this.wmsPurchaseDao.insert(wmsPurchase);
		return wmsPurchase;
	}

	/**
	 * 修改数据
	 *
	 * @param wmsPurchase 实例对象
	 * @return 实例对象
	 */
	@Override
	public WmsPurchase update(WmsPurchase wmsPurchase) {
		this.wmsPurchaseDao.update(wmsPurchase);
		return this.queryById(wmsPurchase.getId());
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(Long id) {
		return this.wmsPurchaseDao.deleteById(id) > 0;
	}
}
