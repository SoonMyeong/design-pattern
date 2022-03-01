package com.soon.design._13_chain_of_responsibilities._01_before;

public class AuthRequestHandler extends RequestHandler {

    public void handle(Request request) {
        System.out.println("인증 완료 되었는가?");
        super.handle(request);
    }

}
