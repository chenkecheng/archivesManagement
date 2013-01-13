package com.archivesManagement.dao;

import java.util.List;

import com.archivesManagement.domain.Position;

public interface PositionDAO {
	//�����������λ��
	void create(Position position);
	
	//�޸ĵ������λ��
	void update(Position position);
	
	//ɾ���������λ��
	void delete(Position position);
	
	//��ѯ�������λ��
	Position query(int id);
	
	//��ѯ���е������λ��
	List<Position> queryList();
}
