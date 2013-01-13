package com.archivesManagement.dao;

import java.util.List;

import com.archivesManagement.domain.ArchivesLog;

public interface ArchivesLogDAO {
	//�����������ļ�¼
	void create(ArchivesLog archivesLog);
	//ɾ���������ļ�¼
	void delete(ArchivesLog archivesLog);
	//�޸ĵ������ļ�¼
	void update(ArchivesLog archivesLog);
	//��ѯ���еĵ������ļ�¼
	List<ArchivesLog> query();
}
