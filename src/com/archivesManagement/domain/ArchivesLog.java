package com.archivesManagement.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ArchivesLog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7452510455409483898L;

	/*定义id*/
	@Id
	@GeneratedValue
	private int id;
	/*定义档案的借阅日期*/
	@Column(length = 20)
	private String lendDate;
	/*定义档案的归还日期*/
	@Column(length = 20)
	private String returnDate;
	/*定义的借阅说明*/
	@Column(length = 500)
	private String remark;
	/*档案的借阅者*/
	@ManyToOne
	private User user;
	@ManyToOne
	private Archives archives;
	/*默认的构造函数*/
	public ArchivesLog(){
		
	}
	
	/*设定/获取id的相关属性
	 * */
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	/*设定/获取档案的借阅说明
	 * */
	public String getRemark(){
		return remark;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	/*设定/获取档案的借阅日期
	 * */
	public String getLendDate(){
		return lendDate;
	}
	public void setLendDate(String lendDate){
		this.lendDate = lendDate;
	}
	/*设定/获取档案的归还日期
	 * */
	public String getReturnDate(){
		return returnDate;
	}
	public void setReturnDate(String returnDate){
		this.returnDate = returnDate;
	}
	/**设定/获取档案
	 * */
	public Archives getArchives(){
		return archives;
	}
	public void setArchives(Archives archives){
		this.archives = archives;
	}
	/*设定用户
	 * */
	public User getUser(){
		return user;
	}
	public void setUser(User user){
		this.user = user;
	}
}
