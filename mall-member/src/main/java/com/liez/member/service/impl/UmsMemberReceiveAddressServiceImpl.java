package com.liez.member.service.impl;

import com.liez.member.entity.UmsMemberReceiveAddress;
import com.liez.member.dao.UmsMemberReceiveAddressDao;
import com.liez.member.service.UmsMemberReceiveAddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 会员收货地址(UmsMemberReceiveAddress)表服务实现类
 *
 * @author makejava
 * @since 2021-09-07 20:47:59
 */
@Service("umsMemberReceiveAddressService")
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {
	@Resource
	private UmsMemberReceiveAddressDao umsMemberReceiveAddressDao;

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	@Override
	public UmsMemberReceiveAddress queryById(Long id) {
		return this.umsMemberReceiveAddressDao.queryById(id);
	}

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	@Override
	public List<UmsMemberReceiveAddress> queryAllByLimit(int offset, int limit) {
		return this.umsMemberReceiveAddressDao.queryAllByLimit(offset, limit);
	}

	/**
	 * 新增数据
	 *
	 * @param umsMemberReceiveAddress 实例对象
	 * @return 实例对象
	 */
	@Override
	public UmsMemberReceiveAddress insert(UmsMemberReceiveAddress umsMemberReceiveAddress) {
		this.umsMemberReceiveAddressDao.insert(umsMemberReceiveAddress);
		return umsMemberReceiveAddress;
	}

	/**
	 * 修改数据
	 *
	 * @param umsMemberReceiveAddress 实例对象
	 * @return 实例对象
	 */
	@Override
	public UmsMemberReceiveAddress update(UmsMemberReceiveAddress umsMemberReceiveAddress) {
		this.umsMemberReceiveAddressDao.update(umsMemberReceiveAddress);
		return this.queryById(umsMemberReceiveAddress.getId());
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(Long id) {
		return this.umsMemberReceiveAddressDao.deleteById(id) > 0;
	}
}
