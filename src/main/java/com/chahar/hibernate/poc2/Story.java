package com.chahar.hibernate.poc2;

public class Story {
	private int id;
	private String info;
	
	
	public Story() {}
	public Story(String info) {
		this.info = info;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "Story [id=" + id + ", info=" + info + "]";
	}
}
