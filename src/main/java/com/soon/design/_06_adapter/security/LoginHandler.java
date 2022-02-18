package com.soon.design._06_adapter.security;

public class LoginHandler {

    UserDetailsService userDetailsServcie;

    public LoginHandler(UserDetailsService userDetailsService) {
        this.userDetailsServcie = userDetailsService;
    }

    public String login(String username, String password) {
        UserDetails userDetails = userDetailsServcie.loadUser(username);
        if(userDetails.getPassword().equals(password)) {
            return userDetails.getUsername() + " 로그인 성공";
        }else {
            throw new IllegalArgumentException();
        }
    }

}
