package com.archivesManagement.dao;

import java.util.List;

import com.archivesManagement.domain.ArchivesLog;

public interface ArchivesLogDAO {
	//新增档案借阅记录
	void create(ArchivesLog archivesLog);
	//删除档案借阅记录
	void delete(ArchivesLog archivesLog);
	//修改档案借阅记录
	void update(ArchivesLog archivesLog);
	//查询所有的档案借阅记录
	List<ArchivesLog> query();
}
