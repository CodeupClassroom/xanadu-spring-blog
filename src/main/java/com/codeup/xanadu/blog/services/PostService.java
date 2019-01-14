package com.codeup.xanadu.blog.services;

import com.codeup.xanadu.blog.models.Post;
import com.codeup.xanadu.blog.models.PostRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private PostRepository repo;


    public PostService(PostRepository repo) {
        this.repo = repo;
    }

    public List<Post> all() {
        return (List<Post>) repo.findAll();
    }

    public Post findOne(int id) {
        return repo.findOne(id);
    }

    public Post create(Post post) {
        repo.save(post);
        return post;
    }

    public Post edit(Post post) {
        return repo.save(post);
    }

    public void delete(Post post) {
         repo.delete(post);
    }

    private void createPosts() {
//        create(new Post("New Post 1", "lorem impsum dolor set amit"));
//        create(new Post("New Post 2", "lorem impsum dolor set amit"));
//        create(new Post("New Post 3", "lorem impsum dolor set amit"));
//        create(new Post("New Post 4", "lorem impsum dolor set amit"));
//        create(new Post("New Post 5", "lorem impsum dolor set amit"));
    }
}
