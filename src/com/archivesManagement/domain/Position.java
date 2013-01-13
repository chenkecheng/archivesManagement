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
	private int id;//����id
	
	@Column(length =100)
	private String detail;//������ϸ��ַ
	
	@OneToMany(cascade={CascadeType.REMOVE},mappedBy="position")
	private List<Archives> archives;//���嵵��
	/*���캯��*/
	public Position(String detail){
		this.detail = detail;
	}
	/**Ĭ�ϵĹ��캯��*/
	public Position(){
		
	}
	/**����id�������
	 * */
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	/**������ϸ��ַ���������
	 * */
	public String getDetail(){
		return this.detail;
	}
	public void setDetail(String detail){
		this.detail = detail;
	}
	//�趨����
	public void setArchives(List<Archives> archives){
		this.archives = archives;
	}
	public List<Archives> getArchives(){
		return archives;
	}
}
