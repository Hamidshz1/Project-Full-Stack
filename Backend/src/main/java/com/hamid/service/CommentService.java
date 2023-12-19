package com.hamid.service;

import com.hamid.model.Post;

public interface CommentService {

	public void saveComment(Post post, String username, String content);

}
