package com.turgo.joblisting.Services;

import com.turgo.joblisting.Model.Post;
import com.turgo.joblisting.Repository.PostRepository;
import com.turgo.joblisting.Repository.SearchRepository;
import com.turgo.joblisting.Repository.SearchRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServices {
    @Autowired
    PostRepository postRepository;

    @Autowired
    SearchRepositoryImpl searchRepository;

    public List<Post> getAllPost(){
        return postRepository.findAll();
    }

    public List<Post> searchPost(String text){
        return searchRepository.findByText(text);
    }

    public Post addPost(Post post){
        return postRepository.save(post);
    }
}
