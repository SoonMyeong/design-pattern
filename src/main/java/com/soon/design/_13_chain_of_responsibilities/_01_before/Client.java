package com.soon.design._13_chain_of_responsibilities._01_before;


//사용자가 핸들러를 반드시 알아야 한다는게 기능이 많아질 수록 복잡해 진다.
public class Client {

    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        RequestHandler requestHandler = new AuthRequestHandler();
        requestHandler.handle(request);
    }
}
