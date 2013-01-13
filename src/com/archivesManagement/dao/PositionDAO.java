package com.archivesManagement.dao;

import java.util.List;

import com.archivesManagement.domain.Position;

public interface PositionDAO {
	//新增档案存放位置
	void create(Position position);
	
	//修改档案存放位置
	void update(Position position);
	
	//删除档案存放位置
	void delete(Position position);
	
	//查询档案存放位置
	Position query(int id);
	
	//查询所有档案存放位置
	List<Position> queryList();
}
