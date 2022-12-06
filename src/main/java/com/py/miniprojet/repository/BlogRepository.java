package com.py.miniprojet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.py.miniprojet.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog,Integer>{
//	Blog findByUser(String user);
}
