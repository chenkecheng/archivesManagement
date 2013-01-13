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
	/*����id*/
	@Id
	@GeneratedValue
	private int id;
	/**���嵵����*/
	@Column(length= 100)
	private String name;
	/**���嵵���Ĺ�����*/
	@ManyToOne(fetch=FetchType.EAGER)
	private User manager;
	/**���嵵���Ĵ��λ��*/
	@ManyToOne(fetch=FetchType.EAGER)
	private Position position;
	/**���嵵���ļ��*/
	@Column(length=500)
	private String remark;
	/**������ļ�¼*/
	@OneToMany(fetch=FetchType.EAGER,mappedBy="archives")
	private Set<ArchivesLog> archivesLog;
	/**Ĭ�ϵĹ��캯��*/
	public Archives(){
		
	}
	
	/**�趨id���������
	 * */
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	//�趨/��ȡ�����ļ��
	public String getRemark(){
		return remark;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	//�趨/��ȡ����������
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	//�趨/��ȡ������ŵ�λ��
	public Position getPosition(){
		return position;
	}
	public void setPosition(Position position){
		this.position = position;
	}
	//�趨/��ȡ�����Ľ��ļ�¼
	public Set<ArchivesLog> getArchivesLog(){
		return archivesLog;
	}
	public void setArchivesLog(Set<ArchivesLog> archivesLog){
		this.archivesLog = archivesLog;
	}
	//�趨/��ȡ�����Ĺ�����
	public User getManeger(){
		return manager;
	}
	public void setManager(User manager){
		this.manager = manager;
	}
}
