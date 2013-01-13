package com.archivesManagement.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.jpa.support.JpaDaoSupport;

import com.archivesManagement.dao.ArchivesLogDAO;
import com.archivesManagement.domain.ArchivesLog;

public class ArchivesLogDAOImpl extends JpaDaoSupport implements ArchivesLogDAO{

	private String hql = "select a from ArchivesLog a";
	
	public void create(ArchivesLog archivesLog) {
		// TODO Auto-generated method stub
		this.getJpaTemplate().persist(archivesLog);
	}

	public void delete(ArchivesLog archivesLog) {
		// TODO Auto-generated method stub
		this.getJpaTemplate().remove(this.getJpaTemplate().merge(archivesLog));
	}

	@SuppressWarnings("unchecked")
	public List<ArchivesLog> query() {
		// TODO Auto-generated method stub
		List<ArchivesLog> list = new ArrayList<ArchivesLog>();
		list = this.getJpaTemplate().find(hql);
		return list;
	}

	public void update(ArchivesLog archivesLog) {
		// TODO Auto-generated method stub
		this.getJpaTemplate().merge(archivesLog);
	}

}
