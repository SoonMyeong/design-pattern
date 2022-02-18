package com.soon.design._06_adapter.security;

public interface UserDetailsService {
   UserDetails loadUser(String username);
}
