package com.liez.product.dao;

import com.liez.product.entity.PmsSpuComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品评价(PmsSpuComment)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-07 20:41:00
 */
public interface PmsSpuCommentDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	PmsSpuComment queryById(Long id);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<PmsSpuComment> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param pmsSpuComment 实例对象
	 * @return 对象列表
	 */
	List<PmsSpuComment> queryAll(PmsSpuComment pmsSpuComment);

	/**
	 * 新增数据
	 *
	 * @param pmsSpuComment 实例对象
	 * @return 影响行数
	 */
	int insert(PmsSpuComment pmsSpuComment);

	/**
	 * 批量新增数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<PmsSpuComment> 实例对象列表
	 * @return 影响行数
	 */
	int insertBatch(@Param("entities") List<PmsSpuComment> entities);

	/**
	 * 批量新增或按主键更新数据（MyBatis原生foreach方法）
	 *
	 * @param entities List<PmsSpuComment> 实例对象列表
	 * @return 影响行数
	 */
	int insertOrUpdateBatch(@Param("entities") List<PmsSpuComment> entities);

	/**
	 * 修改数据
	 *
	 * @param pmsSpuComment 实例对象
	 * @return 影响行数
	 */
	int update(PmsSpuComment pmsSpuComment);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 影响行数
	 */
	int deleteById(Long id);

}

