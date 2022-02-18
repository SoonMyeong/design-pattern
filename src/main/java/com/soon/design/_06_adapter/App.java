package com.soon.design._06_adapter;

import com.soon.design._06_adapter.security.LoginHandler;
import com.soon.design._06_adapter.security.UserDetailsService;

public class App {

    public static void main(String[] args) {

        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("soon","soon");
        System.out.println(login);
    }
}
