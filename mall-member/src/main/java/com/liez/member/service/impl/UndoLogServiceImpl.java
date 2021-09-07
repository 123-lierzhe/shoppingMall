package com.liez.member.service.impl;

import com.liez.member.entity.UndoLog;
import com.liez.member.dao.UndoLogDao;
import com.liez.member.service.UndoLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UndoLog)表服务实现类
 *
 * @author makejava
 * @since 2021-09-07 20:48:01
 */
@Service("undoLogService")
public class UndoLogServiceImpl implements UndoLogService {
	@Resource
	private UndoLogDao undoLogDao;

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	@Override
	public UndoLog queryById(Long id) {
		return this.undoLogDao.queryById(id);
	}

	/**
	 * 查询多条数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	@Override
	public List<UndoLog> queryAllByLimit(int offset, int limit) {
		return this.undoLogDao.queryAllByLimit(offset, limit);
	}

	/**
	 * 新增数据
	 *
	 * @param undoLog 实例对象
	 * @return 实例对象
	 */
	@Override
	public UndoLog insert(UndoLog undoLog) {
		this.undoLogDao.insert(undoLog);
		return undoLog;
	}

	/**
	 * 修改数据
	 *
	 * @param undoLog 实例对象
	 * @return 实例对象
	 */
	@Override
	public UndoLog update(UndoLog undoLog) {
		this.undoLogDao.update(undoLog);
		return this.queryById(undoLog.getId());
	}

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 是否成功
	 */
	@Override
	public boolean deleteById(Long id) {
		return this.undoLogDao.deleteById(id) > 0;
	}
}
