package com.liez.member.dao;

import com.liez.member.entity.UmsMemberReceiveAddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 会员收货地址(UmsMemberReceiveAddress)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-07 20:47:59
 */
public interface UmsMemberReceiveAddressDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	UmsMemberReceiveAddress queryById(Long id);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<UmsMemberReceiveAddress> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param umsMemberReceiveAddress 实例对象
	 * @return 对象列表
	 */
	List<UmsMemberReceiveAddress> queryAll(UmsMemberReceiveAddress umsMemberReceiveAddress);

	/**
	 * 新增数据
	 *
	 * @param umsMemberReceiveAddress 实例对象
	 * @return 影响行数
	 */
	int insert(UmsMemberReceiveAddress umsMemberReceiveAddress);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<UmsMemberReceiveAddress> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<UmsMemberReceiveAddress> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<UmsMemberReceiveAddress> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<UmsMemberReceiveAddress> entities);

	/**
	 * 修改数据
	 *
	 * @param umsMemberReceiveAddress 实例对象
	 * @return 影响行数
	 */
	int update(UmsMemberReceiveAddress umsMemberReceiveAddress);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 影响行数
	 */
	int deleteById(Long id);

}

