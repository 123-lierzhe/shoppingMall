package com.liez.member.dao;

import com.liez.member.entity.UmsMember;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 会员(UmsMember)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-06 20:22:15
 */
@Mapper
public interface UmsMemberDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	UmsMember queryById(Long id);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<UmsMember> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param umsMember 实例对象
	 * @return 对象列表
	 */
	List<UmsMember> queryAll(UmsMember umsMember);

	/**
	 * 新增数据
	 *
	 * @param umsMember 实例对象
	 * @return 影响行数
	 */
	int insert(UmsMember umsMember);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<UmsMember> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<UmsMember> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<UmsMember> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<UmsMember> entities);

	/**
	 * 修改数据
	 *
	 * @param umsMember 实例对象
	 * @return 影响行数
	 */
	int update(UmsMember umsMember);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 影响行数
	 */
	int deleteById(Long id);

}

