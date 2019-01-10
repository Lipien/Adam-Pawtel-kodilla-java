package com.kodilla.spring.forum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String username = "John Smith";

    @Autowired
    private ForumUser user;

    // public ForumUser() {
    // }

    public String getUsername() {
        return username;
    }
}
