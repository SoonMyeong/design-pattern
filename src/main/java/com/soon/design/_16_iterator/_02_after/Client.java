package com.soon.design._16_iterator._02_after;

import com.soon.design._16_iterator._01_before.Post;

import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Board board = new Board();
        board.addPost("디자인 패턴 게임");
        Thread.sleep(100);
        board.addPost("선장님 디자인 패턴 학습 고?");
        Thread.sleep(100);
        board.addPost("지금 나는 디자인 패턴을 학습하고 있다.");


        //TODO. 가장 최신 글 먼저 순회
        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        while(recentPostIterator.hasNext()) {
            System.out.println(recentPostIterator.next().getTitle());
        }

        //TODO. 들어간 순서대로 순회
        List<Post> posts = board.getPosts();
        Iterator<Post> iterator = posts.iterator();
        System.out.println(iterator.getClass());

        for(int i=0; i< posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

    }

}
