package com.soon.design._16_iterator._01_before;

import java.util.ArrayList;
import java.util.List;

public class Board {

    List<Post> posts = new ArrayList<>();

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    public List<Post> getPosts() {
        return posts;
    }
}
