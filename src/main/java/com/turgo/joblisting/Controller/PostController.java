package com.turgo.joblisting.Controller;

import com.turgo.joblisting.Model.Post;
import com.turgo.joblisting.Services.PostServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

    @Autowired
    PostServices postServices;

    @GetMapping({"/posts", "/allPosts"})
    public List<Post> getAllPosts(){
        return postServices.getAllPost();
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post ){
        return postServices.addPost(post);
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){
        return postServices.searchPost(text);
    }
}
