package com.liez.member.dao;

import com.liez.member.entity.UmsMemberCollectSpu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 会员收藏的商品(UmsMemberCollectSpu)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-07 20:47:56
 */
public interface UmsMemberCollectSpuDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	UmsMemberCollectSpu queryById(Long id);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<UmsMemberCollectSpu> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param umsMemberCollectSpu 实例对象
	 * @return 对象列表
	 */
	List<UmsMemberCollectSpu> queryAll(UmsMemberCollectSpu umsMemberCollectSpu);

	/**
	 * 新增数据
	 *
	 * @param umsMemberCollectSpu 实例对象
	 * @return 影响行数
	 */
	int insert(UmsMemberCollectSpu umsMemberCollectSpu);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<UmsMemberCollectSpu> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<UmsMemberCollectSpu> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<UmsMemberCollectSpu> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<UmsMemberCollectSpu> entities);

	/**
	 * 修改数据
	 *
	 * @param umsMemberCollectSpu 实例对象
	 * @return 影响行数
	 */
	int update(UmsMemberCollectSpu umsMemberCollectSpu);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 影响行数
	 */
	int deleteById(Long id);

}

