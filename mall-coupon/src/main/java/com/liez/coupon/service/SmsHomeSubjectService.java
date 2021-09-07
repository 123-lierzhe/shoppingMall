package com.liez.coupon.service;

import com.liez.coupon.entity.SmsHomeSubject;

import java.util.List;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(SmsHomeSubject)表服务接口
 *
 * @author makejava
 * @since 2021-09-07 20:50:20
 */
public interface SmsHomeSubjectService {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	SmsHomeSubject queryById(Long id);

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<SmsHomeSubject> queryAllByLimit(int offset, int limit);

	/**
	 * 新增数据
	 *
	 * @param smsHomeSubject 实例对象
	 * @return 实例对象
	 */
	SmsHomeSubject insert(SmsHomeSubject smsHomeSubject);

	/**
	 * 修改数据
	 *
	 * @param smsHomeSubject 实例对象
	 * @return 实例对象
	 */
	SmsHomeSubject update(SmsHomeSubject smsHomeSubject);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	boolean deleteById(Long id);

}
