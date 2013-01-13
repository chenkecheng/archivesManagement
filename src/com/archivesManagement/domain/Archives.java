package com.archivesManagement.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Archives implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5852533915516568648L;
	/*定义id*/
	@Id
	@GeneratedValue
	private int id;
	/**定义档案名*/
	@Column(length= 100)
	private String name;
	/**定义档案的管理者*/
	@ManyToOne(fetch=FetchType.EAGER)
	private User manager;
	/**定义档案的存放位置*/
	@ManyToOne(fetch=FetchType.EAGER)
	private Position position;
	/**定义档案的简介*/
	@Column(length=500)
	private String remark;
	/**定义借阅记录*/
	@OneToMany(fetch=FetchType.EAGER,mappedBy="archives")
	private Set<ArchivesLog> archivesLog;
	/**默认的构造函数*/
	public Archives(){
		
	}
	
	/**设定id的相关属性
	 * */
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	//设定/获取档案的简介
	public String getRemark(){
		return remark;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	//设定/获取档案的名称
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	//设定/获取档案存放的位置
	public Position getPosition(){
		return position;
	}
	public void setPosition(Position position){
		this.position = position;
	}
	//设定/获取档案的借阅记录
	public Set<ArchivesLog> getArchivesLog(){
		return archivesLog;
	}
	public void setArchivesLog(Set<ArchivesLog> archivesLog){
		this.archivesLog = archivesLog;
	}
	//设定/获取档案的管理者
	public User getManeger(){
		return manager;
	}
	public void setManager(User manager){
		this.manager = manager;
	}
}
