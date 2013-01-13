package com.archivesManagement.dao;

import java.util.List;

import com.archivesManagement.domain.Archives;

public interface ArchivesDAO {
	//��������
	void create(Archives archives);
	//�޸ĵ���
	void update(Archives archives);
	//ɾ������
	void delete(Archives archives);
	//��ѯ����
	Archives query(int id);
	//��ѯ���е���
	List<Archives> queryList();
}
