package com.app.service;


import java.util.List;

import com.app.pojos.Category;
import com.app.pojos.Post;

public interface PostService {


    public List<Post> findAll();
    
    public Post addPost(Post post, long id);
//    public Post addPosts(Post post);
//    
    public Post addPostByName(Post post, String name);

    public Post findById(Long id);
//    public List<Post> findByCategories(String categories);

    public void deleteById(Long id);

	public Post getPost(long id);
}