package com.liez.member.service;

import com.liez.member.entity.UmsMemberLoginLog;

import java.util.List;

/**
 * 会员登录记录(UmsMemberLoginLog)表服务接口
 *
 * @author makejava
 * @since 2021-09-07 20:47:58
 */
public interface UmsMemberLoginLogService {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	UmsMemberLoginLog queryById(Long id);

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<UmsMemberLoginLog> queryAllByLimit(int offset, int limit);

	/**
	 * 新增数据
	 *
	 * @param umsMemberLoginLog 实例对象
	 * @return 实例对象
	 */
	UmsMemberLoginLog insert(UmsMemberLoginLog umsMemberLoginLog);

	/**
	 * 修改数据
	 *
	 * @param umsMemberLoginLog 实例对象
	 * @return 实例对象
	 */
	UmsMemberLoginLog update(UmsMemberLoginLog umsMemberLoginLog);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	boolean deleteById(Long id);

}
