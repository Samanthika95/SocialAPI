package com.example.demo.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
	
	@Autowired
	private PostService postservice;
	
	@RequestMapping(value = "/posts")
	public List<Post> getAllPosts(){
		return postservice.getAllPosts(); 
	}
	
	@RequestMapping(value = "/posts/{id}")
	public Post getPost(@PathVariable String id) {
		return postservice.getPost(id);	
	}
	@RequestMapping(value = "/posts" , method = RequestMethod.POST)
	public void addPost(@RequestBody Post post) {
		postservice.addPost(post);
	}
	
	@RequestMapping(value = "/posts/{id}", method = RequestMethod.PUT)
	public void updatePost(@RequestBody Post post, @PathVariable String id) {
		postservice.updatePost(post,id);
	}
	
	@RequestMapping(value = "/posts/{id}", method = RequestMethod.DELETE)
	public void deletePost(@PathVariable String id) {
		postservice.deletePost(id);
	}

}
