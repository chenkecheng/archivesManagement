package com.archivesManagement.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Position implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;//定义id
	
	@Column(length =100)
	private String detail;//定义详细地址
	
	@OneToMany(cascade={CascadeType.REMOVE},mappedBy="position")
	private List<Archives> archives;//定义档案
	/*构造函数*/
	public Position(String detail){
		this.detail = detail;
	}
	/**默认的构造函数*/
	public Position(){
		
	}
	/**定义id相关属性
	 * */
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	/**定义详细地址的相关属性
	 * */
	public String getDetail(){
		return this.detail;
	}
	public void setDetail(String detail){
		this.detail = detail;
	}
	//设定档案
	public void setArchives(List<Archives> archives){
		this.archives = archives;
	}
	public List<Archives> getArchives(){
		return archives;
	}
}
