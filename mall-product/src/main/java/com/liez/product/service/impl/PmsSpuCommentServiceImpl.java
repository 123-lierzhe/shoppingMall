package com.liez.product.service.impl;

import com.liez.product.entity.PmsSpuComment;
import com.liez.product.dao.PmsSpuCommentDao;
import com.liez.product.service.PmsSpuCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品评价(PmsSpuComment)表服务实现类
 *
 * @author makejava
 * @since 2021-09-07 20:41:00
 */
@Service("pmsSpuCommentService")
public class PmsSpuCommentServiceImpl implements PmsSpuCommentService {
	@Resource
	private PmsSpuCommentDao pmsSpuCommentDao;

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	@Override
	public PmsSpuComment queryById(Long id) {
		return this.pmsSpuCommentDao.queryById(id);
	}

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	@Override
	public List<PmsSpuComment> queryAllByLimit(int offset, int limit) {
		return this.pmsSpuCommentDao.queryAllByLimit(offset, limit);
	}

	/**
	 * 新增数据
	 *
	 * @param pmsSpuComment 实例对象
	 * @return 实例对象
	 */
	@Override
	public PmsSpuComment insert(PmsSpuComment pmsSpuComment) {
		this.pmsSpuCommentDao.insert(pmsSpuComment);
		return pmsSpuComment;
	}

	/**
	 * 修改数据
	 *
	 * @param pmsSpuComment 实例对象
	 * @return 实例对象
	 */
	@Override
	public PmsSpuComment update(PmsSpuComment pmsSpuComment) {
		this.pmsSpuCommentDao.update(pmsSpuComment);
		return this.queryById(pmsSpuComment.getId());
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(Long id) {
		return this.pmsSpuCommentDao.deleteById(id) > 0;
	}
}
