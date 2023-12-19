package com.hamid.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamid.model.Comment;



public interface CommentRepo extends JpaRepository<Comment, Long> {

}
