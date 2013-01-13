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

	/*����id*/
	@Id
	@GeneratedValue
	private int id;
	/*���嵵���Ľ�������*/
	@Column(length = 20)
	private String lendDate;
	/*���嵵���Ĺ黹����*/
	@Column(length = 20)
	private String returnDate;
	/*����Ľ���˵��*/
	@Column(length = 500)
	private String remark;
	/*�����Ľ�����*/
	@ManyToOne
	private User user;
	@ManyToOne
	private Archives archives;
	/*Ĭ�ϵĹ��캯��*/
	public ArchivesLog(){
		
	}
	
	/*�趨/��ȡid���������
	 * */
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	/*�趨/��ȡ�����Ľ���˵��
	 * */
	public String getRemark(){
		return remark;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	/*�趨/��ȡ�����Ľ�������
	 * */
	public String getLendDate(){
		return lendDate;
	}
	public void setLendDate(String lendDate){
		this.lendDate = lendDate;
	}
	/*�趨/��ȡ�����Ĺ黹����
	 * */
	public String getReturnDate(){
		return returnDate;
	}
	public void setReturnDate(String returnDate){
		this.returnDate = returnDate;
	}
	/**�趨/��ȡ����
	 * */
	public Archives getArchives(){
		return archives;
	}
	public void setArchives(Archives archives){
		this.archives = archives;
	}
	/*�趨�û�
	 * */
	public User getUser(){
		return user;
	}
	public void setUser(User user){
		this.user = user;
	}
}
