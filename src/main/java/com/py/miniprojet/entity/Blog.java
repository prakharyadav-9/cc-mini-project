package com.py.miniprojet.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BLOG_TBL")
public class Blog {
	
	@Id
    @GeneratedValue
	private int id;
	private String userName;
	private String blogContent;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBlogContent() {
		return blogContent;
	}
	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}
	@Override
	public String toString() {
		return "Blog [id=" + id + ", userName=" + userName + ", blogContent=" + blogContent + "]";
	}
	
	
	
}
