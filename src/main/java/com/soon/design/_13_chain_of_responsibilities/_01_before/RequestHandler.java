package com.soon.design._13_chain_of_responsibilities._01_before;

public class RequestHandler {

    public void handle(Request request) {
        System.out.println(request.getBody());
    }

}
