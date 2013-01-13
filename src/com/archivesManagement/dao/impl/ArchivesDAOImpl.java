package com.archivesManagement.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.jpa.support.JpaDaoSupport;

import com.archivesManagement.dao.ArchivesDAO;
import com.archivesManagement.domain.Archives;

public class ArchivesDAOImpl extends JpaDaoSupport implements ArchivesDAO{

	private String hql = "select a from Archives a";
	
	public void create(Archives archives) {
		// TODO Auto-generated method stub
		this.getJpaTemplate().persist(archives);
	}

	public void delete(Archives archives) {
		// TODO Auto-generated method stub
		this.getJpaTemplate().remove(this.getJpaTemplate().merge(archives));
		
	}

	public Archives query(int id) {
		// TODO Auto-generated method stub
		Archives archives = this.getJpaTemplate().find(Archives.class,id);
		return archives;
	}

	@SuppressWarnings("unchecked")
	public List<Archives> queryList() {
		// TODO Auto-generated method stub
		List<Archives> list = new ArrayList<Archives>();
		list = this.getJpaTemplate().find(hql);
		return list;
	}

	public void update(Archives archives) {
		// TODO Auto-generated method stub
		this.getJpaTemplate().merge(archives);
	}

}
