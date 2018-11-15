package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUser = new ArrayList<>();

    public Forum() {
        theForumUser.add(new ForumUser(1, "Jan Kowalski", 'M', 2001, 12, 12, 0));
        theForumUser.add(new ForumUser(2, "Ela Gabryś", 'F', 1960, 12, 12, 12));
        theForumUser.add(new ForumUser(3, "Jan Ziemba", 'M', 1980, 12, 12, 825));
        theForumUser.add(new ForumUser(4, "Jan Roman", 'M', 2005, 12, 12, 420));
        theForumUser.add(new ForumUser(5, "Jan Niziur", 'M', 1995, 12, 12, 0));
        theForumUser.add(new ForumUser(6, "Teresa Banach", 'F', 1991, 12, 12, 16));
        theForumUser.add(new ForumUser(7, "Jan Ramon", 'M', 2008, 12, 12, 19));
        theForumUser.add(new ForumUser(8, "Jan Spiżowy", 'M', 1965, 12, 12, 0));
        theForumUser.add(new ForumUser(9, "Anna Kowal", 'F', 2010, 12, 12, 0));
        theForumUser.add(new ForumUser(10, "Jan Lelek", 'M', 1950, 12, 12, 999));
        theForumUser.add(new ForumUser(11, "Jan Wrona", 'M', 1940, 12, 12, 6));
    }

    public List<ForumUser> getTheForumUserList() {
        return new ArrayList<>(theForumUser);
    }
}
