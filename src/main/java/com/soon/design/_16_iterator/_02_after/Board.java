package com.soon.design._16_iterator._02_after;

import com.soon.design._16_iterator._01_before.Post;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {

    List<Post> posts = new ArrayList<>();

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    public List<Post> getPosts() {
        return posts;
    }

    public Iterator<Post> getRecentPostIterator() {
        return new RecentPostIterator(this.posts);
    }

}
