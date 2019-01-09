package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String username = "John Smith";

    public ForumUser() {
    }

    public String getUsername() {
        return username;
    }
}
