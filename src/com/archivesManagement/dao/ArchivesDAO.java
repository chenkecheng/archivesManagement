package com.archivesManagement.dao;

import java.util.List;

import com.archivesManagement.domain.Archives;

public interface ArchivesDAO {
	//新增档案
	void create(Archives archives);
	//修改档案
	void update(Archives archives);
	//删除档案
	void delete(Archives archives);
	//查询档案
	Archives query(int id);
	//查询所有档案
	List<Archives> queryList();
}
