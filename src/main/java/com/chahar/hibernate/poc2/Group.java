package com.chahar.hibernate.poc2;

import java.util.Arrays;

public class Group {
	private Integer id;
	private String name;
	private Story[] stories;
	
	public Group() {}
	public Group(String name) {
		super();
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Story[] getStories() {
		return stories;
	}
	public void setStories(Story[] stories) {
		this.stories = stories;
	}
	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", stories=" + Arrays.toString(stories) + "]";
	}
	
}
