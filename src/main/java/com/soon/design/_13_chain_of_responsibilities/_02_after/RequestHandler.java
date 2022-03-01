package com.soon.design._13_chain_of_responsibilities._02_after;

import com.soon.design._13_chain_of_responsibilities._01_before.Request;

public abstract class RequestHandler {
    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if(nextHandler !=null) {
            nextHandler.handle(request);
        }
    }
}
