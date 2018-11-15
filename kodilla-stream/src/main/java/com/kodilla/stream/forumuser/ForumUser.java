package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int qtyOfPublishedPosts;

    public ForumUser(final int userId, final String userName, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int qtyOfPublishedPosts) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.qtyOfPublishedPosts = qtyOfPublishedPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getQtyOfPublishedPosts() {
        return qtyOfPublishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" + "userId=" + userId + ", userName='" + userName + '\'' + ", sex=" + sex + ", dateOfBirth=" + dateOfBirth + ", qtyOfPublishedPosts=" + qtyOfPublishedPosts + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (getUserId() != forumUser.getUserId()) return false;
        if (getSex() != forumUser.getSex()) return false;
        if (getQtyOfPublishedPosts() != forumUser.getQtyOfPublishedPosts()) return false;
        if (!getUserName().equals(forumUser.getUserName())) return false;
        return getDateOfBirth().equals(forumUser.getDateOfBirth());
    }

    @Override
    public int hashCode() {
        int result = getUserId();
        result = 31 * result + getUserName().hashCode();
        result = 31 * result + (int) getSex();
        result = 31 * result + getDateOfBirth().hashCode();
        result = 31 * result + getQtyOfPublishedPosts();
        return result;
    }
}
