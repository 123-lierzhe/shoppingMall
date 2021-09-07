package com.liez.coupon.dao;

import com.liez.coupon.entity.SmsHomeSubject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(SmsHomeSubject)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-07 20:50:20
 */
public interface SmsHomeSubjectDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	SmsHomeSubject queryById(Long id);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<SmsHomeSubject> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param smsHomeSubject 实例对象
	 * @return 对象列表
	 */
	List<SmsHomeSubject> queryAll(SmsHomeSubject smsHomeSubject);

	/**
	 * 新增数据
	 *
	 * @param smsHomeSubject 实例对象
	 * @return 影响行数
	 */
	int insert(SmsHomeSubject smsHomeSubject);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<SmsHomeSubject> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<SmsHomeSubject> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<SmsHomeSubject> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<SmsHomeSubject> entities);

	/**
	 * 修改数据
	 *
	 * @param smsHomeSubject 实例对象
	 * @return 影响行数
	 */
	int update(SmsHomeSubject smsHomeSubject);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 影响行数
	 */
	int deleteById(Long id);

}

