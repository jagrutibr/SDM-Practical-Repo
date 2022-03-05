package com.app.service;

import java.util.List;

import com.app.pojos.Comment;


public interface CommentService {

	public Comment addComment(Comment comment,Long id);
		
	public void deleteComment(Long id);

	public List<Comment> getComment(long id);
	
	public Comment findComment(long id);
	
  
}
