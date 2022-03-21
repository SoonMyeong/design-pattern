package com.soon.design._16_iterator._02_after;

import com.soon.design._16_iterator._01_before.Board;
import com.soon.design._16_iterator._01_before.Post;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RecentPostIterator implements Iterator<Post> {

    private Iterator<Post> internalIterator;

    public RecentPostIterator(List<Post> posts) {
        List<Post> copyPosts = new ArrayList<>(posts);
        Collections.sort(copyPosts, (p1,p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        this.internalIterator = copyPosts.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.internalIterator.hasNext();
    }

    @Override
    public Post next() {
        return this.internalIterator.next();
    }
}
