package com.soon.design._16_iterator._01_before;

import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴 게임");
        board.addPost("디자인 패턴 학습 고?");
        board.addPost("나는 디자인 패턴을 학습하고 있다.");

        //TODO. 들어간 순서대로 순회
        List<Post> posts = board.getPosts();
        for(int i=0; i<posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

        //TODO. 가장 최신 글 먼저 순회
        Collections.sort(posts, (p1,p2)-> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        for(int i=0; i< posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

    }

}
