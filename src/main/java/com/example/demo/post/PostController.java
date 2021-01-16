package com.example.demo.post;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.location.Location;
import com.example.demo.user.User;

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

}
