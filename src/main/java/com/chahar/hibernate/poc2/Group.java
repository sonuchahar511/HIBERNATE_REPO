package com.chahar.hibernate.poc2;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Group {
	private Integer id;
	private String name;
	private Story[] stories;
	private List<Story> list_stories;
	private Set<Story> set_Stories;
	
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
	public List<Story> getList_stories() {
		return list_stories;
	}
	public void setList_stories(List<Story> list_stories) {
		this.list_stories = list_stories;
	}
	public Set<Story> getSet_Stories() {
		return set_Stories;
	}
	public void setSet_Stories(Set<Story> set_Stories) {
		this.set_Stories = set_Stories;
	}
	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", stories=" + Arrays.toString(stories) + ", list_stories="
				+ list_stories + ", set_Stories=" + set_Stories + "]";
	}
	
}
