package com.app.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CommentRepository;
import com.app.dao.PostReposotory;
import com.app.pojos.Comment;
import com.app.pojos.Post;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	CommentRepository commentRepository;
	
	@Autowired
	PostReposotory postResposotory; 

	@Override
	public Comment addComment(Comment comment,Long id) {
		Post abc=postResposotory.findById(id).orElseThrow();
		comment.setPost(abc);
		comment.setPublishDate(Timestamp.valueOf(LocalDateTime.now()));
		return commentRepository.save(comment);
	}

	@Override
	public void deleteComment(Long id) {
		// TODO Auto-generated method stub
		commentRepository.deleteById(id);;
	}

	@Override
	public List<Comment> getComment(long id) {
		Post post=postResposotory.findById(id).orElseThrow();
		
		return commentRepository.findCommentByPost(post);
	}

	@Override
	public Comment findComment(long id) {
		// TODO Auto-generated method stub
		return commentRepository.getById(id);
	}
}
