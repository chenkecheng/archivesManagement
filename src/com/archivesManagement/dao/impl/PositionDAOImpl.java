package com.archivesManagement.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.jpa.support.JpaDaoSupport;

import com.archivesManagement.dao.PositionDAO;
import com.archivesManagement.domain.Position;


public class PositionDAOImpl extends JpaDaoSupport implements PositionDAO{

	private String hql = "select a from Position a";
	
	public void create(Position position) {
		// TODO Auto-generated method stub
		this.getJpaTemplate().persist(position);
		
	}

	public void delete(Position position) {
		// TODO Auto-generated method stub
		this.getJpaTemplate().remove(this.getJpaTemplate().merge(position));
		
	}

	public Position query(int id) {
		// TODO Auto-generated method stub
		Position position = this.getJpaTemplate().find(Position.class,id);
		return position;
	}

	@SuppressWarnings("unchecked")
	public List<Position> queryList() {
		// TODO Auto-generated method stub
		List<Position> list = new ArrayList<Position>();
		list = this.getJpaTemplate().find(hql);
		return list;
	}

	public void update(Position position) {
		// TODO Auto-generated method stub
		this.getJpaTemplate().merge(position);
	}

}
