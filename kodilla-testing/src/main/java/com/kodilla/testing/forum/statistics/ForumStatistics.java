package com.kodilla.testing.forum.statistics;

class ForumStatistics {

    private int usersCount;
    private int postCount;
    private int commentCount;

    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }


    public void calculateAdvStatistics(Statistics statistics) {

        usersCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();

        if (statistics.usersNames().size() != 0) {
            averagePostsPerUser = statistics.postsCount() / statistics.usersNames().size();
        } else averagePostsPerUser = 0;

        if (statistics.usersNames().size() != 0) {

            averageCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        } else averageCommentsPerUser = 0;

        if (statistics.postsCount() != 0) {
            averageCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
        } else averageCommentsPerPost = 0;
    }

    public void showStatistics() {
        System.out.println("Forum statistics: ");
        System.out.println("-> number of forum users: " + usersCount);
        System.out.println("-> number of posts: " + postCount);
        System.out.println("-> number of comments: " + commentCount);
        System.out.println("-> average number of posts per user: " + averagePostsPerUser);
        System.out.println("-> average number of comments per user: " + averageCommentsPerUser);
        System.out.println("-> average number of comments per post: " + averageCommentsPerPost);
    }


}
