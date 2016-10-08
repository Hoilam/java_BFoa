package com.bf.po.module;

import java.io.Serializable;
import java.util.Set;

/**
 * ģ�����
 *  
 **/
public class Module implements Serializable {

	private int m_id;
	private String m_name;
	private String m_address;
	//�������ȥ��ʾ��ͼƬ
	private String m_path_c;
	//����뿪��ʾ��ͼƬ
	private String m_path_n;
	//ģ����
	private String m_sn;
	//�Ƿ���ʾ
	private int flag;
	//��ģ��
	private Module parent;
	//��ģ��
	private Set<Module> children;
	
	
	public String getM_path_n() {
		return m_path_n;
	}
	public void setM_path_n(String m_path_n) {
		this.m_path_n = m_path_n;
	}
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_address() {
		return m_address;
	}
	public void setM_address(String m_address) {
		this.m_address = m_address;
	}
	public String getM_path_c() {
		return m_path_c;
	}
	public void setM_path_c(String m_path_c) {
		this.m_path_c = m_path_c;
	}
	public String getM_sn() {
		return m_sn;
	}
	public void setM_sn(String m_sn) {
		this.m_sn = m_sn;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public Module getParent() {
		return parent;
	}
	public void setParent(Module parent) {
		this.parent = parent;
	}
	public Set<Module> getChildren() {
		return children;
	}
	public void setChildren(Set<Module> children) {
		this.children = children;
	}
	
	
	
}